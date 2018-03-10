package com.company.dz5;

import java.util.Random;
import java.util.Scanner;

public class Lesson1 {
   // 1.) Подкидываются 3 игральных кубика. Вывести вероятность того что на всех 3 кубиках
    // разные числа, методом подкидывания кубиков N-ное количество раз. (edited)
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (true) {
           throwBone(sc.nextInt());
       }

   }
   public  static void   throwBone(int capasity){
       Random random = new Random();
       int value = 0;
       for (int i = 0; i < capasity; i++) {
           int bone1 = 1 + random.nextInt(6);
           int bone2 = 1 + random.nextInt(6);
           int bone3 = 1 + random.nextInt(6);
           //System.out.println(bone1  +" " + bone2 +" "+ bone3);
           if(bone1 != bone2 && bone1 != bone3 && bone2 != bone3){
               value++;
           }
           //System.out.println("правда " +value);
       }
       System.out.println("Вероятность выпадения: " + value/(double)capasity * 100 + " %");

   }
}
