package by.itAcademy.homeworks.generics;

import by.itAcademy.homeworks.types.MyReadHelper;

public abstract class Vehicle {
    protected String name;

    public Vehicle (){
        this.name = MyReadHelper.readLine("Введите название механизма: ");
    }
}
