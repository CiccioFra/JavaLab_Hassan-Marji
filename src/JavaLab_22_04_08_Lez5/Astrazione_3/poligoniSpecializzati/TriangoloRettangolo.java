package JavaLab_22_04_08_Lez5.Astrazione_3.poligoniSpecializzati;

import JavaLab_22_04_08_Lez5.Astrazione_3.Poligono;

import java.util.Map;

public class TriangoloRettangolo extends Poligono {
    public TriangoloRettangolo() {
    }

    public TriangoloRettangolo(Map<String, Double> mappaLati) {
        super(mappaLati);
    }

    @Override
    public double calcolaArea() {
        return getMappaLati().get("catetoUno") * getMappaLati().get("catetoDue") / (double) 2;
    }

    @Override
    public double calcolaPerimetro() {
        double a = getMappaLati().get("catetoUno");
        double b = getMappaLati().get("catetoDue");
        double ipotenusa = (a + b)/12*5;
        return a + b + ipotenusa;
    }
}