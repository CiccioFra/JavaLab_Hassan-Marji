package JavaLab_22_03_25_Lez3.es1_Persona;

/**
 * @author Francesco
 * Esempio che andrà a descrivere come creare una classe,
 * andando in seguito, ad istanziare l'oggetto della stessa.
 * */
public class Persona {
    // gli stati (attributi/variabili) di un potenziale oggetto, di tipo persona
    // variabili di ISTANZA
    public String nome;
    public String cognome;
    public String coloreCapelli;
    public Integer eta;

    //dichiarazione dei COSTRUTTORI (mediante overlaod)
    //Il costruttore DEVE avere STESSO NOME della classe (maiuscole e minuscole incluse)
    public Persona() {
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    // il metodo toString() è definito nella Classe Object,
    // permette l'output in testo, è implicito il suo richiamo (es in print();)
    // l'overload per far credere al sistema di eseguire il metodo "nativo", invece si trova il nostro..
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", coloreCapelli='" + coloreCapelli + '\'' +
                ", eta=" + eta +
                '}';
    }
}
