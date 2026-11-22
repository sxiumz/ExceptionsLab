package dut.pd3.practics.practic_3.lecture6;

// Слайд 20: власне виключення
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат " + n + " / " + d + " не є цілим числом.";
    }
}
