package JavaLab_22_04_01_Lez4.in_aula.super_costruttore;

public class Bambino extends Persona{
    private double pesoNascita;
    private boolean prematuro;

    public Bambino(){
        //siccome è vuoto richiamo il costruttore vuoto di persona
        super();
    }

    public Bambino(String nome, String cognome, double pesoNascita, boolean prematuro){
        super(nome, cognome);   // richiama il costruttore pieno di persona/
        // evito ridondanza  // evito boilerplate (codice ripetuto)
        // mancano gli attributi propri della classe..
        this.pesoNascita = pesoNascita;
        this.prematuro = prematuro;
    }

    public double getPesoNascita() {
        return pesoNascita;
    }

    public void setPesoNascita(double pesoNascita) {
        this.pesoNascita = pesoNascita;
    }

    public boolean isPrematuro() {
        return prematuro;
    }

    public void setPrematuro(boolean prematuro) {
        this.prematuro = prematuro;
    }

    @Override
    public String toString() {
        return "Bambino{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", pesoNascita=" + pesoNascita +
                ", prematuro=" + prematuro +
                '}';
    }


    //metodo statico che stampa le funzionalità dellì'oggetto
    //i metodi statici non possono lavorare con i metodi di istanza
}
