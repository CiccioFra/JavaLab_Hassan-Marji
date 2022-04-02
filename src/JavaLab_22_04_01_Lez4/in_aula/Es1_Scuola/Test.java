package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        String[] elencoRuoliDisponibili = {"Studente", "Docente", "Bidello"};

        String sceltaNomeScuola = "Scegli il nome della scuola a cui sei interessato";
        String nomeScuola = JOptionPane.showInputDialog(null, sceltaNomeScuola,
                "Immetti nome scuola", JOptionPane.INFORMATION_MESSAGE).trim();
        boolean x = nomeScuola.length() > 0;
//        boolean x = nomeScuola.replace(" ", "").length() > 0;

        String msgBenvenuto = "Buongiorno,\nBenvenuto all'istituto " + nomeScuola;
        JOptionPane.showMessageDialog(null, msgBenvenuto, "Benvenuto", JOptionPane.PLAIN_MESSAGE);

        String testoSceltaRuolo = "Scegli il tuo ruolo all'interno dell'istituto " + nomeScuola;
        String ruolo = JOptionPane.showInputDialog(null, testoSceltaRuolo, "Scegli il tuo ruolo", 1,null,elencoRuoliDisponibili,elencoRuoliDisponibili[0]);

        int voto = 189;
        Studente gatto = new Studente("marco", "verdi", 15);
        System.out.println(gatto);
        if (gatto.verificaPresenze(voto))
            System.out.println("Promosso");
        else
            System.out.println("Bocciato");

        System.out.println(gatto.getNome());
        Studente ciccio = new Studente("ciccio", "verdi", 15, 's',12,2,5,8);
        Studente gatto3 = new Studente("marco", "verdi", 15);
        Studente gatto4 = new Studente("marco", "verdi", 15);

        System.out.println("new Studente()");
        System.out.println(ciccio);
        System.out.println(gatto3);
        System.out.println(gatto4);

        System.out.println(nomeScuola);

        assert x : "trovato False; Fine Programma";
        System.exit(0);
    }
}
