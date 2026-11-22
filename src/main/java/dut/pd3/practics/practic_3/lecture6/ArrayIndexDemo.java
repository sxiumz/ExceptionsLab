package dut.pd3.practics.practic_3.lecture6;

class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] studentGrades = new int[5];
        try {
            int grade = studentGrades[5]; // спроба отримати 6-й елемент у масиві
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Помилка: некоректний індекс масиву.");
        }
    }
}
