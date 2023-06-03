package com.pockocmoc.gb.exception.sem_one_homework;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class TaskOneThreeException {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 4, 3, 2};
        int a = 10, b = 0;

        System.out.println(division(a, b));

        System.out.println(getElement(array, a));
        int num = parseInt("33O");
        System.out.println(num);
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int getElement(int[] array, int index) {
        return array[index];
    }

    static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
