package esercizio;

public class Dirigente extends Dipendente {
    private int bonus;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, int bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return (getStipendio() * 160) + bonus;
    }
}
