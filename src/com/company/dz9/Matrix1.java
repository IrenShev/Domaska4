package com.company.dz9;

import java.util.Random;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        //2. Создайте метод, который в качестве аргумента получает число и полностью обнуляет столбец,
        // который соответствует заданному числу. Число вводиться с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        printMatrix(scanner.nextInt());

    }
    public static void printMatrix(int x) {
        Random random = new Random();
        int[][] matrix = new int[3 + random.nextInt(7)][3 + random.nextInt(7)];
        if(x > matrix[0].length || x-1 < 0){
            System.out.println("такого столбца нет!");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(x-1 != j) {
                    matrix[i][j] = random.nextInt(100);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
