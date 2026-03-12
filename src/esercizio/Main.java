package esercizio;

import interfaces.Working;

public class Main {
    static void main(String[] args) {

//        Dipendente marco = new Dipendente("D1", 1200, Dipartimento.PRODUZIONE);
//        Dipendente sara = new Dipendente("D2", 2000, Dipartimento.VENDITE);
//        Dipendente pietro = new Dipendente("D3", 3000, Dipartimento.AMMINISTRAZIONE);
//        Dipendente[] dipendenti = {marco, sara, pietro};

//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("La matricola del dipendente " + (i + 1) + " è " + dipendenti[i].getMatricola());
//        }

        FullTime marco = new FullTime("D1", 6.7, Dipartimento.PRODUZIONE);
        FullTime sara = new FullTime("D2", 8.5, Dipartimento.VENDITE);
        FullTime pietro = new FullTime("D3", 9.8, Dipartimento.AMMINISTRAZIONE);
        PartTime luca = new PartTime("D4", 8.4, Dipartimento.PRODUZIONE, 91);
        PartTime chiara = new PartTime("D5", 11.2, Dipartimento.AMMINISTRAZIONE, 55);
        Dirigente giovanni = new Dirigente("D6", 20, Dipartimento.AMMINISTRAZIONE, 2000);
        Volontario michele = new Volontario("Michele", 21, "Studente di informatica");

        Dipendente[] dipendenti = {marco, sara, pietro, luca, chiara, giovanni};
        double totalSalaraysAmount = 0;

        for (int i = 0; i < dipendenti.length; i++) {
            totalSalaraysAmount += dipendenti[i].calculateSalary();
        }

        System.out.println("La somma degli di tutti i dipendenti è di: " + totalSalaraysAmount + "$");

        Working[] checkedIn = {marco, sara, pietro, luca, chiara, giovanni, michele};
        for (int i = 0; i < checkedIn.length; i++) {
            checkedIn[i].checkIn();
        }
        
    }

}
