package JavaLab_22_04_08_Lez5.EsercizioProvincie;

import java.util.*;

public class Provincie_v2 {
    public static void main(String[] args) {
        ArrayList<String> citta = new ArrayList<>(List.of("Chieri", "Trufolo"));
        citta.add("Terza Città");

        Map<String, ArrayList> provincia = new HashMap();
        provincia.put("Torino", citta);

        Map<String, Map> regione = new HashMap();
        regione.put("Piemonete", provincia);

        System.out.println(regione);


        Scanner tastiera = new Scanner(System.in);
        String inserimento = String.valueOf(tastiera);
        int nrCitta = Integer.parseInt(tastiera);

        System.out.println("Quante città vuoi inserire?" + nrCitta);

        for (int i = 0; i < nrCitta; i++ ){
            citta.add(inserimento);
        }





    }





    private static String inserisciRegione(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una Regione" + tastiera.nextLine());
        return String.valueOf(tastiera);
    }

    private static String inserisciProvincia(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una Provincia" + tastiera.nextLine());
        return String.valueOf(tastiera);
    }

    private static String inserisciCitta(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una citta" + tastiera.nextLine());
        return String.valueOf(tastiera);
    }
}
