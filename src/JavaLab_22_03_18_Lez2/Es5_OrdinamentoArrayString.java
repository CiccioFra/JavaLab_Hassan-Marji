package JavaLab_22_03_18_Lez2;

import java.util.Arrays;

public class Es5_OrdinamentoArrayString {
    public static void main(String[] args) {
        String[] arrDaOrdinare = {"Cavallino", "cavallo", "Cavalluccio", "abc", "cde", "Zabaglione", "anatra"};
        String[] arrDaOrdinare2 = {"Cavallino", "cavallo", "Cavalluccio", "abc", "cde", "Zabaglione", "anatra"};
        String[] arrDaOrdinare3 = {"Cavallino", "cavallo", "Cavalluccio", "abc", "cde", "Zabaglione", "anatra"};
        String[] arrDaOrdinare4 = {"Cavallino", "cavallo", "Cavalluccio", "abc", "cde", "Zabaglione", "anatra"};

        Arrays.stream(arrDaOrdinare).sorted();
        for (String parola : arrDaOrdinare) {
            System.out.print(parola + " - ");
        }

        System.out.println("--------");

        Arrays.parallelSort(arrDaOrdinare2);
        for (String parola : arrDaOrdinare2) {
            System.out.print(parola + " - ");
        }

        System.out.println("--------");

        Arrays.sort(arrDaOrdinare3);
        for (String parola : arrDaOrdinare3) {
            System.out.print(parola + " - ");
        }

        System.out.println("--------");

        String[] alfabetico = new String[arrDaOrdinare4.length];
        for (int i = 0; i < arrDaOrdinare4.length; i++) {
//            parola.toString().toLowerCase();
            alfabetico[i] = arrDaOrdinare4[i].toString().toLowerCase();
            Arrays.sort(alfabetico);
            for (String parola : alfabetico) {
                System.out.print(parola + " - ");
            }
        }


        // compareStrings(s1, s2)
    }
}
