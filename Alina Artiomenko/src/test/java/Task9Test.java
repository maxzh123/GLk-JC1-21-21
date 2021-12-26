import by.itAcademy.homeworks.operators.Task9;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Task9Test {

    //Это тоже самое, но с несколькими параметрами
    @ParameterizedTest //указываем, что метод является параметезированным
    @CsvSource({"28, 02, 2021, false, 'Завтра: 01.03.2021'","31, 12, 1998, false,'Завтра: 01.01.1999'", "28, 02, 1964, true, 'Завтра: 29.02.1964'"})
    /* ^ задаем аргументы "день1, месяц1, год1, вискокосныйЛиГод1, 'результат1'",
                          "день2, месяц2, год2, вискокосныйЛиГод2, 'результат2'",
                          "день3, месяц3, год3, вискокосныйЛиГод3, 'результат3'"
     */
    //перечисляем параментры в той последовательности, в которой мы указывали аргументы выше
    void nextDate(int day, int month, int year, boolean leapYear, String result) {//в этом методе проверям соотвествует ли ожидаемый результат,
                                                                                  //с результатом, который нам вернул проверяемый метод
        assertEquals(result, Task9.nextDate(day, month, year, leapYear));
    }


/* Тесты нужны для того, что бы проверить корректность работы какого-либо метода
   Для примера, у нас есть метод nextDate в задаче Task9, которому в качестве параметров передаются:
        день (int)
        месяц (int)
        год (int)
        является ли заданный год високосный (boolean).
   А он в свою очередь возвращает строку, которая указывает какой завтра день.
    ------------------------
    public static String nextDate(int day, int month, int year, boolean leapYear){
        return nextDay = String.format("Завтра: " + "%02d" + "." + "%02d" + "." + "%04d",day,month,year);
    }
    ------------------------
*/
    @Test //указываем, что данный метод является тестом
    void testNextDate() {
        //Следовательно, если мы передати проверяемому мотоду nextDate следующие аргументы:
        int thisDay = 26; //день
        int thisMonth = 12; //месяц
        int thisYear = 2021; //год
        boolean thisYearIsLeap = false; //високосный год или нет
        //то такой результат нам ДОЛЖЕН вернуться:
        String result01 = "Завтра: 27.12.2021";
        assertEquals(result01, Task9.nextDate(thisDay, thisMonth, thisYear, thisYearIsLeap));
        //assertEquals - сравнивает результат, который должен получится, с результатом, который получился у вызванного метода
        //
}

}