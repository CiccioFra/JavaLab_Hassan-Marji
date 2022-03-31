package JavaLab_22_03_25_Lez3.es3_Animale;

/**
 * @author Francesco
 * questa classe definisce attributi e metodi di un animale
 */
public class Animale {
    private String tipoAnimale;
    private String ambiente;
    private String tipoPelo;
    private int nrZampe;
    private double altezza;
    private double peso;
    private boolean domestico;

    /** costruttori */
    public Animale() {
    }

    public Animale(String tipoAnimale) {
        this.tipoAnimale = tipoAnimale;
    }

    /** getter e setter */
    public String getTipoAnimale() {
        return tipoAnimale;
    }

    public void setTipoAnimale(String tipoAnimale) {
        this.tipoAnimale = tipoAnimale;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public int getNrZampe() {
        return nrZampe;
    }

    public void setNrZampe(int nrZampe) {
        this.nrZampe = nrZampe;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    /** toString */
    @Override
    public String toString() {
        return "Animale{" +
                "tipoAnimale='" + tipoAnimale + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", tipoPelo='" + tipoPelo + '\'' +
                ", nrZampe=" + nrZampe +
                ", altezza=" + altezza +
                ", peso=" + peso +
                ", domestico=" + domestico +
                '}';
    }
}

