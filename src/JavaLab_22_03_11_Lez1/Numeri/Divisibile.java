package JavaLab_22_03_11_Lez1.Numeri;

import java.util.Scanner;

/**
 * @author CiccioFr
 * Implementazione esercizio divisibilità
 */

public class Divisibile {
    public static void main(String[] args) {


        // verifica se un numero è divisibile per 2-3-4-5
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero, verificherò che sia divisibile per 2-3-4-5");
        String scelta = "";
        do {
            if (scelta.compareTo("si") == 0)
                System.out.println("OK. Inserisci un altro numero, Ricontrollerò che sia divisibile per 2-3-4-5");

            int input = tastiera.nextInt();
            if (input % 2 == 0 && input % 3 == 0 && input % 4 == 0 && input % 5 == 0)
                System.out.println("Bene! Il tuo numero " + input + " è divisibile per 2-3-4-5");
            else
                System.out.println("Mi spiace, il tuo numero " + input + " NON è divisibile per 2-3-4-5");

            System.out.println("Vuoi riprovare?");
            scelta = tastiera.next();
        }
        while (scelta.compareTo("si") == 0);    // compareTo() ritorna un valore intero
    }


    protected static void divido() {
        System.out.println("Inserisci due numeri, verificherò che il primo sia divisibile per il secondo");
        Scanner tastiera = new Scanner(System.in);
        int primoNr = tastiera.nextInt();
        int secondoNr = tastiera.nextInt();
        if (primoNr % secondoNr == 0)
            System.out.println("Il numero " + primoNr + " è divisibile per " + secondoNr);
        else
            System.out.println("Mi spiace, Il numero " + primoNr + " è divisibile per " + secondoNr);
    }
}
