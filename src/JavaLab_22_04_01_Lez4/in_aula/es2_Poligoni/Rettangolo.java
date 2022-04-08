package JavaLab_22_04_01_Lez4.in_aula.es2_Poligoni;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo() {
    }

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double perimetro(double base, double altezza){
        return base * 2 + altezza * 2;
    }

    public double area(double base, double altezza){
        return base * altezza;
    }
}
