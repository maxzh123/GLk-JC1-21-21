package by.itAcademy.homeworks.lamda;

import java.util.stream.Stream;

public class   Task63 {
    public static void main(String[] args) {

                Stream.of(new User("Сергей"),new User("Женя"),new User("Коля"),new User("Катя"),new User("Алина")
                ,new User("Игорь"),new User("Рома"),new User("Оля"))
                .peek(System.out::println)
                        .peek(User::printName)
                        //.peek(MyIface::doSomeStuff) //Ошибка в стриме не MyIface объекты
                .forEach(User::printStaticName);


    }
}
