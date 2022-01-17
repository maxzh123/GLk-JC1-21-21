package by.itAcademy.homeworks.regexp;

/**Введите с клавиатуры строку. Найти в строке не только запятые,
 *  но и другие знаки препинания. Подсчитать общее их количество.
 **/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
 //   public static void main(String[] args) throws IOException {
 //       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 //       System.out.println("Введите любую стоку:");
 //       String s = reader.readLine();
 //      string(s);
 //   }
    public static int string(String s){
        Pattern p = Pattern.compile("[\\p{Punct}]");//ищет все знаки пунктуации
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()){
            count++;
        }
      return count;
    }
}
