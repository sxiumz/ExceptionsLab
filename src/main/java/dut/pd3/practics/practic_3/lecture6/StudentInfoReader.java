package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 44: читання students.txt (FileReader + BufferedReader)
class StudentInfoReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // вивести рядок з файлу
            }
        } catch (IOException e) {
            System.out.println("Помилка читання: " + e.getMessage());
        }
    }
}
