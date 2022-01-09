package by.itAcademy.homeworks.oop;

public class Work implements HomeGadget{
    boolean state;
    String type,model,producer;
    int power;
    public void on () {this.state=true;}
    public void off () {this.state=false;}
    public void printState(){
        System.out.println("Прибор "+type+"\nМодель "+model+
                "\nПроизводитель "+producer+"\nМощность "+power);
        if(state){
            System.out.println("Прибор включен");
        }else {
            System.out.println("Прибор выключен");
        }
    }
}


