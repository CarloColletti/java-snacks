package org.learning.java.exercice;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args){
        //Generatore di “nomi cognomi” casuali:
        // il Grande Gatsby ha una lista di nomi
        // e una lista di cognomi, e da queste vuole
        // mostrare a video una falsa lista di invitati
        // con nome e cognome.


        //lista di nomi
        final String[] names = {"Marco", "Rosa", "Laura", "Carlo", "Gennaro", "Silvio"};
        //lista cognomi
        final String[] surnames = {"Rossi", "Perni", "Colletti", "Piersanti", "Voghi", "Celesti" };

        // variable random
        Random randomOut = new Random();

        System.out.println("questa è la lista delle persone:");

        //cycle
        for (int i = 0; i < 10; i++) {
            String person = names[randomOut.nextInt(names.length)] + " " + surnames[randomOut.nextInt(surnames.length)];
            System.out.println(person);
        }

    }
}
