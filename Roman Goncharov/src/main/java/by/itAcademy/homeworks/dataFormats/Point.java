package by.itAcademy.homeworks.dataFormats;

public class Point {
    private int x;
    private int y;
    private static volatile int pointCounter;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "Точка № " + ++pointCounter + ":\n" + x + "px," + y + "px.";
    }
}