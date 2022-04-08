package JavaLab_22_04_01_Lez4.in_aula.es2_Poligoni;

public class Test {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4, 2);
        System.out.println(rettangolo.area(3,3));
        System.out.println(rettangolo.perimetro());


        Quadrato quadrato = new Quadrato(4,10);
        System.out.println("Area quadrato " + quadrato.calcolaArea());
        System.out.println("Perimetro quadrato " + quadrato.calcolaPerimetro());

        Poligono quadrato2 = new Quadrato(4,10);
        System.out.println("Area quadrato2 " + ((Quadrato) quadrato2).calcolaArea());
        System.out.println("Perimetro quadrato " + ((Quadrato) quadrato2).calcolaPerimetro());
    }
}
