import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Helga_Bot extends TelegramLongPollingBot {

    private static ConcurrentHashMap<Long,Chat> storage=new ConcurrentHashMap<Long,Chat>();

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
        Chat ch=new Chat();
        Chat chold= storage.putIfAbsent(message.getChatId(),ch);
        if (chold!=null){ch=chold;}
        sendMsg(message,ch.processMessage(message.getText()));
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
        keyboardFirstRow.add("Получить сведения о зарплате за текущий месяц");

//        // Вторая строчка клавиатуры
//        KeyboardRow keyboardSecondRow = new KeyboardRow();
//        // Добавляем кнопки во вторую строчку клавиатуры
//        keyboardSecondRow.add("Получить заработную плату за год");
//
//        KeyboardRow keyboardThirdRow = new KeyboardRow();
//        keyboardThirdRow.add("Получить заработную плату за весь период работы");
//
//        KeyboardRow keyboardFourthdRow = new KeyboardRow();
//        keyboardFourthdRow.add("Получить сведения из трудового договора");
//
//        KeyboardRow keyboardFifthhdRow = new KeyboardRow();
//        keyboardFifthhdRow.add("Получить сведения о текущем режиме работы");
//
//        KeyboardRow keyboardSixthhdRow = new KeyboardRow();
//        keyboardSixthhdRow.add("Получить сведения о трудовом отпуске");

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
//        keyboard.add(keyboardSecondRow);
//        keyboard.add(keyboardThirdRow);
//        keyboard.add(keyboardFourthdRow);
//        keyboard.add(keyboardFifthhdRow);
//        keyboard.add(keyboardSixthhdRow);

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