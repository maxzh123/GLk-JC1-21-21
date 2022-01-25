import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import static java.lang.Integer.parseInt;


public class Helga_Bot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        TelegramBotsApi telegramBotsApi = null;
        try {
            telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Helga_Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotToken() {
        return Config.BOT_TOKEN;
    }

    @Override
    public String getBotUsername() {
        return Config.BOT_NAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        switch (message.getText()) {
            case "/start":
                sendMsg(message, "Введите свой табельный номер");
                int personnelNumber = Integer.parseInt(update.getMessage().getText());     //КАК СДЕЛАТЬ ИЗ ВВЕДЕННОГО НА ВОПРОС "Введите свой табельный номер" ЗНАЧЕНИЕ В INT?
//             // в организации  условно 300 работников
             if (personnelNumber > 0 & personnelNumber < 300) {
                    sendMsg(message, "Здравствуйте, уважаемый (-ая) ");
                } else {
                    sendMsg(message, "Табельный номер введен некорректно");
                }

            case "Получить расчетный лист за текущий месяц":
                sendMsg(message, "!");
                System.out.println(message.getText());
                break;
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
            default:
                sendMsg(message, "Выберите вариант на клавиатуре");
                System.out.println(message.getText());
                break;
        }
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add("Получить расчетный лист за текущий месяц");

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add("Получить заработную плату за год");

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add("Получить заработную плату за весь период работы");

        KeyboardRow keyboardFourthdRow = new KeyboardRow();
        keyboardFourthdRow.add("Получить сведения из трудового договора");

        KeyboardRow keyboardFifthhdRow = new KeyboardRow();
        keyboardFifthhdRow.add("Получить сведения о текущем режиме работы");

        KeyboardRow keyboardSixthhdRow = new KeyboardRow();
        keyboardSixthhdRow.add("Получить сведения о трудовом отпуске");

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthdRow);
        keyboard.add(keyboardFifthhdRow);
        keyboard.add(keyboardSixthhdRow);

        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}