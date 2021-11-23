package Fakultet;

public class Student extends Osoba{

    private String brojIndeksa;

    public Student (String ime, String prezime, String brojIndeksa){
        super(ime, prezime);
        this.brojIndeksa = brojIndeksa;
    }

    public void stampaj (){
        super.stampaj();
        System.out.println("Studentov broj indeksa je " +this.brojIndeksa);
    }
}
