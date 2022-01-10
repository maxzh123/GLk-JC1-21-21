import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.List;

public class Bot2  extends TelegramLongPollingBot {

        public static void main(String[] args) {
            TelegramBotsApi telegramBotsApi = null;
            try {
                telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
                telegramBotsApi.registerBot(new Bot2());
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

        public void onUpdateReceived(Update update) {
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                switch (message.getText()) {
                    case "/start":
                        sendMsg(message, "Это команда старт!");
                        System.out.println(message.getText());
                        break;
                    case "Команда 1":
                        sendMsg(message, "Это команда 1");
                        System.out.println(message.getText());
                        break;
                    case "Команда 2":
                        sendMsg(message, "Это команда 2");
                        System.out.println(message.getText());
                        break;
                    default:
                        sendMsg(message, "Это дефолт! Брейк!");
                        System.out.println(message.getText());
                        break;
                }
            }
        }

        public void sendMsg (Message message, String text) {
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
            keyboardFirstRow.add("Команда 1");
            keyboardFirstRow.add("Команда 2");

            // Вторая строчка клавиатуры
            KeyboardRow keyboardSecondRow = new KeyboardRow();
            // Добавляем кнопки во вторую строчку клавиатуры
            keyboardSecondRow.add("Команда 3");
            keyboardSecondRow.add("Команда 4");

            // Добавляем все строчки клавиатуры в список
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
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
