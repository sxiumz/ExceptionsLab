package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 31: копіювання файлу. Без аргументів копіює source.txt у copy.txt.
class CopyFile {
    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            args = new String[] { "source.txt", "copy.txt" }; // у лекції тут завершення з підказкою
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            System.out.println("Скопійовано: " + args[0] + " -> " + args[1]);
        } catch (IOException exc) {
            System.out.println("Помилка введення-виведення: " + exc);
        } finally {
            if (fin != null) fin.close();
            if (fout != null) fout.close();
        }
    }
}
