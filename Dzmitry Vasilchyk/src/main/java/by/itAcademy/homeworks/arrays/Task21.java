package by.itAcademy.homeworks.arrays;
/**Задание21
 Создать переменную для массива из 10 элементов. Заполнить его произвольными
 значениями целочисленного типа. Определить сумму элементов массива, расположенных
 между минимальным и максимальным значениями. Если значений максимальных и минимальных
 несколько, то необходимо взять максимальное значение разницы индексов между максимальным
 и минимальным значениями.
 **/
public class Task21 {
   // static int size = 13;
    static int maxIndex = 0;
    static int minIndex = 0;
    public static void main(String[] args) {
        int marks[] = new int[]{1,2,3,5,6,9,5,6,3,0,3};
        //     for (int i = 0; i < size; i++) {
        //       marks[i] = (int) (Math.random() * 10 + 1);
        //     System.out.print(marks[i]+" ");
        //   }
        //  System.out.println();
        searchMaxMin(marks);
        System.out.println(calcSum(marks));
    }
    public static void searchMaxMin(int[] marks) { //ищем индексы максимальных и минимальных значений (первые встречные)
        for (int i = 0; i < marks.length; i++) {
            if (marks[maxIndex] < marks[i]) {
                maxIndex = i;
            }
            if (marks[minIndex] > marks[i]) {
                minIndex = i;
            }
        }
    }


    public static int calcSum(int[] marks){ //двойным циклом просчитываем расстояние между индексами
        int min=minIndex;            //с минимальными и максимальными значениями
        int max=maxIndex;
        for (int i=0;i<marks.length;i++){
            for (int j=0;j<marks.length;j++){
                if (marks[i]==marks[maxIndex] && marks[j]==marks[minIndex]){
                    if (Math.abs(max-min)<Math.abs(i-j)){ //берем абсолютную величину,т.к. м.б.минус
                        min=i;
                        max=j;
                    }
                }
            }
        }
        if (min>max){ //три стакана (можно не делать, но тогда суммирование if-else)
            int x=min;
            min=max;
            max=x;
        }
        int sum=0;
        for (int i=min+1;i<max;i++){
            sum+=marks[i];
        }
        return sum;
    }
}
