package JavaLab_22_03_25_Lez3.es1;

public class Tester {
    public static void main(String[] args) {
        //istanzio un oggetto di tipo persona, tramite una VARIABILE DI ISTANZA
        Persona francoFranchi = new Persona();
        System.out.println(francoFranchi);

        System.out.println();

        Persona ciccioIngrassia = new Persona("Ciccio", "Ingrassia");
        System.out.println(ciccioIngrassia);

        PersonaPrivate ciccio = new PersonaPrivate();
        //ciccio.nome = "Ciccio";
    }


}
