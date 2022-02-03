package by.itAcademy.homeworks.ControlWork.Work4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class Player implements Serializable {
    private String name;
    private int age;
    boolean isActive;
    private String[] names={"Саша","Андрей","Дима","Сергей","Миша","Ваня","Артем","Лена","Катя","Валя"};
    public Player(String name,boolean isActive,int age){
        this.name=name;
        this.isActive=isActive;
        this.age=age;
    }
    public Player(){
        Random random=new Random();
        name=String.valueOf(names[random.nextInt(names.length)]);
        isActive= random.nextBoolean();
        age=(int)(Math.random()*20+20);
    }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public boolean getisActive() {return isActive;}
    public void setisActive(boolean active) {isActive = active;}
    public String[] getNames() {return names;}
    public void setNames(String[] names) {this.names = names;}

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
}

