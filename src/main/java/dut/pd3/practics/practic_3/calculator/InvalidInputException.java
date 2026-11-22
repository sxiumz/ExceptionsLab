package dut.pd3.practics.practic_3.calculator;

/** Власне (перевірене) виключення для некоректних вхідних даних калькулятора. */
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
