package com.company.dz9;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту матрицы.");
        int n =  scanner.nextInt();
        System.out.println("Введите ширинру матрицы.");
        int m =  scanner.nextInt();
        printMatrix(n,m);
    }

    public static void printMatrix(int m, int n){
        Random random = new Random();
        int [][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
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
