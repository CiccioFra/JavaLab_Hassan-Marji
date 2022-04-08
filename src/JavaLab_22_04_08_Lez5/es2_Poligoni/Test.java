package JavaLab_22_04_08_Lez5.es2_Poligoni;

public class Test {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(4,10);
        System.out.println("Area quadrato " + quadrato.calcolaArea());
        System.out.println("Area perimetro " + quadrato.calcolaPerimetro());

        Poligono quadrato2 = new Quadrato(4,10);
        System.out.println("Area quadrato2 " + ((Quadrato) quadrato2).calcolaArea());
        System.out.println("Area perimetro " + ((Quadrato) quadrato2).calcolaPerimetro());
    }
}
