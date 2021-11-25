package by.itAcademy.oop;

public class OopRunner {

    public static void main(String[] args) {
        Animal[] pets=new Animal[10];
        int i=0;
        pets[i++]=new Dog();
        pets[i++]=new Cat();
        pets[i++]=new Dog();
        pets[i++]=new Cat();
        pets[i++]=new Dog();
        pets[i++]=new Cat();
        pets[i++]=new MainKun();
        ((MainKun)pets[i-1]).setIam("Дворняга блохастая");
        pets[i++]=new Cat();
        sayAll(pets);
    }
    private static void sayAll(Animal[] animals){
        for(int i=0;i<animals.length;i++){
            if (animals[i]!=null){
                animals[i].say();
                if (animals[i] instanceof Cat) {

                     Cat cat=(Cat)animals[i];
                      cat.царапаться();
                }
            }
        }
    }

}
