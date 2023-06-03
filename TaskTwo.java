package com.pockocmoc.gb.exception.sem_one_homework;

//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class TaskTwo {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}


/*В данном коде возможны следующие типы исключений:

NumberFormatException - может быть выброшено при вызове метода Integer.parseInt(), 
если переданный аргумент не может быть преобразован в целое число.

NullPointerException - может быть выброшено, если ссылка на массив arr является null.

ArrayIndexOutOfBoundsException - может быть выброшено, 
если значение i превышает длину массива arr либо значение j превышает 4 (5-1), 
что приведет к выходу за границы массива.*/
