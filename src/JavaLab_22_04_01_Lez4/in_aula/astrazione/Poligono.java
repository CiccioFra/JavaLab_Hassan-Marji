package JavaLab_22_04_01_Lez4.in_aula.astrazione;

/**
 * classe astratta che andrà a nascondere i miei dettagli implementativi
 * per classi specializzate (Triangolo, Quadrato, ecc..)
 * Quindi ci dirà cosa faccio, non come
 * @author Francesco
 */
public abstract class Poligono implements MisurePoligono{
    private Integer nrLati; //variabile che specifica il nr dei lati generale

    public Poligono(){

    }

    public Poligono(Integer nrLati) {
        this.nrLati = nrLati;
    }

    public Integer getNrLati() {
        return nrLati;
    }

    public void setNrLati(Integer nrLati) {
        this.nrLati = nrLati;
    }

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

    @Override
    public String toString() {
        return "Poligono{" +
                "nrLati=" + nrLati +
                '}';
    }
}
