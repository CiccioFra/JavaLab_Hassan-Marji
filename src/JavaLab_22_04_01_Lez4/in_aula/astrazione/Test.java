package JavaLab_22_04_01_Lez4.in_aula.astrazione;

public class Test {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(4.0);
        System.out.println("Area quadrato " + quadrato.calcolaArea());
        System.out.println("Area perimetro " + quadrato.calcolaPerimetro());

        //--------oppure---------

        Poligono quadrato2 = new Quadrato(4.0);
        System.out.println("Area quadrato2 " + quadrato2.calcolaArea());
        System.out.println("Area perimetro " + quadrato2.calcolaPerimetro());
    }
}
