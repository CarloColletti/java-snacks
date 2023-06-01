package org.learning.java.exercice;

import java.util.Scanner;

public class Snack8 {
    // Chiedi un numero di 4 cifre all’utente e calcola la somma
    // di tutte le cifre che compongono il numero (Nel live coding
    // pushato su github trovate un suggerimento su come proseguire
    // con la soluzione :occhi: )
    public static void main(String[] args){
        // scanner import
        Scanner input = new Scanner(System.in);

        // number request
        System.out.print("Inserisci un numero di 4 cifre: ");

        // request number
        int numberRequest = input.nextInt();

        // Verify request
        if (numberRequest < 1000 || numberRequest > 9999) {
            System.out.println("Il numero inserito non ha 4 cifre. Riprova.");
            return;
        }

        // variable for sum
        int sum = 0;

        // calculate the sum
        while (numberRequest > 0) {
            sum += numberRequest % 10;
            numberRequest /= 10;
        }

        System.out.println("La somma delle cifre è: " + sum);
    }


}
