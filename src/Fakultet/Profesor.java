package Fakultet;

import java.security.spec.RSAOtherPrimeInfo;

public class Profesor extends Osoba{

    private int fondCasova;
    private String predmet;

    public Profesor (String ime, String prezime, int fondCasova, String predmet){
        super(ime, prezime);
        this.fondCasova = fondCasova;
        this.predmet = predmet;
    }

    public int getFondCasova() {
        return fondCasova;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setFondCasova(int fondCasova) {
        this.fondCasova = fondCasova;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void stampaj (){
        super.stampaj();
        System.out.println("Predmet profesora: " + predmet + ". Fond casova: " + this.fondCasova);
    }
}
