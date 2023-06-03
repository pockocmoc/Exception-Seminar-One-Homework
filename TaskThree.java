package com.pockocmoc.gb.exception.sem_one_homework;

import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов 
двух входящих массивов в той же ячейке. Если длины массивов не равны, 
необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException, т.е. ваше*/
public class TaskThree {

    public static void main(String[] args) {

        int[] arr1 = {10, 30, 50, 100};
        int[] arr2 = {5, 6, 5, 5};

        System.out.println(Arrays.toString(divideArrays(arr1, arr2)));
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не совпадают!");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Нельзя делить на ноль!");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

}
