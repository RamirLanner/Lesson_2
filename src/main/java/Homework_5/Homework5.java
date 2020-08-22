package Homework_5;


import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int dim = 10;
        int[] myArray= new int[dim];
        initArray(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("max = " + maxValueHardMethod(myArray));
        System.out.println("min = " + minValueHardMethod(myArray));

        //чисто ради интерса
//        Arrays.sort(myArray);
//        System.out.println("min = "+myArray[0]);
//        System.out.println("max = "+myArray[myArray.length-1]);
        //работает)


    }

    private static int maxValueHardMethod(int[] myArray){
        int maxValue = myArray[0];
        for (int element : myArray) {
            if (maxValue < element) maxValue = element;
        }
        return maxValue;
    }

    private static int minValueHardMethod(int[] myArray){
        int minValue = myArray[0];
        for (int element : myArray) {
            if (minValue > element) minValue = element;
        }
        return minValue;
    }

    private static void initArray(int[] myArray){
        for (int i=0;i<myArray.length;i++) myArray[i]=(int)(Math.random()*100);
    }
}
