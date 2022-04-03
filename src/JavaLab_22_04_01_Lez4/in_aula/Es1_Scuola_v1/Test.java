package JavaLab_22_04_01_Lez4.in_aula.Es1_Scuola_v1;

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
        String ruoloScelto = (String) JOptionPane.showInputDialog(null,
                testoSceltaRuolo, "Scegli il tuo ruolo", 3, null, elencoRuoliDisponibili, elencoRuoliDisponibili[0]);

        switch (ruoloScelto) {
            case "Studente":
                Studente studente = new Studente();
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire il nome dello studente"));
                studente.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome dello studente"));
                studente.setEta(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'età dello studente")));
                studente.setSezione(JOptionPane.showInputDialog(null, "Inserire la sezione del corso di studi dello studente"));
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire l'anno scolastico dello studente"));
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire quanti giorni di presenza ha lo studente (max240)"));
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire quanti compiti sono stati assegnati allo studente"));
                studente.setNome(JOptionPane.showInputDialog(null, "Inserire quanti compiti ha svolto lo studente"));
                System.out.println(studente);
                JOptionPane.showMessageDialog(null, studente, "scheda dello studente " + studente.getNome(), -1);
                break;
            case "Docente":
                Docente docente = new Docente();
                docente.setNome(JOptionPane.showInputDialog(null, "Inserire il nome del docente"));
                docente.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome del docente"));
                docente.setEta(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'età del docente")));
                docente.setSezione(JOptionPane.showInputDialog(null, "Inserire la sezione del corso di studi il cui il docente insegna"));
                docente.setNrCompitiAssegnati(Integer.valueOf(JOptionPane.showInputDialog(null, "Inserire quanti compiti ha assegnato il docente")));
                System.out.println(docente);
                JOptionPane.showMessageDialog(null, docente, "scheda del docente " + docente.getNome(), -1);
                break;
            case "Bidello":
                Bidello bidello = new Bidello();
                bidello.setNome(JOptionPane.showInputDialog(null, "Inserire il nome del bidello"));
                bidello.setCognome(JOptionPane.showInputDialog(null, "Inserire il cognome del bidello"));
                bidello.setEta(Integer.parseInt(JOptionPane.showInputDialog(null, "Inserire l'età del bidello")));
                bidello.setSezione(JOptionPane.showInputDialog(null, "Inserire quanti sezioni deve pulire il bidello"));
                System.out.println(bidello);
                JOptionPane.showMessageDialog(null, bidello, "scheda del bidello " + bidello.getNome(), -1);
                break;
            default:
                System.exit(0);
                int voto = 189;
                Studente gatto = new Studente("marco", "verdi", 15);
                System.out.println(gatto);
                if (gatto.verificaPresenze(voto))
                    System.out.println("Promosso");
                else
                    System.out.println("Bocciato");

                System.out.println(gatto.getNome());
                Studente ciccio = new Studente("ciccio", "verdi", 15, "s", 12, 2, 5, 8);
                Studente gatto3 = new Studente("marco", "verdi", 15);
                Studente gatto4 = new Studente("marco", "verdi", 15);

                System.out.println("new Studente()");
                System.out.println(ciccio);
                System.out.println(gatto3);
                System.out.println(gatto4);
                break;
        }

        System.out.println(nomeScuola);
        System.out.println(ruoloScelto);

        assert x : "trovato False; Fine Programma";
        System.exit(0);
    }
}
