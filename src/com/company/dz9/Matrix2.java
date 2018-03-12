package com.company.dz9;

import java.util.Random;
import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
//3. Сложите 2 матрицы m*n где каждый элемент является суммой двух соответствующих.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n =  3+random.nextInt(7);
        int m =  3+random.nextInt(7);
        int[][] matrix1 = generateMatrix(n,m);
        int[][] matrix2 = generateMatrix(n,m);
        summMatrix(matrix1,matrix2);

    }
    public static int[][] generateMatrix(int m, int n){
        Random random = new Random();
        int [][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }
    public static void summMatrix(int[][] matrix1, int[][] matrix2){
        System.out.println("матрица1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("матрица2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("суммированная матрица");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
