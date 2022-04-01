package JavaLab_22_04_01_Lez4.in_aula.astrazione;

public interface MisurePoligono {

    /**
     * metodo che andrà a calcolare il perimetro di un determinato poligono
     * @return  perimetro tramite la somma del valore dei dati per il nr dei lati
     */
    public abstract Double calcolaPerimetro();
    /**
     * metodo che andrà a calcolare l'area di un determinato poligono
     * @return  area tramite una determinata formula
     */
    public abstract Double calcolaArea();
}
