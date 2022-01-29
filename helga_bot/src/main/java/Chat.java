import org.postgresql.util.PGPropertyMaxResultBufferParser;

import java.sql.*;

public class Chat {
    ChatState state = ChatState.START;

    public String processMessage(String text) {
        switch (state) {
            case START:
                switch (text) {
                    case "/start":
                        state = ChatState.INPUNT_NUMBER;
                        return "Для получения сведений о зарплате введите свой табельный номер";
                }
            case INPUNT_NUMBER:
                state = ChatState.START;
                try {
                    int personnelNumber = Integer.parseInt(text);
                    // В организации 5 работников
                    if (personnelNumber > 0 && personnelNumber <= 5) {
                        state = ChatState.GET_INFORMATION;
                        return "Вы ввели " + personnelNumber + ". " + "Выберите нужную кнопку на клавиатуре";
                    } else {
                        state = ChatState.START;
                        return "Вы ввели неправильный табельный номер, попробуйте еще раз!";
                    }
                } catch (Exception e) {
                    state = ChatState.START;
                    return "Пока не работает";
                }
            case GET_INFORMATION:
                state = ChatState.INPUNT_NUMBER;
                try {
                    Connection conn = DriverManager.getConnection("jdbc:postgresql://194.195.241.62:5432/o_makarevich_db",
                            "o_makarevich", ":wmegk*");
                    PreparedStatement ps = conn.prepareStatement(
                            "SELECT Personnel_Number, Last_Name, First_Name, Patronymic, `Month`, Salary FROM PaySlips ps");
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {

                        /** Как здесь получить доступ к personnelNumber, который ввел пользователь в case INPUNT_NUMBER:, чтобы сравнить его с Personnel_Number из БД?*/

//                        if (personnelNumber == rs.getInt("Personnel_Number")) {
//                            System.out.print(rs.getString("Last_Name"));
//                            System.out.print("; ");
//                            System.out.print(rs.getString("First_Name"));
//                            System.out.print("; ");
//                            System.out.print(rs.getString("Patronymic"));
//                            System.out.print("; ");
//                            System.out.print(rs.getDate("Month"));
//                            System.out.print("; ");
//                            System.out.print(rs.getBigDecimal("Salary"));
//                        }
                    }
                    rs.close();
                    ps.close();
                } catch (SQLException e) {
                    return "Попробуйте позже";
                }

//            case "/start":
//                "Введите свой табельный номер");
////             // в организации  условно 300 работников
//                if (personnelNumber > 0 & personnelNumber < 300) {
//                    sendMsg(message, "Здравствуйте, уважаемый (-ая) ");
//                } else {
//                    sendMsg(message, "Табельный номер введен некорректно");
//                }

//            case "Получить расчетный лист за текущий месяц":
//                sendMsg(message, "!");
//                System.out.println(message.getText());
//                break;
//            case "Получить заработную плату за год":
//                sendMsg(message, "!!");
//                System.out.println(message.getText());
//                break;
//            case "Получить заработную плату за весь период работы":
//                sendMsg(message, "!!!");
//                System.out.println(message.getText());
//                break;
//            case "Получить сведения из трудового договора":
//                sendMsg(message, "!!!!");
//                System.out.println(message.getText());
//                break;
//            case "Получить сведения о текущем режиме работы":
//                sendMsg(message, "!!!!!");
//                System.out.println(message.getText());
//                break;
//            case "Получить сведения о трудовом отпуске":
//                sendMsg(message, "!!!!!!");
//                System.out.println(message.getText());
//                break;
//            default:
//                sendMsg(message, "Выберите вариант на клавиатуре");
//                System.out.println(message.getText());
//                break;
//        }

        }
        return "Приходите ещё";
    }
}
