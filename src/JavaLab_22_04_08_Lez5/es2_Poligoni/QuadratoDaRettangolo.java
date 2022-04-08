package JavaLab_22_04_08_Lez5.es2_Poligoni;

public class QuadratoDaRettangolo extends Rettangolo {
    private double valoreLato; // nel quadrato i valore lato sarà uguale a tutti

    public QuadratoDaRettangolo(){

    }

    public QuadratoDaRettangolo(Integer nrLati, double valoreLato){
        this.valoreLato = valoreLato;
    }

    public QuadratoDaRettangolo(double valoreLato){
        this.valoreLato = valoreLato;
    }

    public Double calcolaArea(){
        return Math.pow(valoreLato, 2); //eleva alla potenza del 2° parametro
    }

    public Double calcolaPerimetro(){
        return valoreLato * getNrLati();
    }

    public double getValoreLato() {
        return valoreLato;
    }

    public void setValoreLato(double valoreLato) {
        this.valoreLato = valoreLato;
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "valoreLato=" + valoreLato +
                '}';
    }
}
