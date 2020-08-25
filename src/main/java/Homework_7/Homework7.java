package Homework_7;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {

//        int a =-100;
//        int b= 77;
//        System.out.println((double)a%b);
        int[] myArray = {0,1,2,3,4};
        int shift =-1;
        moveElements(myArray,shift);

    }

    private static void moveElements(int[] myArray, int shift){

        int length = myArray.length;
        if((length==Math.abs(shift))||(length<1)){
            System.out.println(Arrays.toString(myArray));
            return;
        }

        int realShift = shift%length;//фактическое смещение на случай если количество пунктов смещения превышает длинну массива
        int indexPurpose = 0;//индекс куда переносить, объявил просто по умолчанию
        int indexNow = 0;//индекс элемента который будет переносится, начинаю всегда с 0
        int containerOut = myArray[indexNow];//беру нулевой элемент массива и записываю его во временную переменную, всегда стартую с него
        int containerIn = 0;//вспомогательный элемент, что бы не потерять переносимые элементы
            //здесь будет код для -/+N сдвиг
            do {//Magic
                //по этой магической формуле(ниже) расчитываю какой элемент массива нужно заменить текущим(ожидает в containerOut)
                if(shift<0){
                    indexPurpose = (indexNow<Math.abs(realShift))?(length+realShift+indexNow):(indexNow+realShift);//для сммещения влево
                }
                else{
                    indexPurpose = (indexNow<(length-shift))?(realShift+indexNow):(indexNow+realShift-length);//другое условие для смещения вправо
                }
                //в ней нет ничего такого, просто пришлось напрячь мозг, ну и дальше переприсвоения, изи
                containerIn = myArray[indexPurpose];
                myArray[indexPurpose] = containerOut;
                containerOut = containerIn;
                indexNow = indexPurpose;
            }while (indexNow!=0);//пригодился цикл do, бывает же...
            //раз мы начали с 0 элемента то и закончить мы должны там же, математика емае, ну и все когда заменен последний элемент цикл заканчивается
        System.out.println(Arrays.toString(myArray));

    }

}
