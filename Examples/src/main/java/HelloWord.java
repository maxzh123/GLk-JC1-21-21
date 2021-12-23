import java.io.*;
import java.util.Arrays;

public class HelloWord {
    static class NumberBox<TYPE> {
        TYPE obj;
        public TYPE getObj() {return obj;}
    }


    public static void main(String[] args){
        System.out.println(
                Arrays.toString(
                        fillArrayWithRandom(
                                createArray(10)
                        )
                )
        );
    }

    public static int[] fillArrayWithRandom(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
        }
        return array;
    }

    public static int[] createArray(int length){
        return new int[length];
    }

}
