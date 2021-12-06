package by.itAcademy.homeworks.objects;


import java.util.Scanner;

/**Задание 25
 * 1. Создать класс, описывающий банкомат
 * 2. Набор купюр задаётся 3-мя свойствами
 *      - количество купюр номиналом 20, 50, 100
 * 3. Конструктор с тремя параметрами - кол-во купюр
 * 4. Сделать методы
 *      - добавление денег в банкомат
 *      - снятие денег (при снятии выводить кол-во купюр и номанал выдачи суммы)
 * !!! С клавиатуры передаётся сумма денег --> на экране булевое значение (удалась операция или нет)
 * */

public class Task25 {
    public static void main(String[] args){
        ATM atm01 = new ATM(25,10,2);
        System.out.println("На балансе: " + atm01.getMoneyBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Сумма для снятия: ");
        int getMoney = input.nextInt();
        System.out.println(atm01.enoughMoney(getMoney));
        System.out.println(atm01.withdrawalMoney(getMoney));
        System.out.println("На балансе: " + atm01.getMoneyBalance());
        System.out.println();

        System.out.print("Сумма для зачисления: ");
        int addMoney = input.nextInt();
        System.out.println(atm01.enoughMoney(getMoney));
        atm01.addMoney(addMoney);
        System.out.println("На балансе: " + atm01.getMoneyBalance());
    }
}
