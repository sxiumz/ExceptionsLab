package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 40: читання рядків з консолі
class ReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, ConsoleCharset.get()));
        String str;
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершення введіть 'stop'.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
