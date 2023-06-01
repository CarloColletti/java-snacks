package org.learning.java.exercice;

import java.util.Scanner;

public class Snack4 {
    //Data in ingresso una stringa verificare se è palindroma
    public static void main(String[] args) {
        //import scanner
        Scanner wordIn = new Scanner(System.in);

        //request word
        System.out.println("inserisci la parola da controllare: ");
        String word = wordIn.next();


        //boolean variable
        boolean isPalindrome = word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        if (isPalindrome) {
            //is Palindrome
            System.out.println(word + " è palindroma.");
        } else {
            //isn't Palindrome
            System.out.println(word + " non è palindroma.");
        }
    }
}
