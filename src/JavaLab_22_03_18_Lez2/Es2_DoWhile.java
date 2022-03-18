package JavaLab_22_03_18_Lez2;

import java.util.Scanner;

public class Es2_DoWhile {
    public static void main(String[] args) {
        int primoNumero;
        int secondoNumero;
        int somma = 0;
        int nrIterazioni;
        Scanner inputUtente = new Scanner(System.in);

        System.out.println("Inserisci quante volte vuoi iterare la somma");
        nrIterazioni = inputUtente.nextInt();

        do {
            System.out.println("Inserisci il primo numero");
            primoNumero = inputUtente.nextInt();

            System.out.println("Inserisci il secondo numero");
            secondoNumero = inputUtente.nextInt();

            somma += primoNumero + secondoNumero;

            nrIterazioni--;

            System.out.println("iterazione nr. " + nrIterazioni +
                    " primoNumero: " + primoNumero + " secondoNumero: " + secondoNumero +
                    "\nLa loro somma è: " + somma);
        }
        while (nrIterazioni > 0);
    }
}
