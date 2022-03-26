package JavaLab_22_03_25_Lez3.docente;

public class Tester
{
    public static void main(String[] args)
    {
//        //istanzio(creo/dichiaro) il mio oggetto di tipo persona, tramite una variabile di istanza
//        Persona ciccioPasticcio = new Persona();
//        ciccioPasticcio.nome = "Ciccio";
//        ciccioPasticcio.cognome = "Pasticcio";
//
//        System.out.println(ciccioPasticcio);
//
//        System.out.println();
//
//        Persona ciccioGraziani = new Persona("Ciccio", "Graziani");
//        System.out.println(ciccioGraziani);

        PersonaPrivate ciccioPasticcio = new PersonaPrivate("Ciccio", "Pasticcio");
        System.out.println(ciccioPasticcio);

        PersonaPrivate ciccioGraziani = new PersonaPrivate("Ciccio", "Graziani");
        System.out.println(ciccioGraziani);

        System.out.println("N.ro persone create: " + PersonaPrivate.numeroPersoneCreate);
    }
}
