package Fakultet;

public class Asistent extends Osoba{

    private int fondVezbi;

    public Asistent (String ime, String prezime, int fondVezbi){
        super(ime, prezime);
        this.fondVezbi = fondVezbi;
    }

    public int getFondVezbi() {
        return fondVezbi;
    }

    public void setFondVezbi(int fondVezbi) {
        this.fondVezbi = fondVezbi;
    }

    public void stampaj(){
        super.stampaj();
        System.out.println("Asistentov fond vezbi je " +this.fondVezbi);
    }
}
