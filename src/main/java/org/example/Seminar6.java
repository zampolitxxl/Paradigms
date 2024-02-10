package org.example;

public class Seminar6 {

    public static void main(String[] args) {
        int[] sortedArray = {1,2,3,4, 10, 17, 28, 32, 49, 57, 61, 72, 82, 91, 94, 99};
        System.out.println(binaryFinding(57, sortedArray));


    }

    public  static  int binaryFinding(int numberToFind, int[] soretedArray) {

        //тривиальный случай

        if (soretedArray.length <=1){
            return -1;
        }

        //ищем индекс середины отрезка
        int halfIndex = soretedArray.length / 2;

        System.out.println("индекс серидины отрезка = " + halfIndex );

        int halfNumber = soretedArray[halfIndex];

        System.out.println("элемент по середине отрезка= " + halfNumber );

        //Случай если элемент найден

        if(halfNumber == numberToFind){
           return halfIndex;
        }

        //делаем левый список
        int[] leftSideArray = new int[halfIndex];
        for (int i = 0; i < halfIndex; i++) {
            leftSideArray[i] = soretedArray[i];

            System.out.println("leftside array i= "+ leftSideArray[i] );


        }



        //делаем правый список
        int[] rideSideArray = new int[halfIndex];
        for (int i = halfIndex; i < soretedArray.length; i++) {
            rideSideArray[i - halfIndex] = soretedArray[i];


            System.out.println("rideside array i = "+ rideSideArray[i-halfIndex] );

        }




        //если не нашли

        if (numberToFind > halfNumber) {
            System.out.println("значение середины =" + halfNumber);

            System.out.println("искомое больше значения середины ищем в правом списке");
            binaryFinding(numberToFind, rideSideArray);
        }

        if (numberToFind < halfNumber) {
            System.out.println("значение середины =" + halfNumber);

            System.out.println("искомое меньше значения середины ищем в левом списке");

            binaryFinding(numberToFind, leftSideArray);
        }


        return halfIndex;
    }

    }

