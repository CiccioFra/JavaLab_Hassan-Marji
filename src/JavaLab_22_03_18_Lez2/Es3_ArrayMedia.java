package JavaLab_22_03_18_Lez2;

import java.util.Scanner;
/**
 * @author Francesco Ribatti
 * Implementare un programma che dato un array, ne esegua la media(scrivendo una funzione opportunamente commentata)
 */
public class Es3_ArrayMedia {
    /**
     * funzione che si occupa di calcolare la media di un array
     * passato da input
     * @param parFormaleArray : array di cui devo calcolare la media
     * @return  media dei parametri dell'array
     */
    public static double mediaArray(int[] parFormaleArray){
        double somma = 0;

        System.out.println("Il tuo Array contiene:");
        for (int j : parFormaleArray) {
            System.out.println(j);
            somma += j;
        }
        return somma / parFormaleArray.length;
    }

//    public static double CreaPopolaArray(){
//
//    }

        /**
         * @param args commento ai parametri formali
         */
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);

        System.out.println("quanti numeri vuoi inserire?");
        int[] array = new int[inputUtente.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("inserisci il " + (i + 1) + "° numero");
            array[i] = inputUtente.nextInt();
        }

        double media = mediaArray(array);

        System.out.println("La media dei numeri da te inseriti è " + media);
    }


}
