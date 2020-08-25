package Homework_1;

public class Homework1 {
    public static void main(String[] args) {
        //так чисто для себя, объявление массива через рандом
        //int[] myArray = {1,1,0,0,1,0,1,1,0,0};
        //использую в методах основные конструкции циклов кроме do-while, для закреплеения
        int[] myArray = new int[30];
        initArrayForCycle(myArray);//заполнение масива
        printForeachCycle (myArray);//вывод инициализированных значений
        changeWhileCycle (myArray);//замена значений 0 и 1 местами
        printForeachCycle (myArray);//вывод результата
        //

    }

    private static void initArrayForCycle(int[] myArray){
        for(int i = 0; i < myArray.length;i++){
            myArray[i] = (int)(0+Math.random()*2);
        }
    }

    private static void printForeachCycle(int[] myArray){
        //в данном дз я сделаю вывод сам,
        //а так можно использовать класс Arrays, который есть в java
        for (int element:myArray) {
            System.out.print(" "+element);
        }
        System.out.print("\n");
    }

    private static void changeWhileCycle(int[] myArray){
        int counter = 0;
        while(counter < myArray.length){
            myArray[counter] = myArray[counter]==0?1:0;
            counter++;
        }
    }
}
