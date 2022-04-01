package JavaLab_22_04_01_Lez4.in_aula.astrazione;

public class Quadrato extends Poligono{
    private double valoreLato;
    public static final Integer NUMERO_LATI = 4;

    public Quadrato(){
        super();
    }

    public Quadrato(Double valoreLato){
        super(NUMERO_LATI);
        this.valoreLato = valoreLato;
    }

    @Override
    public Double calcolaPerimetro() {
        return this.valoreLato * NUMERO_LATI;
    }

    @Override
    public Double calcolaArea() {
        return this.valoreLato * this.valoreLato;
    }
}
