package JavaLab_22_04_08_Lez5.es2_Poligoni;

public class Poligono {
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

    @Override
    public String toString() {
        return "Poligono{" +
                "nrLati=" + nrLati +
                '}';
    }
}
