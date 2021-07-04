package com.company;

public class Ex1 {
    public static void main(String args[]) {
        String S1 = new String("man is walking ");
        System.out.println("Original String is ': " + S1);
        System.out.println("String after replacing 'man' with 'boy': " + S1.replace("man ", "boy"));
        System.out.println("String after replacing all 'a' with 't': " + S1.replace('a', 't'));

    }
}
