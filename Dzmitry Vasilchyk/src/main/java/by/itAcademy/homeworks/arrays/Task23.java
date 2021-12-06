package by.itAcademy.homeworks.arrays;


/**Задание23
 Создать двухмерный квадратный массив и заполнить его «бабочкой»
 **/
public class Task23 {
    static int size = 10;
    static int marks[][] = new int[size][size];
    public static void main(String[] args) {
        outputUp();
        outputDown();
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                System.out.print(marks[i][j]);
            }
            System.out.println();
        }
    }
        private static void outputUp(){    //фомируем верхнюю половину
            for (int i = 0; i < marks.length/2+1; i++) {
                for (int j = 0; j < marks.length; j++) {
                    if ((j < i) || (j >= (marks.length-i)))
                        marks[i][j] = 0;
                    else
                        marks[i][j] = 1;
                }
            }
        }
        private static void outputDown() {          //фомируем нижнюю половину
            for (int i = marks.length-1; i >= marks.length/2; i--) {   //2+1 приведет к не корректному выводу для четних массивов
                for (int j = 0; j < marks.length; j++) {
                    if ((j > i) || (j < (marks.length-1-i)))
                        marks[i][j] = 0;
                    else
                        marks[i][j] = 1;
                }
            }
        }
}




