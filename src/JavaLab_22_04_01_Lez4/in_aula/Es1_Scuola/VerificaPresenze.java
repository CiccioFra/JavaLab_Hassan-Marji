package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola;

public class VerificaPresenze extends Studente{

    /**
     * metodo che verifica il numero dei giorni di assenza dello studente
     * @param ggFrequenza  giorni di presenza a scuola dello studente
     * @return true se ha fatto poche assenze (forse promosso :)
     */
    public boolean verificaPresenze(int ggFrequenza) {
        setGiorniFrequentati(ggFrequenza);
        return getGiorniFrequentati() % getGIORNI_DI_SCUOLA() >= 0.7;
    }
}
