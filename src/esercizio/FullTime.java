package esercizio;

public class FullTime extends Dipendente {
    public FullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * 160;
    }


}
