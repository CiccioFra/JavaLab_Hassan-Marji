package JavaLab_22_04_08_Lez5.arrayList;

import java.util.ArrayList;
import java.util.List;

public class esArrayList {
    public static void main(String[] args) {
        List<String> nomiMacchine = new ArrayList<>();

        nomiMacchine.add("BMW");
        nomiMacchine.add("Citroen");
        nomiMacchine.add(1,"FIAT");

        for (String macchina : nomiMacchine )
            System.out.println(macchina);

        System.out.println("Lamda Notation ArrayList");
        nomiMacchine.forEach(macchina -> {
            System.out.println(macchina);
        });
    }       // metodi ricorrenti di ArrayList: add() set() remove() get() indexOf()
}