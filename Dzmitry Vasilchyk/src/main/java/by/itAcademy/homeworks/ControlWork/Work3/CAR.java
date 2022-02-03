package by.itAcademy.homeworks.ControlWork.Work3;

import java.io.Serializable;
import java.util.Random;

public class CAR implements Serializable {
    private String name,model;
    private int engineСapacity;
    private String[] names={"лимузин","пикап","хэтчбек","купе","внедорожник"};
    carModel[]models=carModel.values();
    public CAR(String name,String model,int engineСapacity){
        this.name=name;
        this.model=model;
        this.engineСapacity=engineСapacity;
    }
    public CAR(){
        Random random=new Random();
        name=String.valueOf(names[random.nextInt(models.length)]);
        model=String.valueOf(models[random.nextInt(models.length)]);
        engineСapacity=random.nextInt(3)+1;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getEngineСapacity(){
        return engineСapacity;
    }
    public void setEngineСapacity(int engineСapacity){
        this.engineСapacity=engineСapacity;
    }

    @Override
    public String toString() {
        return "CAR{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engineСapacity=" + engineСapacity +
                '}'+"\n";
    }
}
