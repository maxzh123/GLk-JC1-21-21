package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;

/** Задание 67
 * 1) Создать простейший сервис с методом, который выводит на экран текущуюдату.
 * 2) Сделайте его Singleton и используйте в основном телепрограммы.
 */

public class MySingletoneDate {
    private MySingletoneDate(){}

    private static MySingletoneDate instance;
    public static MySingletoneDate getInstance(){
        if(instance == null){
            instance = new MySingletoneDate();
        }
        return instance;
    }

    public LocalDate showCurrentDate(){
        return LocalDate.now();

    }
}
