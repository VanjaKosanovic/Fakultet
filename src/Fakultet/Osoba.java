package Fakultet;

public class Osoba {

    private String ime;
    private String prezime;

    public Osoba (String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void setIme (String ime){
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void stampaj (){
        System.out.println("Ime: " + this.ime + ". Prezime: " + this.prezime);
    }

}
