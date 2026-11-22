package dut.pd3.practics.practic_3.lecture6;

// Слайд 12: повторна генерація винятку
// (у лекції масиви однакової довжини, тому ArrayIndexOutOfBoundsException не виникає;
//  для наочності divisors на один елемент коротший, щоб повторна генерація спрацювала)
class UniversityProcessing {
    public static void genException() {
        int[] scores = { 10, 20, 30, 40, 50 };
        int[] divisors = { 2, 0, 5, 0 };

        for (int i = 0; i < scores.length; i++) {
            try {
                System.out.println(scores[i] + " / " + divisors[i] + " = " + scores[i] / divisors[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Ділення на нуль неможливо!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Елемент не знайдено в масиві!");
                throw exc; // Повторна генерація винятку
            }
        }
    }

    public static void main(String[] args) {
        try {
            genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Невиправна помилка - програма завершена.");
        }
    }
}
