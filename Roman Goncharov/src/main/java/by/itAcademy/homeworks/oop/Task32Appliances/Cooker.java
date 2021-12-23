package by.itAcademy.homeworks.oop.Task32Appliances;

public class Cooker extends AppForKitchen{

    public Cooker (int area, int height){
        super("Плита.");
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
        System.out.println("Работает на природном газе");
    }

    @Override
    public void action() {
        System.out.println("Чтобы включить газ нажмите 1:");;
        int number = console.nextInt();
        while (true) {
            if (number == 1) {
                System.out.println("Когда закончите готовку, нажмите 2 чтобы выключить газ");
                number = console.nextInt();
                if (number == 2) {
                    System.out.println("Вы выключили газ, приятного аппетита!");
                    break;
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
