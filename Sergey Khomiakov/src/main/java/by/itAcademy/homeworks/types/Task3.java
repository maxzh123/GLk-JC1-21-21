package by.itAcademy.homeworks.types;

/* Написать код, который выведет значения переменных на экран:

	byte b = 0х55;
	short s = 0x55ff;
	int i = 1000000;
	long l = 0xffffffffL;
	char с = 'a' ;
	float f = .25f;
	double d = .00001234;
	boolean bool = true;

 */

public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a' ;
        float f = .25f;
        double d = .00001234;
        boolean bool = true;

        System.out.print(b + "\n" + s + "\n" + i + "\n" + l + "\n" + c + "\n" + f + "\n" + d + "\n" + bool);
    }
}
