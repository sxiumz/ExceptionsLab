package dut.pd3.practics.practic_3.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorAppTest {
    private final Calculator calc = new Calculator();

    @Test
    void executesAllOperations() throws InvalidInputException {
        Assertions.assertEquals(7.0, CalculatorApp.execute(calc, "3", "4", "+"));
        Assertions.assertEquals(-1.0, CalculatorApp.execute(calc, "3", "4", "-"));
        Assertions.assertEquals(12.0, CalculatorApp.execute(calc, "3", "4", "*"));
        Assertions.assertEquals(0.75, CalculatorApp.execute(calc, "3", "4", "/"));
        Assertions.assertEquals(3.0, CalculatorApp.execute(calc, "9", "0", "sqrt"));
    }

    @Test
    void acceptsCommaAsDecimalSeparator() throws InvalidInputException {
        Assertions.assertEquals(4.0, CalculatorApp.execute(calc, "1,5", "2,5", "+"));
    }

    @Test
    void stringInsteadOfNumberThrowsNumberFormatException() {
        Assertions.assertThrows(NumberFormatException.class, () -> CalculatorApp.execute(calc, "abc", "2", "+"));
        Assertions.assertThrows(NumberFormatException.class, () -> CalculatorApp.execute(calc, "2", "два", "*"));
        Assertions.assertThrows(NumberFormatException.class, () -> CalculatorApp.execute(calc, "", "2", "-"));
    }

    @Test
    void divisionByZeroFromText() {
        Assertions.assertThrows(ArithmeticException.class, () -> CalculatorApp.execute(calc, "10", "0", "/"));
    }

    @Test
    void unknownOperationThrowsInvalidInputException() {
        InvalidInputException e = Assertions.assertThrows(InvalidInputException.class,
                () -> CalculatorApp.execute(calc, "1", "2", "%"));
        Assertions.assertTrue(e.getMessage().contains("Невідома операція"));
    }

    @Test
    void textNaNAndInfinityAreInvalid() {
        // Double.parseDouble("NaN") та "Infinity" коректно розбираються, але калькулятор їх відхиляє
        Assertions.assertThrows(InvalidInputException.class, () -> CalculatorApp.execute(calc, "NaN", "1", "+"));
        Assertions.assertThrows(InvalidInputException.class, () -> CalculatorApp.execute(calc, "Infinity", "1", "*"));
    }

    @Test
    void negativeSqrtFromText() {
        Assertions.assertThrows(InvalidInputException.class, () -> CalculatorApp.execute(calc, "-9", "0", "sqrt"));
    }
}
