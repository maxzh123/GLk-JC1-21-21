package by.itAcademy.homeworks.objects;

import java.util.Scanner;

/** Создать класс описывающие Банкомат. Набор купюр, находящихся в
 банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
 снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 значение (операция удалась или нет). При снятии денег метод должен выводить на
 экран каким количеством купюр и какого номинала выдается сумма. Создать
 конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
 усмотрение.
 */

public class SimpleATM {
    private int multiplyOf20;
    private int multiplyOf50;
    private int multiplyOf100;
    private int a, b;

    public SimpleATM(int multiplyOf20, int multiplyOf50, int multiplyOf100) {

        this.multiplyOf20 = multiplyOf20;
        this.multiplyOf50 = multiplyOf50;
        this.multiplyOf100 = multiplyOf100;

    }

    public void addMoneyToATM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загрузите купюры размерностью 20");
        int value1 = scanner.nextInt();
        System.out.println("Загрузите купюры размерностью 50");
        int value2 = scanner.nextInt();
        System.out.println("Загрузите купюры размерностью 100");
        int value3 = scanner.nextInt();

            if (value1<0 || value2<0 || value3<0){
                System.out.println("Вы не могли загрузить купюры размерностью меньше 0");
            } else {
                multiplyOf20 += value1;
                multiplyOf50 += value2;
                multiplyOf100 += value3;
                System.out.println("Вы успешно загрузили " + value1 + " купюр(ы) размерностью 20х, " +
                        value2 + " купюр(ы размерностью 50х и " + value3 + " купюр(ы) размерностью 100х. Спасибо, что " +
                        "воспользовались услугами нашего банка");
            }
       }

    public void getSomeMoneyFromATM() {

        Scanner scanner = new Scanner(System.in);
        int sumOfMoney = scanner.nextInt();

        int totalOfMoney = multiplyOf20 * 20 + multiplyOf50 * 50 + multiplyOf100 * 100;
        if (totalOfMoney >= sumOfMoney && sumOfMoney>0) {
            if (sumOfMoney / 100 >= multiplyOf100) {
                sumOfMoney = sumOfMoney - multiplyOf100 * 100;
                a = multiplyOf100;
                multiplyOf100 -= a;
            }else {a = multiplyOf100;
                multiplyOf100 -= sumOfMoney/100;
                a -= multiplyOf100;
                sumOfMoney%=100;
            }
             get50(sumOfMoney);

        } else {
            System.out.println("Операция завершилась неудачно");
        }
    }

    public void get50(int sum) {

        if (sum / 50 >= multiplyOf50) {
            sum = sum - multiplyOf50 * 50;
            b = multiplyOf50;
            multiplyOf50 -=b;
        } else {
            b = multiplyOf50;
            multiplyOf50 -= sum / 50;
            b -= multiplyOf50;
            sum %= 50;
        }
         get20(sum);
    }

    public void get20(int summm) {

        if (summm / 20 <= multiplyOf20 && summm % 20 == 0 ) {
            multiplyOf20 -= summm / 20;
            System.out.println("Вы получили " + a + " x 100$ " + b + " x 50$ " + summm / 20 + " x 20$");
        } else {
            System.out.println("Операция завершилась неудачно.");
        }
    }

}