package org.learning.java.exercice;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //import scanner
        Scanner wordIn = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Inserisci una stringa (0 per uscire):");
            inputString = wordIn.nextLine();

            if (!inputString.equals("0")) {
                int countAlfa = 0;
                int countNumber = 0;
                int countSymbol = 0;

                for (char carattere : inputString.toCharArray()) {
                    if (Character.isLetter(carattere)) {
                        countAlfa++;
                    } else if (Character.isDigit(carattere)) {
                        countNumber++;
                    } else {
                        countSymbol++;
                    }
                }

                System.out.println("Caratteri alfabetici: " + countAlfa);
                System.out.println("Numeri: " + countNumber);
                System.out.println("Simboli non alfanumerici: " + countSymbol);
            }
        } while (!inputString.equals("0"));


    }
}
