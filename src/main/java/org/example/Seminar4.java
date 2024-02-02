package org.example;
public class Seminar4 {

    public static void main(String[] args) {
        int[] numbersOne = {1,2,5,28};

        int[] numbersTwo = {7,10,25,31};

        double indexcorellation=corelationIndex(numbersOne, numbersTwo);
        System.out.println(indexcorellation);

    }




    public static double corelationIndex(int[] array1, int[] array2) {
        double chislitel =  chislitel(array1, array2);
        double znamenatel = znamenatel(array1, array2);
        return  chislitel/znamenatel;
    }

    //поиск среднего в массиве

    public static double average(int[] array) {
        int sum =0;
        for (int i = 0; i < array.length-1; i++) {
            sum = array[i]+sum;


        }
        double average = sum/array.length;
        return average;
    }

    //числитель итого

    public static double chislitel(int[] array1, int[] array2){
        double chislitelSum=0;
        double averageX = average(array1);
        double averageY = average(array2);


        for (int i = 0; i < array1.length-1; i++) {
            chislitelSum = (array1[i]-averageX)*(array2[i]-averageY)+chislitelSum;
        }
        return  chislitelSum;
    }

    //знаменатель итого
     public static   double znamenatel(int[] array1, int[] array2){
        double znamenatelSum =0;
        double averageX = average(array1);
        double averageY = average(array2);


        for (int i = 0; i < array1.length-1; i++) {
            znamenatelSum = ((array1[i]-averageX)*(array1[i]-averageX)) *((array2[i]-averageY)*(array2[i]-averageY))+ znamenatelSum;
        }
        //квадратный корень

        return Math.sqrt(znamenatelSum);
    }





}
