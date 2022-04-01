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
    private final int GIORNI_DI_SCUOLA = 240;
    private Integer nrCompitiAssegnati;
    private Integer nrCompitiSvolti;

    // variabile di CLASSE con "static"    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    public static Integer ntStudenti = 0;

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
        ntStudenti++;
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
        ntStudenti++;
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
        ntStudenti++;
    }

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

    public static Integer getNtStudenti() {
        return ntStudenti;
    }

    public static void setNtStudenti(Integer ntStudenti) {
        Studente.ntStudenti = ntStudenti;
    }

    /** getter e setter */


    @Override
    public String toString() {
        return "Studente{" +
                "sezione=" + sezione +
                ", annoScolastico=" + annoScolastico +
                ", GIORNI_DI_SCUOLA=" + GIORNI_DI_SCUOLA +
                ", nrCompitiAssegnati=" + nrCompitiAssegnati +
                ", nrCompitiSvolti=" + nrCompitiSvolti +
                '}';
    }

    /**
     * metodo che verifica il numero dei giorni di assenza dello studente
     * @param giorniFrequentati  assenze dello studente
     * @param studente oggetto studente
     * @return true se ha fatto poche assenze (forse promosso :)
     */
    public static boolean verificaAssenze(Studente studente, int giorniFrequentati) {
        return giorniFrequentati / GIORNI_DI_SCUOLA  <= 0.7;
    }

    public static boolean svolgimentoCompiti(boolean svolgeCompiti) {
        return true;
    }
}
