package com.company.exzampl;

public class Loader {
    public static void main(String[] args) {
        System.out.println(SomeClass.someField1);// ста
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.someField);
        someClass.someField += 1;
        someClass.someField1 += 1;
        SomeClass someClass1 = new SomeClass();
        System.out.println(someClass1.someField);
        System.out.println(someClass1.someField1);

    }
}
