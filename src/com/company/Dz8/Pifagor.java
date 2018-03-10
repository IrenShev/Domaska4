package com.company.Dz8;
//Теорема Пифагора. Посчитать гипотенузу по 2 катетам.
//Вход: 2 катета
//Вывод: гипотенуза
public class Pifagor {
    public static void main(String[] args) {
        System.out.println(gipotenuza(3, 4));
    }
    public  static  double gipotenuza(double katetA, double katetB){
        return Math.sqrt(Math.pow(katetA,2)+ Math.pow(katetB,2));
    }
}
