package com.company;

import java.util.Random;

public class Dz2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(myRandom(5, 10, true));
        }

    }

    public static int myRandom(int a, int b, boolean inclusive) {
        Random random = new Random();
        if (!inclusive) {
            return a + 1 + random.nextInt((b - a - 1));
        } else {
            return a + random.nextInt((b - a + 1));
        }
    }
}
