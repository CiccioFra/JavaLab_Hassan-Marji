package JavaLab_22_04_08_Lez5.EsercizioProvincie;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Provincie_v1 {
    public static void main(String[] args) {
        ArrayList<String> citta = new ArrayList<>(List.of("Chieri", "Trufolo"));
        citta.add("Terza Città");

        Map<String, ArrayList> provincia = new HashMap();
        provincia.put("Torino", citta);

        Map<String, Map> regione = new HashMap();
        regione.put("Piemonete", provincia);

        System.out.println(regione);
    }
}
