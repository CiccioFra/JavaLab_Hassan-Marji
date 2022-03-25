package JavaLab_22_03_25_Lez3.es1;

public class Persona {
    public String nome;
    public String cognome;
    public String coloreCapelli;
    public Integer eta;

    // dichiarazione dei costruttori
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
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", coloreCapelli='" + coloreCapelli + '\'' +
                ", eta=" + eta +
                '}';
    }
}
