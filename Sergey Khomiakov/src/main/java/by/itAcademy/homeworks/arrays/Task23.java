package by.itAcademy.homeworks.arrays;

/*> Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть
> таким образом:

	1 1 1 1 1
	0 1 1 1 0
	0 0 1 0 0
	0 1 1 1 0
	1 1 1 1 1

 */

public class Task23 {
    public static void main(String[] args) {
        int [][] m  = new int[5][5];
        for  (int i = 0; i < m.length/2;i++){
            for (int j = 0; j < m[i].length; j++){
                if (j < i || j >=(m.length-i)) {
                }
                else {
                    m[i][j] = 1;
                }
                System.out.print(m[i][j] +  " ");

            }
            System.out.println();
        }

        for  (int i = m.length/2; i < m.length;i++){
            for (int j = 0; j < m[i].length; j++){
                if (j <(m.length-1-i) || j > i) {
                }
                else {
                    m[i][j] = 1;
                }
                System.out.print(m[i][j] +  " ");

            }
            System.out.println();
        }

    }

}
