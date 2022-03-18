package JavaLab_22_03_18_Lez2;

import java.util.Scanner;

/**
 * @autor Francesco Ribatti
 * Esercizio numero due, il quale richiede di implementare i cicli,
 * (for, while, do-whilw) sommando due numeri per x volte,
 * tenendo traccia della somma di questi due numeri
 */
public class Es2_While {
    public static void main(String[] args) {
        int primoNumero;
        int secondoNumero;
        int somma = 0;
        int numeroIterazioni = 0;
        Scanner inputUtente = new Scanner(System.in);

        while (numeroIterazioni < 4) {
            System.out.println("Inserisci il primo numero");
            primoNumero = inputUtente.nextInt();

            System.out.println("Inserisci il secondo numero");
            secondoNumero = inputUtente.nextInt();

            somma += primoNumero + secondoNumero;

//            numeroIterazioni = inputUtente.nextInt();
            numeroIterazioni++;
        System.out.println("primoNumero: " + primoNumero + " secondoNumero: " + secondoNumero +
                "\nLa loro somma è: " + somma);
        }
    }
}
