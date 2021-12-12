package by.itAcademy.homeworks.objects;

public class Task24 {
    public static void main(String[] args) {
       TimeInterval timeInterval = new TimeInterval(3600);
       TimeInterval timeInterval1 = new TimeInterval(2,4,40);

        System.out.println(timeInterval.getQuantityOfSeconds());
        System.out.println(timeInterval1.getQuantityOfSeconds());
        System.out.println(timeInterval.compare(timeInterval1));
    }
}
