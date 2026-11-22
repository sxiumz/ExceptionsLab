package dut.pd3.practics.practic_3.calculator;

/** Розбір введених рядків і виконання операції (відокремлено від Main, щоб це можна було тестувати). */
public abstract class CalculatorApp {

    /**
     * @throws NumberFormatException    якщо замість числа введено текст
     * @throws ArithmeticException      при діленні на нуль
     * @throws InvalidInputException    некоректні числа або невідома операція
     */
    public static double execute(Calculator calc, String first, String second, String operation)
            throws InvalidInputException {
        double a = parseNumber(first);
        double b = parseNumber(second);
        return switch (operation.trim().toLowerCase()) {
            case "+" -> calc.add(a, b);
            case "-" -> calc.subtract(a, b);
            case "*" -> calc.multiply(a, b);
            case "/" -> calc.divide(a, b);
            case "sqrt" -> calc.sqrt(a); // корінь береться з першого числа
            default -> throw new InvalidInputException("Невідома операція: '" + operation.trim() + "'");
        };
    }

    public static double parseNumber(String text) {
        return Double.parseDouble(text.trim().replace(',', '.'));
    }
}
