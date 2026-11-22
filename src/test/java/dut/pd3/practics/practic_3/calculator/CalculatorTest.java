package dut.pd3.practics.practic_3.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void addSubtractMultiplyDivide() throws InvalidInputException {
        Assertions.assertEquals(5.0, calc.add(2, 3));
        Assertions.assertEquals(-1.0, calc.subtract(2, 3));
        Assertions.assertEquals(6.0, calc.multiply(2, 3));
        Assertions.assertEquals(2.5, calc.divide(5, 2));
    }

    @Test
    void divisionByZeroThrowsArithmeticException() {
        ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        Assertions.assertTrue(e.getMessage().contains("нуль"));
    }

    @Test
    void zeroDividedByNumberIsZero() throws InvalidInputException {
        Assertions.assertEquals(0.0, calc.divide(0, 5));
    }

    @Test
    void nanThrowsInvalidInputException() {
        Assertions.assertThrows(InvalidInputException.class, () -> calc.add(Double.NaN, 1));
        Assertions.assertThrows(InvalidInputException.class, () -> calc.subtract(1, Double.NaN));
        Assertions.assertThrows(InvalidInputException.class, () -> calc.multiply(Double.NaN, Double.NaN));
        Assertions.assertThrows(InvalidInputException.class, () -> calc.divide(Double.NaN, 1));
    }

    @Test
    void infinityThrowsInvalidInputException() {
        Assertions.assertThrows(InvalidInputException.class, () -> calc.add(Double.POSITIVE_INFINITY, 1));
        Assertions.assertThrows(InvalidInputException.class, () -> calc.divide(1, Double.NEGATIVE_INFINITY));
    }

    @Test
    void sqrtOfNegativeThrowsInvalidInputException() {
        InvalidInputException e = Assertions.assertThrows(InvalidInputException.class, () -> calc.sqrt(-4));
        Assertions.assertTrue(e.getMessage().contains("від'ємного"));
    }

    @Test
    void sqrtOfPositiveAndZero() throws InvalidInputException {
        Assertions.assertEquals(3.0, calc.sqrt(9));
        Assertions.assertEquals(0.0, calc.sqrt(0));
    }
}
