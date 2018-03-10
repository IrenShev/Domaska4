package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code her
            System.out.println(myRandom());

    }
    public static int myRandom(){
        Random rundom = new Random();
        return rundom.nextInt(100);
    }


}
