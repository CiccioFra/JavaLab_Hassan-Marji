package JavaLab_22_04_01_Lez4.in_aula.super_costruttore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francesco
 */
public class Tester {
    public static void main(String[] args) {
        Persona personaGenerica = new Persona("Ciccio", "Pasticcio");
        System.out.println(personaGenerica);

        // ho 2 modi per creare bambino
        Bambino bambinetto = new Bambino("Ciccino", "Piccio", 3, true);
        System.out.println(bambinetto);
        //non stampa nome e cognome perchè mancano nel toString, implementati, li stampa

        System.out.println("La Classe di appartenenze delle mie istanze (personaGenerica) sono: " + personaGenerica.getClass().getName());
        System.out.println("La Classe di appartenenze delle mie istanze (bambinetto) sono: " + bambinetto.getClass().getName());

        //secondo modo di istanziare POLIMORFISMO
        List<String> stringList = new ArrayList<>();    // questo è polimorfismo
        Persona nnuovoPargolo = new Bambino();      //Persona() - Tipo Apparente       Bambino() - Tipo Effettivo
    }
}
