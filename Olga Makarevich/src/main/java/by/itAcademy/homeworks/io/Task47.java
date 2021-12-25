package by.itAcademy.homeworks.io;

// Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
// Вывести результат на экран.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader newBR = new BufferedReader(new FileReader("D:\\Оля\\Папка\\1\\4444.txt"));
            String a = newBR.readLine();
            while (a != null) {
                System.out.println(a);
                a = newBR.readLine();
            }

/**         int countPunctuationMark = 0;                  /// ЗДЕСЬ НЕ РАБОТАЕТ. НЕПОНЯТНО ПОЧЕМУ - Cannot invoke "java.lang.CharSequence.length()" because "this.text" is null
            Pattern p = Pattern.compile("[-.,;:!?]+");
            Matcher m = p.matcher(a);
            while(m.find()) {
                countPunctuationMark++;
            }
            System.out.println("Количество знаков препинания = " + countPunctuationMark); */

//            int countOfWords = 0;                         /// ТО ЖЕ
//            Pattern p = Pattern.compile("(\b)X*");
//            Matcher m = p.matcher(a);
//            while(m.find()) {
//                countOfWords++;
//            }
//            System.out.println("Количество слов = " + countOfWords);

        } catch (
                FileNotFoundException e) {
            System.out.println("File is not found");
        } finally {

        }

    }
}
