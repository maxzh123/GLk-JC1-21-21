package by.itAcademy.homeworks.objects;

public class Task24 {

    static{
        System.out.println("Parent init");
    }

    public Task24() {
        class tt{

        }
        System.out.println("Parent constr");
        new tt();
    }

    static public void init(){
    }

}
