package JavaLab_22_04_08_Lez5.Astrazione_3;

import java.awt.desktop.AboutEvent;
import java.util.HashMap;
import java.util.Map;

public abstract class Poligono implements MisurePoligono {
    protected Map<String, Double> mappaLati = new HashMap<>();

    public Poligono() {
    }

    /**
     *
     * @param mappaLati hashMap dei lati mappati
     */
    public Poligono(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    public Map<String, Double> getMappaLati() {
        return mappaLati;
    }

    public void setMappaLati(Map<String, Double> mappaLati) {
        this.mappaLati = mappaLati;
    }

    @Override
    public abstract double calcolaArea();

    @Override
    public abstract double calcolaPerimetro();

    @Override
    public String toString() {
        return "Poligono{" +
                "mappaLati=" + mappaLati +
                '}';
    }
}
