package dut.pd3.practics.practic_3.lecture6;

// Слайд 7: неперехоплений виняток — програма завершується аварійно (це очікувано)
class UniversityProcessor {
    public static void main(String[] args) {
        int[] grades = new int[5];
        System.out.println("Перед генерацією винятку.");
        grades[8] = 95; // Викликає ArrayIndexOutOfBoundsException
        System.out.println("Цей рядок не буде виконаний.");
    }
}
