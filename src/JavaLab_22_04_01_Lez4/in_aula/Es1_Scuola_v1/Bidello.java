package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola_v1;

import JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola_v2.Persona;

/**
 * @author Francesco
 * Definizione dell'oggetto Bidello
 */
public class Bidello extends Persona {
    // variabili di ISTANZA
    private String sezione;
    private Integer nrBidello; // gli sarà assegnata la variabile static nrStudenti per conteggiare gli studenti creati

    // variabili di CLASSE con "static" visibili da tutta la classe
    private static Integer nrBidelli = 1;  // sarà assegnata alla variabile nrStudente per conteggiare gli studenti creati

    /** Costruttore vuoto */
    public Bidello() {
        nrBidello = nrBidelli++;
    }

    /**
     * Costruttore dell'oggetto Bidello
     * @param nome           Nome del bidello
     * @param cognome        Cognome della bidello
     * @param eta            Età della bidello
     * @param sezione        sezioni da pulire
     */
    public Bidello(String nome, String cognome, int eta, String sezione) {
        super(nome, cognome, eta);
        this.sezione = sezione;
        nrBidello = nrBidelli++;
    }

    /**
     * Costruttore PARZIALE dell'oggetto Bidello
     * per iscrizione alla scuola senza mansioni
     * @param nome           Nome dello bidello
     * @param cognome        Cognome della bidello
     * @param eta            Età della bidello
     */
    public Bidello(String nome, String cognome, int eta) {
        super(nome, cognome, eta);
        nrBidello = nrBidelli++;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    /** getter e setter */


    @Override
    public String toString() {
        return "Scheda del bidello:\n" +
                "nome='" + getNome() + "\'\n" +
                "cognome='" + getCognome() + "\'\n" +
                "eta=" + getEta() + "\'\n" +
                "sezioni=" + sezione + "\'\n" +
                "bidello nr° " + nrBidello;
    }
}
