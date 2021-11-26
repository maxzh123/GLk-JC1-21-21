package by.itAcademy.homeworks.loops;



/**Задание12:
 Вычислить факториал целых чисел от 0 до 10 с помощью цикла while 2 вариант
  **/

public class CheckTask12_1 {
    public static void main(String[] args){
        int i=1;
        int f=1;
        //TODO Надо выносить :-)
        while (i!=11)//FIXME Magic Numbers  - прохая практика
        {
            f=f*i;
            System.out.println("Факториал " + i + " равен " + f);
            i++;
        }
    }
}



