package by.itAcademy.sample;

/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает.
3. Переделать так, чтобы выводились ВСЕ даты года(с учетом того что в разных месяцах разное количество дней)
* */
public class Sample5 {
    public static void main (String[] arg){
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                if (i == 2 && j > 28){
                    continue;
                } else if ((i == 4 || i == 6 || i == 9 || i == 11) && (j > 30)){
                    continue;
                } else {
                    processNumber(i, j);
                }
            }
            System.out.println("---------------");
        }
    }

    private static void processNumber(int month, int day){
        if ((month > -1 && month < 10) && (day > 0 && day < 10)) {//подставляет ноль к числу и месяцу
            oneDigit(month, day);
        } else if ((month > 9) && (day > 0 && day < 10)){//подставляет ноль ТОЛЬКО к числу
            oneDigitDay(month, day);
        }else if ((month > 0 && month < 10) && (day > 9)){//подставляет ноль ТОЛЬКО к месяцу
            oneDigitMonth(month, day);
        } else {
            twoDigit(month, day);//не подставляет ноль к числу и месяцу
        }
    }


    private static void oneDigit(int dig, int xday){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("0" + xday + "/0" + dig + "/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void twoDigit(int dig, int xday){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println(xday + "/" + dig + "/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void oneDigitDay(int dig, int xday){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println("0" + xday + "/" + dig + "/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

    private static void oneDigitMonth(int dig, int xday){//определяем функцию не возвращающую результата и принимающую один целочисленный параметр
        System.out.println(xday + "/0" + dig + "/2021");//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }
}
