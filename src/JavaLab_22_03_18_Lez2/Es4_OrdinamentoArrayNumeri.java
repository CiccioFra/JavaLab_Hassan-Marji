package JavaLab_22_03_18_Lez2;

public class Es4_OrdinamentoArrayNumeri {
    public static void main(String[] args) {
        int[] arrDaOrdinare = {22, 15, 37, 26, 9, 55, 4};

        // ordinamento con metodo insertion sort
        for (int i = 0; i < arrDaOrdinare.length; i++) {
            for (int j = 0; j < arrDaOrdinare.length; j++) {
                if (arrDaOrdinare[i] < arrDaOrdinare[j]) {
                    // questo è uno swap
                    int temp = arrDaOrdinare[i];
                    arrDaOrdinare[i] = arrDaOrdinare[j];
                    arrDaOrdinare[j] = temp;
                }
            }
        }
        for (int a: arrDaOrdinare) {
            System.out.println(a);
        }
    }
}
