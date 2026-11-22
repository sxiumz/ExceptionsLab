package dut.pd3.practics.practic_3.lecture6;

import java.nio.charset.Charset;

/**
 * У лекції використовується System.console().charset(). Якщо програма запущена з IDE,
 * System.console() дорівнює null і виникає NullPointerException. Цей метод повертає
 * кодування консолі, а якщо консолі немає, кодування за замовчуванням.
 */
class ConsoleCharset {
    static Charset get() {
        return System.console() != null ? System.console().charset() : Charset.defaultCharset();
    }
}
