package dut.pd3.practics.practic_3.lecture6;

import java.io.*;

// Слайди 33-34: запис і читання примітивних типів (DataOutputStream / DataInputStream)
class DataStreamsDemo {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"))) {
            out.writeInt(1024);
            out.writeDouble(98.6);
            out.writeBoolean(true);
            System.out.println("Записано: 1024, 98.6, true");
        } catch (IOException e) {
            System.out.println("Помилка запису: " + e);
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream("data.bin"))) {
            int i = in.readInt();
            double d = in.readDouble();
            boolean b = in.readBoolean();
            System.out.println("Прочитано: " + i + ", " + d + ", " + b);
        } catch (IOException e) {
            System.out.println("Помилка читання: " + e);
        }
    }
}
