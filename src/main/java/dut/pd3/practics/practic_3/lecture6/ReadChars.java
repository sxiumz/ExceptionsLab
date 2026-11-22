package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 39: читання символів з консолі
class ReadChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, ConsoleCharset.get()));
        char c;
        System.out.println("Вводите символи; для виходу введіть крапку.");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}
