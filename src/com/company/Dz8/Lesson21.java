package com.company.Dz8;

import java.util.Scanner;
// 2.1-. написать метод который заполняет массив одинаковыми числами, число вводится с клавитуры
public class Lesson21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumb = sc.nextInt();
        fillArr(inputNumb, new int[inputNumb]);
    }
    public static void fillArr(int num, int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
