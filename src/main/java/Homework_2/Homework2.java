package Homework_2;

import java.util.Arrays;//здесь и далее наверное буду использовать этот класс для вывода

public class Homework2 {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        int step =3;

        for(int i=0; i < myArray.length; i++){
            myArray[i]=i*step;
        }
        System.out.println(Arrays.toString(myArray));

    }

}
