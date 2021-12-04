package by.itAcademy.homeworks.objects;

public class Task24 {
    public static void main(String[] args) {
        TheTimer timeOne = new TheTimer(6950);
        TheTimer timeTwo = new TheTimer(1, 55, 50);
        System.out.println("Сравнение = " + timeOne.compareTo(timeTwo));
        timeOne.timePrint();
        timeTwo.timePrint();


    }
}


