package JavaLab_22_04_08_Lez5.EsercizioProvincie;

import java.util.*;

public class Provincie_v2 {
    public static void main(String[] args) {

        int nrRegiobi;
        Map<String, Map> regione = new HashMap();

        int nrProvincie;
        Map<String, ArrayList> province = new HashMap();

        int nrCitta;
        ArrayList<String> citta = new ArrayList<>();
            // per inserimeto HarCode: new ArrayList<>(List.of("Chieri", "Trufolo"));

        System.out.println(regione);

        /** Creazione delle Regioni  */
        System.out.println("Quante Regioni vuoi istituire?");
        nrRegiobi = inputIntTastiera();
        for (int r = 0; r < nrRegiobi; r++ ){
            System.out.println("Inserisci il nome dalla " + (r+1) + "a Regione");
            regione.put(inputStrinTastiera(), null);

        }

        /** Creazione delle Provincie  */
        System.out.println("Quante Provincie vuoi realizzare nella Regione di " + regione.keySet());
        nrProvincie = inputIntTastiera();
        for (int p = 0; p < nrProvincie; p++ ){
            System.out.println("Inserisci il nome dalla " + (p+1) + "a Provincia");
            province.put(inputStrinTastiera(), null);

        }

        /** Creazione delle Città  */
        System.out.println("Quante Città vuoi costruire nella Provincia di " + province + "?");
        nrCitta = inputIntTastiera();
        for (int c = 0; c < nrCitta; c++ ){
            System.out.println("Inserisci il nome dalla " + (c+1) + "a Città");
            citta.add(inputStrinTastiera());

        }

        System.out.println("------------");
        System.out.println("** nr Regioni create: " + regione.size() +
                "\n elenco delle Regioni create: \n\t" + regione.keySet());
        System.out.println("** nr Province create: " + province.size() +
                "\n elenco delle Province create: \n\t" + province.keySet());
        System.out.println("** nr Città create: " + citta.size() +
                "\n elenco delle Città create: \n\t" + citta);





    }





    private static String inputStrinTastiera(){
        Scanner tastiera = new Scanner(System.in);
        String testo = String.valueOf(tastiera.nextLine());
        return testo;
    }

    private static int inputIntTastiera(){
        Scanner tastiera = new Scanner(System.in);
        int numero = Integer.valueOf(tastiera.nextInt());
        return numero;
    }

}
