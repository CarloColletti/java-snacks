package org.learning.java.exercice;

public class Snack3 {
    // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args){
        // array
        int[] number = {2, 3, 18, 20, 32, 33, 49, 51, 67};
        int sum = 0;

        // Calcola la somma degli elementi in posizione dispari
        for (int i = 0; i < number.length; i ++) {
            if (number[i] % 2 != 0 ){
                sum = number[i] + sum;
            }
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + sum);
    }
}
