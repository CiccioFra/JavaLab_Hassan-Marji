package JavaLab_22_04_01_Lez4.in_aula.Es1_Persona;

/**
 * @author Francesco Ribatti
 */
public class Persona {
    // variabili d'istanza
    private String nome;
    private String cognome;
    private Integer eta;

    // variabile di CLASSE con "static"    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    public static int nrPersoneCreate = 0;

    public Persona(){
    }

    /**
     *
     * @param nome      Nome della persona
     * @param cognome   Cognome della persona
     * @param eta       Età della persona
     */
    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        nrPersoneCreate++;
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

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }

    /**
     * @param persona   Oggetto di tipo Persona, inseriamo tutti gli attributi di una persona generica
     */
    public static void printNome(Persona persona){
        System.out.println(persona.getNome());
    }
}
