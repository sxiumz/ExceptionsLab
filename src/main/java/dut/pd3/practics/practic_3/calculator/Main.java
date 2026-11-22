package dut.pd3.practics.practic_3.calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run(new Scanner(System.in), System.out);
    }

    /** Діалог із користувачем. Приймає Scanner і PrintStream, тому легко тестується. */
    public static void run(Scanner in, PrintStream out) {
        Calculator calc = new Calculator();
        out.println("Калькулятор. Операції: +  -  *  /  sqrt (корінь з першого числа). Для виходу введіть q.");

        while (true) {
            out.print("\nВведіть перше число: ");
            if (!in.hasNextLine()) break;
            String first = in.nextLine();
            if (first.trim().equalsIgnoreCase("q")) break;

            out.print("Введіть друге число: ");
            if (!in.hasNextLine()) break;
            String second = in.nextLine();

            out.print("Введіть операцію: ");
            if (!in.hasNextLine()) break;
            String operation = in.nextLine();

            try {
                double result = CalculatorApp.execute(calc, first, second, operation);
                out.println("Результат: " + result);
            } catch (NumberFormatException e) {
                out.println("Помилка: введено не число. Використовуйте цифри, наприклад 12.5");
            } catch (ArithmeticException e) {
                out.println("Помилка обчислення: " + e.getMessage());
            } catch (InvalidInputException e) {
                out.println("Некоректні дані: " + e.getMessage());
            } finally {
                out.println("Обробку запиту завершено.");
            }
        }
        out.println("Роботу завершено.");
    }
}
