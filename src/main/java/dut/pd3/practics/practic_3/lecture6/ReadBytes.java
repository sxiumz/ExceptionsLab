package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 27: читання байтів з консолі
class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Введіть кілька символів:");
        System.in.read(data); // Читання масиву байтів із клавіатури

        System.out.print("Ви ввели: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
