package org.example;

import java.util.Scanner;

public class Seminar3 {

    //создать масссив 3 на 3

    //сделать метод заполнения его данными, с запретом перезаписи данных

        //делать проверку когда заняты три позиции одной фигурой то победил игрок
    //делать проверку на ничью

    public static void main(String[] args) {

        String [][] twoDimArray = {{null,null,null}, {null,null,null}, {null,null,null}};//объявили массив и заполнили его элементами
        String test1 = "x";
        String test2 ="y";
        System.out.println("проверка тест1 и тест2 на равенство" );
        System.out.println(test1==test2 );

        playGameXO(twoDimArray);


        }


    //Метод печати доски
    public static  void printDesk(String [][] twoDArray) {
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 3; j++) {//идём по столбцам
                System.out.print(" " + twoDArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы

        }


    }

    //Метод указания строки

    public static  int writeString() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");

        int str = sc.nextInt()-1;



        return  str;

    }

    //Метод указания столбца


    public static  int writeColoumn() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите столбец:");

        int coloumn = sc.nextInt()-1;



        return  coloumn;

    }

    //Метод указания  элемента'


    public static  String writeElement() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  элемент':");

        String element = sc.next();

        System.out.println(element);


        return  element;

    }

    //Метод проверки  победы крестика

    public static boolean checkWinnerX(String [][] twoDArray) {
        String letter= "x";
        System.out.println("Зашли в чек икс Letter = "+ letter);
        System.out.println("twoDArray[0][0]= "+ twoDArray[0][0]);
        System.out.println("twoDArray[0][1]= "+ twoDArray[0][1]);
        System.out.println("twoDArray[0][2]= "+ twoDArray[0][2]);
        System.out.println(twoDArray[0][0] ==  letter);
        System.out.println(twoDArray[0][1] ==  letter);
        System.out.println(twoDArray[0][2] ==  letter);






        //проверка первой строки
        if (twoDArray[0][0] ==  letter && twoDArray[0][0] == twoDArray[0][1] &&  twoDArray[0][0] ==twoDArray[0][2] ) {
                System.out.println("Победа " + letter);
                return  true;

            }

        //проверка второй строки

        if (twoDArray[1][0] ==  letter & twoDArray[1][0] == twoDArray[1][1] &  twoDArray[1][0] ==twoDArray[1][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка третей строки

        if (twoDArray[2][0] ==  letter & twoDArray[2][0] == twoDArray[2][1] &  twoDArray[2][0] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка первого  столбца

        if (twoDArray[0][0] ==  letter & twoDArray[0][0] == twoDArray[1][0] &  twoDArray[0][0] ==twoDArray[2][0] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка второго  столбца

        if (twoDArray[0][1] ==  letter & twoDArray[0][1] == twoDArray[1][1] &  twoDArray[0][1] ==twoDArray[2][1] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка третьего  столбца

        if (twoDArray[0][2] ==  letter & twoDArray[0][2] == twoDArray[1][2] &  twoDArray[0][2] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка 1  диагонали

        if (twoDArray[0][0] ==  letter & twoDArray[0][0] == twoDArray[1][1] &  twoDArray[0][0] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка 2  диагонали

        if (twoDArray[0][2] ==  letter & twoDArray[0][2] == twoDArray[1][1] &  twoDArray[0][2] ==twoDArray[2][0] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        else
            return false;






    }


//Метод проверки  победы нолика

    public static boolean checkWinnerO(String [][] twoDArray) {
        String letter= "o";

        //проверка первой строки
        if (twoDArray[0][0] ==  letter & twoDArray[0][0] == twoDArray[0][1] &  twoDArray[0][0] ==twoDArray[0][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка второй строки

        if (twoDArray[1][0] ==  letter & twoDArray[1][0] == twoDArray[1][1] &  twoDArray[1][0] ==twoDArray[1][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка третей строки

        if (twoDArray[2][0] ==  letter & twoDArray[2][0] == twoDArray[2][1] &  twoDArray[2][0] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка первого  столбца

        if (twoDArray[0][0] ==  letter & twoDArray[0][0] == twoDArray[1][0] &  twoDArray[0][0] ==twoDArray[2][0] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка второго  столбца

        if (twoDArray[0][1] ==  letter & twoDArray[0][1] == twoDArray[1][1] &  twoDArray[0][1] ==twoDArray[2][1] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка третьего  столбца

        if (twoDArray[0][2] ==  letter & twoDArray[0][2] == twoDArray[1][2] &  twoDArray[0][2] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка 1  диагонали

        if (twoDArray[0][0] ==  letter & twoDArray[0][0] == twoDArray[1][1] &  twoDArray[0][0] ==twoDArray[2][2] ) {
            System.out.println("Победа " + letter);
            return  true;

        }

        //проверка 2  диагонали

        if (twoDArray[0][2] ==  letter & twoDArray[0][2] == twoDArray[1][1] &  twoDArray[0][2] ==twoDArray[2][0] ) {
            System.out.println("Победа " + letter);
            return  true;

        }





        return false;

    }



//Метод проверки  ничьей

    public static boolean checkFinish(String [][] twoDArray) {
        if (twoDArray[0][0] !=null &
                twoDArray[0][1] !=null &
                twoDArray[0][2] !=null &
                twoDArray[1][0] !=null &
                twoDArray[1][1] !=null &
                twoDArray[1][2] !=null &
                twoDArray[2][0] !=null &
                twoDArray[2][1] !=null &
                twoDArray[2][2] !=null) {

                System.out.println("Игра окончена, ничья ");

                return  true;

            }
        return  false;
        }




    //Метод вставки элемента

    public static  void pastSymbolinDesk(String [][] twoDArray) {

         //Запрашиваем параметры
        int string= writeString();
        int coloumn = writeColoumn();
        String element = writeElement();

        //Вставялем

        twoDArray[string][coloumn] = element;

        //Печатаем для наглядности и проверки

          printDesk(twoDArray);



    }

    //Метод запуска игры
    public static  void playGameXO(String [][] twoDArray) {

        //проверка статусов

        boolean winO = checkWinnerO(twoDArray);
        boolean winX = checkWinnerX(twoDArray);
        boolean checkFinish= checkFinish(twoDArray);

        while(winO==false || winX == false || checkFinish == false){

            pastSymbolinDesk(twoDArray);

             winO = checkWinnerO(twoDArray);
             winX = checkWinnerX(twoDArray);
            System.out.println(winX);
             checkFinish= checkFinish(twoDArray);

        }






    }




    }


    //Метод заполнения доски







