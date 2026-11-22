package dut.pd3.practics.practic_3.lecture6;

import java.sql.SQLException;

// Слайд 15: ключове слово throws
class DatabaseManager {
    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (SQLException e) {
            System.out.println("Помилка підключення до бази даних.");
        }
    }

    public static void connectToDatabase() throws SQLException {
        // Код, що може викликати SQLException (тут імітується)
        throw new SQLException("Не вдалося підключитися");
    }
}
