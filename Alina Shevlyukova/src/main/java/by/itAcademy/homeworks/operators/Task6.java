package by.itAcademy.homeworks.operators;

import javax.swing.*;

public class Task6 {
    public static void main(String[] args) {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Введите двухзначное число "));
        String text = number % 7 == 0 ? "есть 7" : " нет 7";
        JOptionPane.showMessageDialog(null, "Вы ввели число, в котором  " + text);
    }
}
