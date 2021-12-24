package by.itAcademy.homeworks.oop.task32;

public abstract class AbstractAppliances implements HouseholdAppliances{
        protected boolean isOn = false;
        protected String model, producer;
        protected int power;

        public String getInfoAboutAppliances(){
                return "Системная информация:\nмодель - " + model + ";\n"
                        + "изготовитель - " + producer + ";\nмощность - " + power + " Вт;";

        }

        @Override
        public void turnOn() {
                isOn = true;
        }

        @Override
        public void turnOff() {
                isOn = false;
        }

        @Override
        public void printMenu() {
                if (isOn) {
                        System.out.println("________Приветствую Вас в меню_________________");
                        System.out.println("________Вам доступны следующие действия________");
                        System.out.println("_______________________________________________");
                        settingList();
                        doYourJob();
                }
        }






}
