package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola;

public class Test {
    public static void main(String[] args) {
        int voto = 189;
        Studente gatto = new Studente("marco", "verdi", 15);
        System.out.println(gatto);
        if (gatto.verificaPresenze(voto))
            System.out.println("Promosso");
        else
            System.out.println("Bocciato");

        System.out.println(gatto.getNome());
        Studente ciccio = new Studente("ciccio", "verdi", 15, 's',12,2,5,8);
        Studente gatto3 = new Studente("marco", "verdi", 15);
        Studente gatto4 = new Studente("marco", "verdi", 15);

        System.out.println("new Studente()");
        System.out.println(ciccio);
        System.out.println(gatto3);
        System.out.println(gatto4);
    }
}
