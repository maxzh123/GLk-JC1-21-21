package by.itAcademy.homeworks.lamda;

// Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
//
//печатает на экран значения в дюймах;
//переводит значения в сантиметры;
//печатает на экран сумму в сантиметрах.

import java.util.ArrayList;

public class Task61 {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        ArrayList<Integer> arraylist = new ArrayList(b);
        for (int i = 0; i < b; i++) {
            arraylist.add(i, a);
            a++;
        }
        //System.out.println(arraylist.toString());
        System.out.println(newObj.test(arraylist));
    }

    public static UsedForTask61 newObj = arr -> {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                System.out.println(arr.get(i) + " дюймов, " + arr.get(i) * 2.54 + " сантиметров");
                sum = sum + arr.get(i);
            }
        }
        System.out.println("Сумма = " + sum * 2.54 + " сантиметров");
        return true;
    };
}

/** В интерфейсе UsedForTask61 и объекте newObj (Task61) Idea захотела, чтобы метод test был boolean, а я делала void. С void не работает, а почему - ?*/

/** ПОЧЕМУ НЕ РАБОТАЕТ ВОТ ТАК?*/
//    public static void main(String[] args) {
//        ArrayList<Integer> arrlist = new ArrayList<>();
//        arrlist.fillingArrayList(1, 20);                  ВОТ ЗДЕСЬ МНЕ НЕ ПОНЯТНО, есть ссылка на объект, есть метод, а как его применить - ? - что я неправильно делаю?
//    }
//
//    static ArrayList<Integer> fillingArrayList(int a, int b) {
//        ArrayList<Integer> arraylist = new ArrayList(b);
//        for (int i = 0; i < b; i++) {
//            arraylist.add(i, a);
//            a++;
//        }
//        System.out.println(arraylist.toString());
//        return arraylist;
//    }
