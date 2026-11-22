package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 30: читання файлу. Без аргументів читає source.txt.
class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            args = new String[] { "source.txt" }; // у лекції тут завершення з підказкою
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не знайдено.");
        } catch (IOException exc) {
            System.out.println("Помилка при читанні файлу.");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Помилка при закритті файлу.");
            }
        }
    }
}
