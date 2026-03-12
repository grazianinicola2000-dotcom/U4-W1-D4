package esercizio;

import interfaces.Working;

public abstract class Dipendente implements Working {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Il dipendente ha cominciato a lavorare");
    }

    //GETTER E SETTER
    public double getStipendio() {
        return stipendio;
    }

    public String getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
