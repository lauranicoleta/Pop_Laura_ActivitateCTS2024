package cts.s04.design_patterns.clase;

public abstract class PersonalSpital {
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public abstract void afisareDetalii();
}
