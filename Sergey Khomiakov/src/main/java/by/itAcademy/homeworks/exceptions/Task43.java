package by.itAcademy.homeworks.exceptions;

/**> Задание 43
 * 1) Написать код, который выбрасывает NullPointerException.
 * 2) Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание
 * данного исключения.
 */

public class Task43 {
    public static void main(String[] args) {
        Object obj = null;
        try{
            obj.hashCode();
        } catch (NullPointerException ex){
            System.out.println("Поздравляю, вы словили NullPointerException.");
            System.out.println("Проверьте объект, из которого вы вызываете метод. Скорее всего он ссылается на пустоту.");
        }

    }


}
