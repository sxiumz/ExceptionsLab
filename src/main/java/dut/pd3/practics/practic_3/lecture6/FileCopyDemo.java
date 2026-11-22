package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 29: копіювання файлу байтовими потоками (source.txt -> destination.txt)
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("source.txt");
        FileOutputStream out = new FileOutputStream("destination.txt");

        int byteData;
        while ((byteData = in.read()) != -1) {
            out.write(byteData); // Копіювання байтів із файлу
        }

        in.close();
        out.close();
        System.out.println("Файл source.txt скопійовано в destination.txt");
    }
}
