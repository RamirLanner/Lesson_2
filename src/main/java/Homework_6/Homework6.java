package Homework_6;

public class Homework6 {
    public static void main(String[] args) {
        int[] myArray ={2, 2, 2, 1, 2, 2,10,1};
        System.out.println(checkBalance(myArray));

    }

    private static boolean checkBalance(int[] myArray){
        int sumElement = 0;
        for (int element:myArray) {//считаем сумму элементов
            sumElement+=element;
        }
        if(sumElement%2>0){
            return false;//сразу отбиваю если сумма элементов не четная(только для целых)
        }
        else{
            return balancePointExist(myArray,sumElement/2);
        }
    }

    //метод ищет ту самую точку, если она конечно существует
    private static boolean balancePointExist(int[] myArray, int balanceSum){
        int sumProgress = 0;
        int count =0;//чисто для вывода и удобства проверки
        for (int element: myArray){
            sumProgress+=element;//прибавляем по элементно в поисках точки баланса
            if(sumProgress==balanceSum){//совпадение, цель выполнена
                printArr(myArray,count);//чисто для вывода и удобства проверки
                return true;
            }
            if(sumProgress>balanceSum) return false; //перебор, точки не существует
            count++;//чисто для вывода и удобства проверки
        }
        return false;
    }

    //этот метод нужен только для добства вывода и проверки.
    private static void printArr(int[] myArray, int count){
        for(int i=0; i <myArray.length; i++){
            if(i ==count){
                System.out.print(" "+myArray[i]);
                System.out.print("||");
                continue;
            }
            System.out.print(" "+myArray[i]);
        }
        System.out.println("");
    }

}
