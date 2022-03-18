package JavaLab_22_03_11_Lez1.Calcolatrice;

import java.util.Scanner;

/**
 * documentazione
 * @author Francesco Ribatti
 * Implementazione esercizio divisibilità
 * sout
 * psvm - main
 */
public class Calcolatrice {
    /**
     * @param par1
     */
    public static void main(String[] args) {
        String messaggio = "";
        int par1, par2;
        double angolo, risultato = 0;

        // input operatore dall'utente
        Scanner Tastira = new Scanner(System.in);
        System.out.println("Scegli l'operazione che vuoi eseguire tra: \n" +
                " 1) Somma" +
                " 2) Sottrazione" +
                " 3) Moltiplicazione" +
                " 4) Divisione" +
                " 5) Seno" +
                " 6) Coseno" +
                " 7) Tangente");
        String operazione = String.valueOf(Tastira.nextLine());
//        int operazione = Tastira.nextInt();

        System.out.println("Inserisci primo parametro: ");
        par1 = Integer.parseInt(Tastira.nextLine());

        switch (operazione) {
            case "1":   // Somma
                messaggio = "La somma è: ";
                System.out.println("Inserisci secondo parametro: ");
                par2 = Integer.parseInt(Tastira.nextLine());
                risultato = par1 + par2;
                break;
            case "2":   // Differenza
                messaggio = "La differenza è: ";
                System.out.println("Inserisci secondo parametro: ");
                par2 = Integer.parseInt(Tastira.nextLine());
                risultato = par1 - par2;
                break;
            case "3":   // Prodotto
                messaggio = "Il prodotto è: ";
                System.out.println("Inserisci secondo parametro: ");
                par2 = Integer.parseInt(Tastira.nextLine());
                risultato = par1 * par2;
                break;
            case "4":   // Divisione
                messaggio = "La Divisione è: ";
                do {
                    System.out.println("Inserisci secondo parametro diverso da 0: ");
                    par2 = Integer.parseInt(Tastira.nextLine());
                }
                while (par2 == 0);
                risultato = par1 / par2;
                break;
            case "5":   // Seno
                messaggio = "Il seno è: ";
                System.out.println("Inserisci l'angolo: ");
                angolo = Double.parseDouble(Tastira.nextLine());
                double seno = Math.sin(Math.toRadians(angolo));
                risultato = par1 * seno;
                break;
            case "6":   // Coseno
                messaggio = "Il coseno è: ";
                System.out.println("Inserisci l'angolo: ");
                angolo = Double.parseDouble(Tastira.nextLine());
                double coseno = Math.cos(Math.toRadians(angolo));
                risultato = par1 * coseno;
                break;
            case "7":   // Tangente
                messaggio = "La tangente è: ";
                System.out.println("Inserisci l'angolo: ");
                angolo = Double.parseDouble(Tastira.nextLine());
                double tangente = Math.tan(Math.toRadians(angolo));
                risultato = par1 * tangente;
                break;
            default:
                System.out.println("Non hai scelto un'operazione in elenco");
                System.exit(1);
        }

        System.out.println(messaggio + risultato);
    }
}
