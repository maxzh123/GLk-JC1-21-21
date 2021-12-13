package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.regexp.SimpleReader;

public class MicrowaveOven extends AbstractAppliances{

    public MicrowaveOven(String type, String model, String producer, int power){
        this.type = type;
        this.model = model;
        this.producer = producer;
        this.power = power;
    }


    @Override
    public void settingList() {
        System.out.println("Кнопка 1_____________________Старт(Возобновить)");
        System.out.println("Кнопка 2___________________________________Стоп");
        System.out.println("Кнопка 3________________________Режим разогрева");
        System.out.println("Кнопка 4_______________________Режим разморозки");
        System.out.println("Кнопка 5____________________________Режим гриля");
        System.out.println("Кнопка 6___________________Системная информация");
        System.out.println("Кнопка 7_____________________________Выключение");
        System.out.println("_______________________________________________");
        System.out.println();


    }

    @Override
    public void doYourJob() {
        if (isOn){
            switch (SimpleReader.readInt()){
                case 1:
                    System.out.println("Старт\n");
                    break;
                case 2:
                    System.out.println("Стоп\n");
                    break;
                case 3:
                    System.out.println("Идет процесс разогрева\n");
                    break;
                case 4:
                    System.out.println("Идет процесс разморозки\n");
                    break;
                case 5:
                    System.out.println("Идет процесс готовки в режиме гриль\n");
                    break;
                case 6:
                    System.out.println(getInfoAboutAppliances() + "\n");
                    break;
                case 7:
                    turnOff();
                    break;


            }
        }

    }




}
