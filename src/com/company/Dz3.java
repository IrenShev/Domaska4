package com.company;

import java.util.Random;

public class Dz3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(myRandom());
        }

    }
    public static double myRandom() {
        Random rundom = new Random();
        double d = 1.0;
        return d/(1.000000000000001 + rundom.nextInt(Integer.MAX_VALUE));
    }
}
