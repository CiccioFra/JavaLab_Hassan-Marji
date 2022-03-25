package JavaLab_22_03_25_Lez3.es2_Banca.exception;
/** Nel nome di una nostra eccezione va sempre posta la parola "Exception"
 *      Estende sempre la classe "Exception" */
public class SaldoNonDisponibileException extends Exception{
    public SaldoNonDisponibileException(){
        //di solito è vuota, la customiziamo con un messaggio
        super("Saldo insufficiente!!! eccezione");    //richiama il costruttore della clase padre: il costruttore di Exception
    }

//    public SaldoNonDisponibileException(String messageException) {
//        super(messageException);
//    }
}
