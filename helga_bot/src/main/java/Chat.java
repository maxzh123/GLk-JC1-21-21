import java.sql.*;

public class Chat {
    ChatState state = ChatState.START;
    // А вот так мы можем сохранить номер. т.е мы просто расширяем состояние. ведь у нас объект чат уникален для каждого чата.
    private long personnelNumber;

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
                    // А вот так мы можем сохранить номер. т.е мы просто расширяем состояние. ведь у нас объект чат уникален для каждого чата.
                    this.personnelNumber = Long.parseLong(text);

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
                state = ChatState.GET_INFORMATION;
                Employe emp = ChatDao.getEmployeByNum(this.personnelNumber);
                return "Заработная плата " + emp.getFirstName() +" " + emp.getPatronymic() +" "+ emp.getLastName() + " составляет "
                        +emp.getSalary() + " рублей";
        }

        // Тут работайте дальше
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

        return "Приходите ещё";
    }
}
