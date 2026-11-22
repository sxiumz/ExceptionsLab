package dut.pd3.practics.practic_3.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class MainTest {

    private String runWithInput(String input) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer, true, StandardCharsets.UTF_8);
        Main.run(new Scanner(input), out);
        return buffer.toString(StandardCharsets.UTF_8);
    }

    @Test
    void successfulRequestPrintsResultAndFinally() {
        String output = runWithInput("6\n3\n/\nq\n");
        Assertions.assertTrue(output.contains("Результат: 2.0"));
        Assertions.assertTrue(output.contains("Обробку запиту завершено."));
    }

    @Test
    void divisionByZeroShowsFriendlyMessage() {
        String output = runWithInput("10\n0\n/\nq\n");
        Assertions.assertTrue(output.contains("Ділення на нуль неможливе"));
        Assertions.assertTrue(output.contains("Обробку запиту завершено."), "finally має виконатись");
    }

    @Test
    void textInsteadOfNumberShowsFriendlyMessage() {
        String output = runWithInput("abc\n5\n+\nq\n");
        Assertions.assertTrue(output.contains("введено не число"));
        Assertions.assertTrue(output.contains("Обробку запиту завершено."));
    }

    @Test
    void negativeSqrtShowsCustomExceptionMessage() {
        String output = runWithInput("-4\n0\nsqrt\nq\n");
        Assertions.assertTrue(output.contains("Некоректні дані"));
    }

    @Test
    void programContinuesAfterErrorAndEndsOnInputEnd() {
        String output = runWithInput("x\n1\n+\n2\n3\n*\n");
        Assertions.assertTrue(output.contains("Результат: 6.0"), "після помилки програма має працювати далі");
        Assertions.assertTrue(output.contains("Роботу завершено."));
    }
}
