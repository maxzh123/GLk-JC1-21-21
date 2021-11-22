package by.itAcademy.homeworks.types;
/** Задание 1
 *
 * Задать промежуток времени в секундах в виде переменной. Следует вывести его на экран в виде часов минут и секунд, суток и недель.
 */


public class Task5 {
    public static void main(String[] args) {
        int s = 31600000;
        double day,hour,min,sec,week;
        week=(double)s/604800;
        day=(double)s/86400;
        hour=(day-(int)day)*24;
        min=(hour-(int)hour)*60;
        sec=(min-(int)min)*60;
        System.out.println((int)week + "недель " + (int)day + "дней " + (int)hour + "часов " + (int)min + "минут " + (int)sec + "секунд ");
    }
}
