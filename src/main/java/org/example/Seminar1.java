package org.example;

public class Seminar1 {

    //императивный стиль
    public static void sortListImperative(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - i - 1; j++) {
                if(numbers[j + 1] > numbers[j]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
    }

    //декларативный  стиль
    public static void declarativeSortListImperative(int[] numbers){
        sortMaxMin(numbers);
        print(numbers);
    }





}
