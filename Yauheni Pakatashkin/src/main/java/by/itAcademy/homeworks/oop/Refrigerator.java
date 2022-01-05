package by.itAcademy.homeworks.oop;

public class Refrigerator extends AppliancesForHome implements СonnectToTheElectricNetwork{
    public int model;
    public Refrigerator(String manufacturer, String country, int power, String appointment, int model ) {
        super(manufacturer, country, power, appointment);
        this.model = model;
    }



    @Override
    public void On() {
        System.out.println("температура понижается, продукты хранятся");
    }

    @Override
    public void Off() {
        System.out.println("холодильник выключен продукты могут испортиться");

    }
}
