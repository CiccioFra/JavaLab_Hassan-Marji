package JavaLab_22_04_01_Lez4.in_aula.Es1_Persona;

import org.jetbrains.annotations.NotNull;

public class Studente extends Persona {
    // variabili di ISTANZA
    private char sezione;
    private int annoScolastico;
    private final int GIORNI_DA_FREQUENTARE = 240;  // variabile d'istanza
    private final int GIORNI_PER_BOCCIATURA = 200;

    // variabile di CLASSE con "static"    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    //TODO

    /**
     * Costruttore vuoto
     */
    public Studente() {
    }

    /**
     * Costruttore limitato agli attributi della classe
     *
     * @param nome           nome dello studente
     * @param sezione        sezione della classe a cui è iscritto
     * @param annoScolastico anno scolastico
     */
    public Studente(String nome, char sezione, int annoScolastico) {
        super(nome, null, null);
        this.sezione = sezione;
        this.annoScolastico = annoScolastico;
    }

    public char getSezione() {
        return sezione;
    }

    public void setSezione(char sezione) {
        this.sezione = sezione;
    }

    public int getAnnoScolastico() {
        return annoScolastico;
    }

    public void setAnnoScolastico(int annoScolastico) {
        this.annoScolastico = annoScolastico;
    }

    public int getGIORNI_DA_FREQUENTARE() {
        return GIORNI_DA_FREQUENTARE;
    }

    public int getGIORNI_PER_BOCCIATURA() {
        return GIORNI_PER_BOCCIATURA;
    }

    /**
     * metodo che verifica il numero dei giorni di assenza dello studente
     * @param assenze   assenze dello studente
     * @param studente  oggeto studente
     * @return  true se ha fatto poche assenze (promosso)
     */
    public static boolean verificaAssenze(int assenze, @NotNull Studente studente) {
        return studente.getGIORNI_DA_FREQUENTARE() - assenze >= studente.getGIORNI_PER_BOCCIATURA();
    }

    public static boolean svolgimentoCompiti(boolean svolgeCompiti){
        return true;
    }
}
