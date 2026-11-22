package dut.pd3.practics.practic_3.lecture6;

// Слайд 20: використання власного виключення
class CustomExceptDemo {
    public static void main(String[] args) {
        int numer[] = { 4, 8, 15, 32, 64 };
        int denom[] = { 2, 0, 4, 4, 8 };
        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0)
                    throw new NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Виняток: " + e);
            } catch (NonIntResultException e) {
                System.out.println(e);
            }
        }
    }
}
