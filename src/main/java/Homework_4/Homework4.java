package Homework_4;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {

        int dim = 5;
        int[][] myMatrix = new int[dim][dim];
        if(dim >0){
            backSlashMatrix(myMatrix);// 1 - like a backslash
            printMatrix(myMatrix);//print to console
            slashMatrix(myMatrix);//1 - like a slash
            printMatrix(myMatrix);//print to console
        }

    }

    private static void backSlashMatrix(int[][] myMatrix){
        for (int i=0; i<myMatrix.length;i++)
        {
            for (int j=0; j<myMatrix[i].length;j++) {
                //диагональ "\"
                myMatrix[i][j] = i == j ? 1 : 0;
            }
        }

    }

    private static void slashMatrix(int[][] myMatrix){
        for (int i=0; i<myMatrix.length;i++)
        {
            for (int j=0; j<myMatrix[i].length;j++) {
                //на всякий обратную диагональ тоже сделал "/"
                if(j+1 == myMatrix[i].length-i ) myMatrix[i][j]=1;
            }
        }
    }

    private static void printMatrix(int[][] myMatrix){
        for (int i=0; i<myMatrix.length;i++)
        {
            for (int j=0; j<myMatrix[i].length;j++) {
                System.out.print(" " + myMatrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
