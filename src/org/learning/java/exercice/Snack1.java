package org.learning.java.exercice;

import java.util.Scanner;

public class Snack1 {
    // Inserisci un numero, se è pari stampa il numero,
    // se è dispari stampa il numero successivo.
    public static void main(String[] args){
        //variables
        Scanner inputNumber = new Scanner(System.in);

        // request number
        System.out.print("Inserisci un numero: ");
        int numberIn = inputNumber.nextInt();

        // validation
        if (numberIn % 2 == 0){
            System.out.print("Il numero inserito è pari ");
            System.out.println(numberIn);
        } else {
            System.out.print("Il numero inserito era dispari, ora va meglio... ");
            System.out.println(numberIn + 1);
        }
    }
}
