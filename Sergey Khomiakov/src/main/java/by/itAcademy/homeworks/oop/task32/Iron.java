package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.regexp.SimpleReader;

public class Iron extends AbstractAppliances{
    public Iron(String type, String model, String producer, int power){
        this.type = type;
        this.model = model;
        this.producer = producer;
        this.power = power;
    }

    @Override
    public void settingList() {
        System.out.println("Режим 1___________________________________Сухой");
        System.out.println("Режим 2_________________________________Влажный");
        System.out.println("Режим 3_____________________________Отпаривание");
        System.out.println("Режим 4____________________Системная информация");
        System.out.println("Режим 5______________________________Выключение");
        System.out.println("_______________________________________________");
        System.out.println();
    }

    @Override
    public void doYourJob() {
        if (isOn){
            switch (SimpleReader.readInt()){
                case 1:
                    System.out.println("Включен режим для сухой глажки\n");
                    break;
                case 2:
                    System.out.println("Включен режим для влажной глажки\n");
                    break;
                case 3:
                    System.out.println("Включен режим для отпаривания\n");
                    break;
                case 4:
                    System.out.println(getInfoAboutAppliances() + "\n");
                    break;
                case 5:
                    turnOff();
                    break;

            }
        }
    }


}
