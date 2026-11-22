package dut.pd3.practics.practic_3.lecture6;

// Слайд 28: запис байта в консоль
class WriteDemo {
    public static void main(String[] args) {
        int b = 'X'; // Символ 'X'
        System.out.write(b); // Запис байта
        System.out.write('\n'); // Новий рядок
        System.out.flush();
    }
}
