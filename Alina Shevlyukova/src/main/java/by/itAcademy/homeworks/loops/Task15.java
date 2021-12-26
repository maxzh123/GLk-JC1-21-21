package by.itAcademy.homeworks.loops;

public class Task15 {
    public static void main(String[] args) {
        int abc = 0;
        for (int i = 50 ; i <=70 ; i++){
            int number = 2;
            while (i%number != 0){
                number++;
            }
            if (i==number){
                abc++;
                if (abc ==2){
                    System.out.println("Второе простое число: " + i);
                    break;
                }
            }
        }
    }
}
