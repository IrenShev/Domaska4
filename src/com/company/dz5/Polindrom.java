package com.company.dz5;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(isPolinrom(sc.nextLine().trim()));
        }
    }
    public  static  boolean isPolinrom(String example){
        return example.equals(new StringBuilder(example).reverse().toString());
    }
}
