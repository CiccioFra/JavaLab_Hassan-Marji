package JavaLab_22_03_25_Lez3.docente.esercizioDue;

public class Tester
{
    public static void main(String[] args)
    {
        //creo il nome della variabile d'istanza che devo usare
        ContoCorrente contoPietro = new ContoCorrente("Hassan", "IT42FATEMIUNBONIFICO", 0.0);
        double sommaDepositata = contoPietro.deposito(20.00);
        System.out.println("Sei un po più ricco. hai depositato: " + sommaDepositata);
        double sommaPrelevata = contoPietro.prelievo(10.00);
        System.out.println("Sei più povero: hai prelevato: " + sommaPrelevata);
        System.out.println(contoPietro);
    }
}
