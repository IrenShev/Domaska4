package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dz4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int oldest = 0;
        int yongest = 0;
        int middle = 0;

        if(a <= b && a <= c){
            yongest =  + a;
            if(b <= c){
                middle = b;
                oldest = c;
            }else{
                middle = c;
                oldest = b;
            }
        }
        if(b <= a && b <= c){
            yongest = b;
            if(a <= c){
                middle = a;
                oldest = c;
            }else{
                middle = c;
                oldest = a;
            }
        }
        if(c <= b && c <= a){
            yongest = c;
            if(b <= a){
                middle = b;
                oldest = a;
            }else{
                middle = a;
                oldest = b;
            }
        }
        System.out.println("меньшее " + yongest);
        System.out.println("среднее " + middle);
        System.out.println("большее " + oldest);


    }
}
