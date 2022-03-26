package JavaLab_22_03_25_Lez3.docente;

/**
 * @author Hassan Marji
 * Esempio che andrà a descrivere come creare una classe,
 * andando in seguito, ad istanziare l'oggetto della stessa.
 * */
public class Persona
{
    //quelli di seguito sono gli stati (attributi/variabili) di un potenziale oggetto, di tipo persona
    //QUELLE DI SEGUITO SONO VARIABILI DI ISTANZA
    public String nome;
    public String cognome;
    public String dataNascita;
    public Integer eta;

    //dichiarazione dei costruttori (mediante overlaod)
    //Il mio costruttore dovrà avere STESSO NOME della mia classe (maiuscole e minuscole incluse)
    public Persona()
    {
        System.out.println("SCEMO CHI LEGGE UNO");
    }

    public Persona(String nome,String cognome)
    {
        System.out.println("SCEMO CHI LEGGE DUE");
        //La keyword "this" si riferisce alle variabili d'istanza dichiarate all'inizio della classe
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, String dataNascita, Integer eta)
    {
        System.out.println("SCEMO CHI LEGGE TRE");
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.eta = eta;
    }

    @Override
    public String toString()
    {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", eta=" + eta +
                '}';
    }
}
