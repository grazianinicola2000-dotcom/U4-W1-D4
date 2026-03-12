package esercizio;

public class PartTime extends Dipendente {
    private double oreLavorate;

    public PartTime(String matricola, double stipendio, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * oreLavorate;
    }
}
