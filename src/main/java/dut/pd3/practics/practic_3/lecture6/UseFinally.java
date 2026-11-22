package dut.pd3.practics.practic_3.lecture6;

import java.sql.SQLException;

// Слайд 14: блок finally
// (у лекції в try немає коду, що кидає SQLException, і компілятор це не пропустить,
//  тому помилка підключення імітується через throw)
class UseFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Відкриття з'єднання з базою даних...");
            throw new SQLException("Сервер бази даних недоступний");
        } catch (SQLException e) {
            System.out.println("Помилка при доступі до бази даних: " + e.getMessage());
        } finally {
            System.out.println("З'єднання з базою даних закрито.");
        }
    }
}
