package Fakultet;

public class Student extends Osoba{

    private String brojIndeksa;

    public Student (String ime, String prezime, String brojIndeksa){
        super(ime, prezime);
        this.brojIndeksa = brojIndeksa;
    }
}
