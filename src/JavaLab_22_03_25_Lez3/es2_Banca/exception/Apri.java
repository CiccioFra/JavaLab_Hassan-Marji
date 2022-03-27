package JavaLab_22_03_25_Lez3.es2_Banca.exception;

import JavaLab_22_03_25_Lez3.es2_Banca.AperturaConto;

public class Apri {
    public static void main(String[] args) {
        String nomeIntestatario = "Ciccio";
        double sommaInizialeConto = 15.3;

        AperturaConto conto = new AperturaConto(nomeIntestatario, sommaInizialeConto);
        System.out.println(conto);
    }
}
