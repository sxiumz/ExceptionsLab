package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайд 41: консольний вивід через PrintWriter
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Використання PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " дорівнює " + (i + d));
    }
}
