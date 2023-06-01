package org.learning.java.exercice;



public class Snack9 {
    //Calcola la somma e la media dei primi 10 numeri.
    public static void main(String[] args){
        //Variabili
        int n = 10;
        int sum = 0;

        // Calcolo la somma dei primi 10 numeri
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Calcola la media dei primi 10 numeri
        double media = (double) sum / n;

        System.out.println("La somma dei primi 10 numeri è: " + sum);
        System.out.println("La media dei primi 10 numeri è: " + media);
    }
}
