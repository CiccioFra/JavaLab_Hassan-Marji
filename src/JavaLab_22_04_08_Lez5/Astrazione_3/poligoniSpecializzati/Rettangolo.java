package JavaLab_22_04_08_Lez5.Astrazione_3.poligoniSpecializzati;

import JavaLab_22_04_08_Lez5.Astrazione_3.Poligono;

import java.util.Map;

public class Rettangolo extends Poligono
{
    public Rettangolo() {
    }

    public Rettangolo(Map<String, Double> mappaLati) {
        super(mappaLati);
    }

    @Override
    public double calcolaArea() {
        return getMappaLati().get("base") * getMappaLati().get("altezza");
    }

    @Override
    public double calcolaPerimetro() {
        return (mappaLati.get("base") + getMappaLati().get("altezza")) * 2;
    }
}
