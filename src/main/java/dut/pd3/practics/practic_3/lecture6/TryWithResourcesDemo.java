package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 32: автоматичне закриття файлу (try-with-resources), файл myfile.txt
class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("myfile.txt")) {
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException exc) {
            System.out.println("Помилка введення-виведення: " + exc);
        }
    }
}
