package JavaLab_22_03_25_Lez3.docente;

public class PersonaPrivate
{
    //quelli di seguito sono gli stati (attributi/variabili) di un potenziale oggetto, di tipo persona
    //QUELLE DI SEGUITO SONO VARIABILI DI ISTANZA
    private String nome;
    private String cognome;
    private String dataNascita;
    private Integer eta;
    public static Integer numeroPersoneCreate = 0;

    //dichiarazione dei costruttori (mediante overlaod)
    //Il mio costruttore dovrà avere STESSO NOME della mia classe (maiuscole e minuscole incluse)
    public PersonaPrivate()
    {
        numeroPersoneCreate++;
    }

    public PersonaPrivate(String nome,String cognome)
    {
        //La keyword "this" si riferisce alle variabili d'istanza dichiarate all'inizio della classe
        this.nome = nome;
        this.cognome = cognome;
        numeroPersoneCreate++;
    }

    public PersonaPrivate(String nome, String cognome, String dataNascita, Integer eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.eta = eta;
        numeroPersoneCreate++;
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

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
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
