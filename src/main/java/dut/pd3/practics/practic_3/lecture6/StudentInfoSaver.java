package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 43: запис імен студентів у students.txt (FileWriter, append = true)
class StudentInfoSaver {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("students.txt", true)) {
            String input;
            do {
                System.out.print("Введіть ім'я студента (stop для завершення): ");
                input = reader.readLine();
                if (!input.equalsIgnoreCase("stop")) {
                    fw.write(input + "\n"); // записати ім'я студента у файл
                }
            } while (!input.equalsIgnoreCase("stop"));
        } catch (IOException e) {
            System.out.println("Помилка запису: " + e.getMessage());
        }
    }
}
