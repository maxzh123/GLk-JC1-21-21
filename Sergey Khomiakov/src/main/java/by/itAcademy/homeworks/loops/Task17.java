package by.itAcademy.homeworks.loops;
/*
> Задать произвольное целое число и вывести его в бухгалтерском формате, то
> есть, начиная справа, каждые три позиции отделяются пробелом. Например, число
> 20023143 должно быть выведено как 20 023 143.
 */

import java.text.*;

public class Task17 {

    public String getNewFormatString (int num) {
        String lineResult = helpToDoIntermediateResult(Math.abs(num));

        if (num>=0){
            return lineResult;
        } else{
            return "-"+lineResult;
        }
    }

    public String helpToDoIntermediateResult (int number) {
        NumberFormat df = new DecimalFormat("000");
        String numberInARow ="";

        if (number !=0){
            if (number < 1000){
                numberInARow += number;
            }
            else {
                numberInARow = df.format(number % 1000);
                number /= 1000;

                while (number > 0) {

                    if (number > 1000) {
                        numberInARow = df.format(number % 1000) + " " + numberInARow;
                    } else {
                        numberInARow = number + " " + numberInARow;
                    }
                    number /= 1000;

                }
            }

        } else{
            numberInARow = "0";
        }
        return numberInARow;

    }

}
