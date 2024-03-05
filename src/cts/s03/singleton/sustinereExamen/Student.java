package cts.s03.singleton.sustinereExamen;

public class Student {
    private int id;
    private String nume;
    private String email;
    private int an;

    public Student(int id, String nume, String email, int an) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", an=" + an +
                '}';
    }
}
