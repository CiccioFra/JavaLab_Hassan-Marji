package JavaLab_22_03_25_Lez3.docente.esercizioDue;

/**
 * @author Hassan Marji
 * Questa classe andrà a rappresentare gli stati ed i comportamenti di un conto corrente
 * studiato ed analizzato
 * */
public class ContoCorrente
{
    private String titolare;
    private String IBAN;
    private double saldo;

    public ContoCorrente()
    {

    }

    /**
     * Costruttore pieno che rappresenta la creazione del mio oggetto conto corrente
     * @param titolare Titolare del conto corrente
     * @param IBAN numero iban che rappresenta in modo univoco il numero del mio CC
     * @param saldo saldo attuale del mio conto corrente
     * */
    public ContoCorrente(String titolare, String IBAN, double saldo)
    {
        this.titolare = titolare;
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Funzione che va ad effettuare il prelievo di una somma specificata in input
     * @param sommaPrelevare somma da prelevare
     * @return somma prelevata da far visualizzare in output all'utente
     * @implNote La somma da prelevare deve essere minore o uguale al saldo attualmente disponibile
     * */
    public double prelievo(double sommaPrelevare)
    {
        //controllo che il saldo disponibile sia maggiore o uguale alla somma da prelevare
        if(this.saldo >= sommaPrelevare)
        {
            // se vero, posso prelevare
            this.saldo = this.saldo - sommaPrelevare;
            return sommaPrelevare;
        }

        System.out.println("SEI POVERO, NON PUOI PRELEVARE PIU' DI QUANTO HAI. SVEGLIATI!");
        return Double.NEGATIVE_INFINITY;
    }

    /**
     * Funzione che si occupa di depositare una determinata somma di denaro specificata in input
     * @param sommaDeposito somma da depositare
     * @return somma depositata
     * */
    public double deposito(double sommaDeposito)
    {
        this.saldo = this.saldo + sommaDeposito;
        return sommaDeposito;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolare='" + titolare + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
