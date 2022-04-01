package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola;

/**
 * @author Francesco
 * Definizione dell'oggetto Studente
 */
public class Studente extends Persona {
    // variabili di ISTANZA
    private Character sezione;
    private Integer annoScolastico;
    private Integer giorniFrequentati;
    private Integer nrCompitiAssegnati;
    private Integer nrCompitiSvolti;

    // variabile di CLASSE con "static"    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    private static final int GIORNI_DI_SCUOLA = 240;
    private static final int GIORNI_ASSENZE_DA_SCUOLA = 50;
    public static Integer nrStudenti = 0;

    /** Costruttore vuoto */
    public Studente() {
    }

    /**
     * Costruttore dell'oggetto Studente
     * @param nome           Nome dello studente
     * @param cognome        Cognome della studente
     * @param eta            Età della studente
     * @param sezione        sezione a cui è iscritto
     * @param annoScolastico anno scolastico
     * @param giorniFrequentati     giorni frequentati dalle Studente
     * @param nrCompitiAssegnati    compiti assegnati allo Studente
     * @param nrCompitiSvolti       compiti svolti dallo Studente
     */
    public Studente(String nome, String cognome, int eta,
                    Character sezione, Integer annoScolastico, Integer giorniFrequentati,
                    Integer nrCompitiAssegnati, Integer nrCompitiSvolti) {
        super(nome, cognome, eta);
        this.sezione = sezione;
        this.annoScolastico = annoScolastico;
        this.giorniFrequentati = giorniFrequentati;
        this.nrCompitiAssegnati = nrCompitiAssegnati;
        this.nrCompitiSvolti = nrCompitiSvolti;
        nrStudenti++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Studente
     * per iscrizione alla scuola senza frequenza immediata
     * @param nome           Nome dello studente
     * @param cognome        Cognome della studente
     * @param eta            Età della studente
     */
    public Studente(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        nrStudenti++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Studente
     * per fare delle prove
     * @param nome           nome dello studente
     * @param sezione        sezione a cui è iscritto
     * @param annoScolastico anno scolastico
     */
    public Studente(String nome, Character sezione, Integer annoScolastico) {
        super(nome, null, null);
        this.sezione = sezione;
        this.annoScolastico = annoScolastico;
        nrStudenti++;
    }

    /** getter e setter */
    public Character getSezione() {
        return sezione;
    }

    public void setSezione(Character sezione) {
        this.sezione = sezione;
    }

    public Integer getAnnoScolastico() {
        return annoScolastico;
    }

    public void setAnnoScolastico(Integer annoScolastico) {
        this.annoScolastico = annoScolastico;
    }

    public Integer getGiorniFrequentati() {
        return giorniFrequentati;
    }

    public void setGiorniFrequentati(Integer giorniFrequentati) {
        this.giorniFrequentati = giorniFrequentati;
    }

    public int getGIORNI_DI_SCUOLA() {
        return GIORNI_DI_SCUOLA;
    }

    public int getGIORNI_ASSENZE_DA_SCUOLA() {
        return GIORNI_ASSENZE_DA_SCUOLA;
    }

    public Integer getNrCompitiAssegnati() {
        return nrCompitiAssegnati;
    }

    public void setNrCompitiAssegnati(Integer nrCompitiAssegnati) {
        this.nrCompitiAssegnati = nrCompitiAssegnati;
    }

    public Integer getNrCompitiSvolti() {
        return nrCompitiSvolti;
    }

    public void setNrCompitiSvolti(Integer nrCompitiSvolti) {
        this.nrCompitiSvolti = nrCompitiSvolti;
    }

    public static Integer getNrStudenti() {
        return nrStudenti;
    }

    public static void setNrStudenti(Integer nrStudenti) {
        Studente.nrStudenti = nrStudenti;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", eta=" + getEta() +
                ", sezione=" + sezione +
                ", annoScolastico=" + annoScolastico +
                ", giorniFrequentati=" + giorniFrequentati +
                ", nrCompitiAssegnati=" + nrCompitiAssegnati +
                ", nrCompitiSvolti=" + nrCompitiSvolti +
                ", nr Studente=" + nrStudenti +
                '}';
    }

    /**
     * metodo che verifica il numero dei giorni di assenza dello studente
     * @param ggFrequenza  giorni di presenza a scuola dello studente
     * @return true se ha fatto poche assenze (forse promosso :)
     */
    public boolean verificaPresenze(int ggFrequenza) {
        setGiorniFrequentati(ggFrequenza);
        return GIORNI_DI_SCUOLA - getGiorniFrequentati() <= GIORNI_ASSENZE_DA_SCUOLA;
    }

    public boolean svolgimentoCompiti(boolean svolgeCompiti) {
        return true;
    }
}
