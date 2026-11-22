package dut.pd3.practics.practic_3.lecture6;

// Слайд 19: вкладені виключення (getCause)
class NestedExceptionExample {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                throw new RuntimeException("Помилка обчислення", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Основна причина: " + e.getCause());
        }
    }
}
