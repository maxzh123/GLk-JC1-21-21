package by.itAcademy.homeworks.exceptions;

// Написать собственное исключение от Exception.
// Сгенерировать код, который будет выбрасывать его и обрабатывать.
// Результат работы программы вывести на экран.

public class Task44 {
    static class Flower {
        boolean isWater;
        String name;

        Flower(String name) {
            this.name = name;
        }

        public void waterFlower() {
            System.out.println("Цветок полит");
            this.isWater = true;
        }

        public void bloomsFlower() throws MyException {
            if (isWater) {
                System.out.println("Цветок расцветет");
            } else {
                throw new MyException("Цветок не yt расцветет");
            }
        }

        public static void main(String[] args) {
            Flower cactus = new Flower("Кактус");
            //cactus.waterFlower();
            try {
                cactus.bloomsFlower();
            } catch (MyException e) {
                //System.out.println(e);
                System.out.println(e.getMessage());
            }


        }
    }
}