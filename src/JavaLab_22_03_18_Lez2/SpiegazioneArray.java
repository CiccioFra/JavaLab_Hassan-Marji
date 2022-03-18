package JavaLab_22_03_18_Lez2;

public class SpiegazioneArray {
    public static void main(String[] args) {
        //dichiaro array:
        int[] array = new int[10];
        // inizializzo
        int[] arrayInizializzato = {10, 20, 30, 40};

        //itero
        for (int i =0; i < arrayInizializzato.length; i++){
            System.out.println("Elemento corrente [" + i + "] " + arrayInizializzato[i] );
        }
    }
}
