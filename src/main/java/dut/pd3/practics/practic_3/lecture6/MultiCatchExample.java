package dut.pd3.practics.practic_3.lecture6;

// Слайд 16: множинне перехоплення через |
class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Генерує ArithmeticException
            char[] chars = {'A', 'B', 'C'};
            System.out.println(chars[5]); // Генерує ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехоплено виключення: " + e);
        } finally {
            System.out.println("Завершення роботи програми.");
        }
    }
}
