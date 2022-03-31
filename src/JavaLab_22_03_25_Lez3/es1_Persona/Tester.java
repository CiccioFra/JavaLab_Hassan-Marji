package JavaLab_22_03_25_Lez3.es1_Persona;

public class Tester {
    public static void main(String[] args) {
        //istanzio un oggetto di tipo persona, tramite una VARIABILE DI ISTANZA
        Persona cico = new Persona();
        System.out.println(cico);

        System.out.println();

        Persona ciccioIngrassia = new Persona("Ciccio", "Ingrassia");
        ciccioIngrassia.coloreCapelli = "Verdi";
        System.out.println(ciccioIngrassia);

        Persona francoFranchi = new Persona("Franco", "Franchi");
        francoFranchi.eta = 55;
        System.out.println(francoFranchi);

    }
}
