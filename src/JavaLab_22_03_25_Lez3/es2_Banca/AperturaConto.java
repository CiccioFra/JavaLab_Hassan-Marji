package JavaLab_22_03_25_Lez3.es2_Banca;

/**
 * @author Francesco
 */
public class AperturaConto {
    private String nomeIntestatario;
    private double sommaInizialeConto;

    public AperturaConto() {
    }

    /**
     *
     * @param nome  Nome dell'Intestario del C/C
     * @param conto Somma da accreditarsi all'apertura del C/C
     */
    public AperturaConto(String nome, double conto) {
        this.nomeIntestatario = nome;
        this.sommaInizialeConto = conto;
    }

    public String getNomeIntestatario() {
        return nomeIntestatario;
    }

    public void setNomeIntestatario(String nomeIntestatario) {
        this.nomeIntestatario = nomeIntestatario;
    }

    public double getSommaInizialeConto() {
        return sommaInizialeConto;
    }

    public void setSommaInizialeConto(double sommaInizialeConto) {
        this.sommaInizialeConto = sommaInizialeConto;
    }

    @Override
    public String toString() {
        return "AperturaConto{" +
                "\t nome dell'Intestatario del C/C  => '" + nomeIntestatario + "',\n" +
                "\t\t\t\t somma iniziale del conto\t\t =>  " + sommaInizialeConto + "\t\t}";
    }
}
