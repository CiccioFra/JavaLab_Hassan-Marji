package JavaLab_22_04_08_Lez5.Astrazione_3;

import JavaLab_22_04_08_Lez5.Astrazione_3.poligoniSpecializzati.Rettangolo;

import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Map<String, Double> mappaRettangolo = new HashMap<>();
        mappaRettangolo.put("base", 10.0);      //.put()  aggiunge
        mappaRettangolo.put("altezza", 3.0);

        Rettangolo rettangolo = new Rettangolo(mappaRettangolo);

        System.out.println("Area di rettangolo: " + rettangolo.getClass().getName() + " = " + rettangolo.calcolaArea());
        // getClass().getName() prendi il nome della classe
        System.out.println("Perimetro di rettangolo: " + rettangolo.getClass().getName() + " = " + rettangolo.calcolaPerimetro());

        //-----
        System.out.println();
        //-----

        Map<String, Double> mappaTriangolo = new HashMap<>();
        mappaTriangolo.put("base", 10.0);      //.put()  aggiunge
        mappaTriangolo.put("altezza", 20.0);

        Rettangolo triangolo = new Rettangolo(mappaTriangolo);

        System.out.println("Area di Triangolo Rettangolo: " +
                triangolo.getClass().getName() + " = " + triangolo.calcolaArea());
        System.out.println("Perimetro di Triangolo Rettangolo: " +
                triangolo.getClass().getName() + " = " + triangolo.calcolaPerimetro());

        //-----
        System.out.println();
        //-----

        // iterazione sulle chiavi della HashMap
        System.out.println(" - Itero sull'intera mappa");
        for (String key : mappaRettangolo.keySet() ) {
//            System.out.println(key + " " + mappaRettangolo.get(key));
            System.out.println("Chiave \"" + key + "\" --> " + "valore: \"" + mappaRettangolo.get(key) + "\"");
        }

        System.out.println(" - Lambda Notation - Itero sulle key");
        mappaRettangolo.forEach((key, value) -> {       // key, value -> variabili locali senza tipizzazione
            System.out.println("Chiave \"" + key + "\" --> " + "valore: \"" + value + "\"");
        });

        System.out.println(" - Itero su .keySet() Lambda Notation - Itero sulle key");
        mappaRettangolo.keySet().forEach(key -> {
            System.out.println("Chiave \"" + key + "\" --> " + "valore: \"" + mappaRettangolo.get(key) + "\"");
        });

        // iterazione sui valori della HashMap
        System.out.println(" - Itero sull'intera mappa");
        for (Double value : mappaTriangolo.values()) {
            System.out.println("Valori: " + value);
        }

        /**
         * ne manca 1
         * copiare dal fine del docente
         */
        // inserisco la chiave col metodo .put(), in maniera auto fa la funzione di hach della chiave, che restituisce un intero lungo e corposo che il put va a normalizzare in base alla lunghezza della pmappa
        // bucket
    }
}
