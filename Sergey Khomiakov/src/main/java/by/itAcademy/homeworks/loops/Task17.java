package by.itAcademy.homeworks.loops;
/*
> Задать произвольное целое число и вывести его в бухгалтерском формате, то
> есть, начиная справа, каждые три позиции отделяются пробелом. Например, число
> 20023143 должно быть выведено как 20 023 143.
 */

import java.text.*;


public class Task17 {

    public String getNewFormatString (int num) {

        int number = Math.abs(num);
        NumberFormat df = new DecimalFormat("000");
        String numberInARow="";

        if (number !=0){
        numberInARow = df.format(number%1000) + numberInARow;
        number/=1000;

        do{

            if(number>1000){
            numberInARow = df.format(number%1000) + " " + numberInARow;
            }
            else {
                numberInARow = number%1000+ " " + numberInARow;
            }
            number/=1000;

        }while(number>0);

        } else{
            numberInARow = "0";
        }

        if (num>=0){
            System.out.println(numberInARow);
            return numberInARow;
        } else{
            System.out.println("-" + numberInARow);
            return "-"+numberInARow;
        }
    }
}
