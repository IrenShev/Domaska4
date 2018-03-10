package com.company;

        import java.util.Random;

public class Dz1 {
    public static void main(String[] args) {
        System.out.println(myRandom(333 + 1));
    }
    public static int myRandom(int max){
        Random rundom = new Random();
        return rundom.nextInt(max);
    }

}
