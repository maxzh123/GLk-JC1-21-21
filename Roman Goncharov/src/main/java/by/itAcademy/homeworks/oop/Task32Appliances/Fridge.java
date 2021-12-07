package by.itAcademy.homeworks.oop.Task32Appliances;

public class Fridge extends AppForKitchen{

    @Override
    public String getName() {
        name = "Холодильник.";
        return name;
    }

    public Fridge (int area, int height){
        this.area = area;
        this.height = height;
    }

    @Override
    public String description() {
        description = "Площадь: " + area + " кв.см. " + "Высота: " + height + " см.";
        return description;
    }

    @Override
    public void isOn() {
        System.out.println("Подключен к электросети на постоянной основе");
    }

    @Override
    public void action() {
        System.out.println("Чтобы открыть холодильник нажмите 1:");;
        int number = console.nextInt();
        while (true) {
            if (number == 1) {
                System.out.println("Вы открыли холодильник. Чтобы положить продукты нажмите 2");
                number = console.nextInt();
                if (number == 2) {
                    System.out.println("Поздравляем. Вы положили продукты в холодильник, теперь с ними всё будет в порядке");
                    System.out.println("Не забудьте закрыть холодильник. Нажав 3");
                    number = console.nextInt();
                    if (number == 3) {
                        System.out.println("Вы удачно закрыли холодильник. Хорошего дня!");
                        break;
                    }
                }
            }
            System.out.println("Ошибка. Попробуйте снова");
            number = console.nextInt();
        }
    }

    @Override
    public void run(){
        System.out.println(getName() + description());
        isOn();
        action();
    }
}
