package dut.pd3.practics.practic_3.lecture6;

import java.util.Scanner;

// Слайд 6: try і кілька catch (NumberFormatException та Exception)
class TryCatchApplications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість заявок: ");
        String input = scanner.nextLine();
        try {
            int numberOfApplications = Integer.parseInt(input);
            System.out.println("Кількість заявок: " + numberOfApplications);
            // код для обробки заявок
        } catch (NumberFormatException e) {
            System.out.println("Помилка: некоректний формат даних. Введіть число.");
        } catch (Exception e) {
            System.out.println("Невідома помилка: " + e.getMessage());
        }
    }
}
