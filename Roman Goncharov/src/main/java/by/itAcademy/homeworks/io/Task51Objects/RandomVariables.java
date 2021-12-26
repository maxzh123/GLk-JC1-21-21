package by.itAcademy.homeworks.io.Task51Objects;

import java.util.Random;

public class RandomVariables {
    private static Names[] names = Names.values();
    private static Surnames[] surnames = Surnames.values();
    private static Random random = new Random();

    public static String randomName(){
        int randomIdx = random.nextInt(names.length);
        return names[randomIdx].toString();
    }

    public static String randomSurname(){
        int randomIdx = random.nextInt(surnames.length);
        return surnames[randomIdx].toString();
    }

    public static int randomAge(){
            int randomAge = random.nextInt(90);
        return randomAge;
    }
}
