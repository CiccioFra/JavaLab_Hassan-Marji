package JavaLab_22_03_25_Lez3.es2_Banca;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Buongiorno, Benvenuto nella tua banca preferita.\n" +
                "Siamo lieti che tu voglia aprire un Conto Corrente presso di noi!\n" +
                "Quanto vuoi depositare per l'apertura del conto?");
        ContoCorrente mioPrimoCC = new ContoCorrente("Francesco", "IT7f8fd8t78", 50.00);
        double sommaDepositata = mioPrimoCC.deposito(20);
        System.out.println("hai depositato: " + sommaDepositata);
        double sommaPrelevata = mioPrimoCC.prelievo(200);
        System.out.println("hai prelevato: " + sommaPrelevata);
        System.out.println("Il tuo saldo: €" + mioPrimoCC.getSaldo());
    }
}
