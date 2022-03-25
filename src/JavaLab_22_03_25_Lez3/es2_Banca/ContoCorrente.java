package JavaLab_22_03_25_Lez3.es2_Banca;

import JavaLab_22_03_25_Lez3.es2_Banca.exception.SaldoNonDisponibileException;

/**
 * @author Fracnesco
 * Questa classe andrà a rappresententare gli stati ed i comportamenti di un conto corrente studiato ed analizzato
 */
public class ContoCorrente {
    private String titolare;
    private String iban;
    private double saldo;

    public ContoCorrente() {

    }

    /**
     * Costrutore pieno che rappresenta la creazione del mio ogetto c/c
     *
     * @param titolare Titolare del conto corrente
     * @param iban     numero iban che rappresenta in modo univoco il numero del c/c
     * @param saldo    saldo attuale del mio c/c
     */
    public ContoCorrente(String titolare, String iban, double saldo) {
        this.titolare = titolare;
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * funzione che va ad effettuare una somma specificata in input
     *
     * @param sommaPrelevare somma da prelevare
     * @return somma prelevata da far visualizzare in out dall'utente
     * @implNote la somma da prelevare deve essere minore o uguale al saldo attualmente disponibile
     */
    public double prelievo(double sommaPrelevare) {
        // controllo che il saldo disponibile sia magiore o ubuale alla somma da prelevare
        try {
            if(this.saldo < sommaPrelevare)
                throw new SaldoNonDisponibileException();

            this.saldo -= sommaPrelevare;
            return sommaPrelevare;
        }
        catch (SaldoNonDisponibileException ex) {    //cosa dobbiamo catturare
            System.out.println(ex.getMessage());
        }

//        if (this.saldo >= sommaPrelevare) {
//            this.saldo -= sommaPrelevare;
//            return sommaPrelevare;
//        }
//        System.out.println("Sei povero, non puoi prelevare più di quanto hai..");
//        return Double.NEGATIVE_INFINITY;    //va bene solo con double
        return 0;
    }

    /**
     * Funzione
     * @param sommaDepositata
     * @return
     */
    public double deposito(double sommaDepositata){
        this.saldo += sommaDepositata;
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolare='" + titolare + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
