package JavaLab_22_03_25_Lez3.es1_Persona;

public class PersonaPrivate {

    // variabili di ISTANZA
    private String nome;
    private String cognome;
    private String coloreCapelli;
    private Integer eta;

    // variabile di CLASSE con "static"
    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    public static int nrPersoneCreate = 0;

    // dichiarazione dei COSTRUTTORI
    public PersonaPrivate() {

    }

    public PersonaPrivate(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        nrPersoneCreate++;
    }

    public PersonaPrivate(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        nrPersoneCreate++;
    }

    @Override
    public String toString() {
        return "PersonaPrivate{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", coloreCapelli='" + coloreCapelli + '\'' +
                ", eta=" + eta +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(String coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }
}
