package com.company.Dz8;

import java.util.Scanner;

public class Main {
    private static int[] arr = {1,2,3,6,7,4,3,56,2};
    //2.2. Обьявить массив типа int как переменную класса Main. Написать метод changeArraySize(int newSize):
    // - если newSize больше то размер массива увеличиваются до нужного размера, новые элементы имеют значение 0.
    // - если newSize меньше то размер массива уменьшается до нужного размера, те элементы которые не влезли отбрасываются.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println("Введите размерность!");
        changeArraySize(sc.nextInt());
        System.out.println( );
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void changeArraySize(int newSize){

        if (arr.length < newSize){
            int[] newArr = new int[newSize];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        if(arr.length > newSize){
            int[] newArr = new int[newSize];
            for (int i = 0; i < newSize; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
}
