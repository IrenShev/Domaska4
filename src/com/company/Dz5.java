package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(checkWithRegExp(sc.nextLine()));
        }
    }
    //2. Определить является ли символ введенный с клавиатуры цифрой, буквой или знаком пунктуации.
    public static boolean checkWithRegExp(String input){
        Pattern p = Pattern.compile("[A-Za-z\\d.;:\"\',!?]");
        Matcher m = p.matcher(input);
        return m.matches();
    }
}