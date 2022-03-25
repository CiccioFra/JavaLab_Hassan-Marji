package JavaLab_22_03_25_Lez3.es2;

public class Tester {
    public static void main(String[] args) {
        ContoCorrente mioPrimoCC = new ContoCorrente("Fraqncesco", "IT7f8fd8t78", 50.00);
        double sommaDepositata = mioPrimoCC.deposito(20);
        System.out.println("hai depositato: " + sommaDepositata);
        double sommaPrelevata = mioPrimoCC.prelievo(15);
        System.out.println("hai prelevato: " + sommaPrelevata);
        System.out.println("Il tuo saldo: €" + mioPrimoCC.getSaldo());
    }
}
