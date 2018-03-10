package com.company.Dz8;

import java.util.Scanner;
//1. Используя цикл while и break реализовать следющее:
// - попросить пользователя  ввести число.
// - если число больше 100 то прекратить выполнение, иначе начать сначала
public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите число пожалуйста!");
            if(sc.nextInt() > 100){
                break;
            }
        }
    }
}
