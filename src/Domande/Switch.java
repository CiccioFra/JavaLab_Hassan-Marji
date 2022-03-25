package Domande;

import static JavaLab_22_03_11_Lez1.dalDocente.CalcolatriceFunzioni.*;

public class Switch {
    public static void main(String[] args) {
        int risultato;
        int primoNumero = 0;
        int secondoNumero = 0;

        for (int operatore = 0; operatore < 5; operatore++) {
            switch (operatore) {
                case 1: // somma
                    risultato = somma(primoNumero, secondoNumero);
                    System.out.println("Il risultato è: " + risultato);
                    break;
                case 2: // differenza
                    System.out.println("Il risultato della differenza è: " + differenza(primoNumero, secondoNumero));
                    break;
                case 3: // prodotto
                    System.out.println("Il risultato del prodotto è: " + prodotto(primoNumero, secondoNumero));
                    break;
                case 4: // divisione
                    System.out.println("Il risultato della divisione è: " + divisione(primoNumero, secondoNumero));
                    break;
                default:
                    System.out.println("operazione non presente!");
                    break;
            }

            switch (operatore) {
                case 1 -> { // somma
                    risultato = somma(primoNumero, secondoNumero);
                    System.out.println("Il risultato è: " + risultato);
                }
                case 2 -> // differenza
                        System.out.println("Il risultato della differenza è: " + differenza(primoNumero, secondoNumero));
                case 3 -> // prodotto
                        System.out.println("Il risultato del prodotto è: " + prodotto(primoNumero, secondoNumero));
                case 4 -> // divisione
                        System.out.println("Il risultato della divisione è: " + divisione(primoNumero, secondoNumero));
                default -> System.out.println("operazione non presente!");
            }
        }
    }
}
