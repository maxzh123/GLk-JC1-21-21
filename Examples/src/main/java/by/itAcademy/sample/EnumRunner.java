package by.itAcademy.sample;


import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        Еда a;
        a=Еда.Курочка;
        switch (a){
            case Каша:
                System.out.println("не люблю здоровую пищу"+a.ordinal());
                break;
            case Шашлык:
                System.out.println("жаль не сезон"+a.ordinal());
                break;
            case Курочка:
                System.out.println("надоела уже"+a.ordinal());
                break;
        }
        System.out.println(Arrays.toString(Еда.values()));;
    }

}
