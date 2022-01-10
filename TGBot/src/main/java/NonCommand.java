
/**
 * Обработка сообщения, не являющегося командой (т.е. обычного текста не начинающегося с "/")
 */
public class NonCommand {

    public String nonCommandExecute(Long chatId, String userName, String text) {
         if (text.equalsIgnoreCase("Погоду скажи")){
             return WeatherGetter.getWeather();
         }
         return "Простите,"+userName+" я не понимаю Вас.";
    }

}