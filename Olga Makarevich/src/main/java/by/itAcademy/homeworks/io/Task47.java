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

           /* BufferedReader newBR = null; // Создаём объект
            try { // Пытаемся прочитать файл через потоки
                newBR = new BufferedReader(new FileReader(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//TextFile47"));
                String a = newBR.readLine();
                int countPunctuationMark = 0;
                Pattern p = Pattern.compile("[-.,;:!?]+");
                while (a != null) {      // Первый цикл, где мы проходимся по строке
                    System.out.println(a);
                    Matcher m = p.matcher(a);
                    while (m.find()) { // Второй цикл для  поиска в строке  знаков
                        countPunctuationMark++; В этой строке сразу ищешь знаки препинания.
                    }
                    a = newBR.readLine(); // Переходишь на следующую строку
                }
                System.out.println("Количество знаков препинания = " + countPunctuationMark);
            } catch (IOException e){
                e.printStackTrace();
            } finally { // Если всё получилось, закрываем поток.
                if(newBR != null)    Если файл не найден, мы сюда не попадём, поток не открыт его не нужно закрывать                                                   // его не нужно закрывать
                    newBR.close();
            }*/

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
