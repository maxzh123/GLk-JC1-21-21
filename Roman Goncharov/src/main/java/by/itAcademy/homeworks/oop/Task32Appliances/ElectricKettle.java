package by.itAcademy.homeworks.oop.Task32Appliances;

public class ElectricKettle extends AppForKitchen{

    @Override
    public String getName() {
        name = "Электрочайник.";
        return name;
    }

    public ElectricKettle (int area, int height){
        this.area = area;
        this.height = height;
    }

    @Override
    public String description() {
        description = "Площадь: " + area + " кв.см. " + "Высота: " + height + " см.";
        return description;
    }

    @Override
    public void action() {
        System.out.println("Выберите до какой температуры нагревать воду(70,90 градусов)");
        boolean bool = true;
        while(bool) {
            switch (console.nextInt()) {
                case 70:
                    System.out.println("Вода нагрета до температуры 70 градусов.");
                    System.out.println("Идеальная температура для заваривания зеленого чая. Приятного чаепития!");
                    bool = false;
                    break;
                case 90:
                    System.out.println("Вода нагрета до температуры 90 градусов.");
                    System.out.println("Идеальная температура для заваривания черного чая. Приятного чаепития!");
                    bool = false;
                    break;
                default:
                    System.out.println("Ошибка. Попробуйте снова.");
                    break;
            }
        }
    }

    @Override
    public void run(){
        System.out.println(getName() + description());
        isOn();
        action();
        isOff();
    }
}
