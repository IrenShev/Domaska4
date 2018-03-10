package com.company.Dz8;
//1.	Посчитать площадь круга.
//Вход: радиус
//Вывод: площадь круга
public class PloshadCruga {
    public static void main(String[] args) {
        System.out.println(poleCircle(5));
    }
    static double poleCircle(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
