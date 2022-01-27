public class Chat {
    ChatState state=ChatState.START;

    public String processMessage(String text){
            switch (state){
                case START:
                    switch (text){
                        case "/start":
                            state=ChatState.INPUNT_NUMBER;
                            return "Введите свой табельный номер";
                    }
                return "Напишите одну из комманд";
                case INPUNT_NUMBER:
                    state=ChatState.START;
                    try {
                        int personnelNumber = Integer.parseInt(text);     //КАК СДЕЛАТЬ ИЗ ВВЕДЕННОГО НА ВОПРОС "Введите свой табельный номер" ЗНАЧЕНИЕ В INT?
                        return "Вы ввели "+personnelNumber+"/ Вы великолепны. продолжайте так-же.";
                    }catch (Exception e){
                        return "Вы даже номер ввести не можете. Вы омерзительны! не пишите мне больше :-)";
                    }

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
        return "прям не знаю что вас сказать.";
    }
}
