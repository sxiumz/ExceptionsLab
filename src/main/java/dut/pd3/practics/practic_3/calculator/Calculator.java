package dut.pd3.practics.practic_3.calculator;

/** Калькулятор: базові арифметичні операції з перевіркою вхідних даних. */
public class Calculator {

    public double add(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a + b;
    }

    public double subtract(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a - b;
    }

    public double multiply(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a * b;
    }

    /** Ділення: на нуль кидає ArithmeticException, некоректні числа — InvalidInputException. */
    public double divide(double a, double b) throws InvalidInputException {
        validate(a, b);
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return a / b;
    }

    /** Квадратний корінь: від'ємне число — InvalidInputException. */
    public double sqrt(double a) throws InvalidInputException {
        validate(a);
        if (a < 0) {
            throw new InvalidInputException("Квадратний корінь з від'ємного числа (" + a + ") не існує");
        }
        return Math.sqrt(a);
    }

    /** NaN та нескінченність вважаються некоректними вхідними значеннями. */
    private static void validate(double... values) throws InvalidInputException {
        for (double v : values) {
            if (Double.isNaN(v) || Double.isInfinite(v)) {
                throw new InvalidInputException("Некоректне значення: " + v);
            }
        }
    }
}
