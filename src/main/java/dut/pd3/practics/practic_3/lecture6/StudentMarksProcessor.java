package dut.pd3.practics.practic_3.lecture6;

// Слайд 8: ділення на нуль всередині циклу, програма продовжує роботу
class StudentMarksProcessor {
    public static void main(String[] args) {
        int[] marks = { 50, 75, 100, 0, 85 };
        int[] totalMarks = { 10, 0, 25, 100, 5 };

        for (int i = 0; i < marks.length; i++) {
            try {
                System.out.println("Результат: " + marks[i] + " / " + totalMarks[i] + " = " + marks[i] / totalMarks[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Ділення на нуль неможливо!");
            }
        }
    }
}
