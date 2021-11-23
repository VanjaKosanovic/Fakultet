package Main;

import Fakultet.Asistent;
import Fakultet.Osoba;
import Fakultet.Profesor;
import Fakultet.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        ArrayList<Osoba> listaOsoba = unesiOsobe();
        for (Osoba osoba : listaOsoba) {
            osoba.stampaj();
        }
    }

    public static ArrayList<Osoba> unesiOsobe(){
        ArrayList<Osoba> listaOsoba = new ArrayList<>();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Unesite student, profesor ili asistent za tip osobe ili Stop za prekid");
            String komanda = scanner.next();
            if (komanda.equals("Stop")) break;
            System.out.println("Unesite ime");
            String ime = scanner.next();
            System.out.println("Unesite prezime");
            String prezime = scanner.next();
            switch (komanda){
                case "student":
                    System.out.println("Upisi broj indeksa");
                    String brIndeksa = scanner.next();
                    Student student = new Student(ime, prezime,brIndeksa);
                    listaOsoba.add(student);
                    break;
                case "profesor":
                    System.out.println("Unesite fond casova");
                    int fondCasova = scanner.nextInt();
                    System.out.println("Unesite predmet");
                    String predmet = scanner.next();
                    Profesor profesor = new Profesor(ime, prezime, fondCasova, predmet);
                    listaOsoba.add(profesor);
                    break;
                case "asistent":
                    System.out.println("Unesite fond vezbi");
                    int fondVezbi = scanner.nextInt();
                    Asistent asistent = new Asistent(ime, prezime, fondVezbi);
                    listaOsoba.add(asistent);
                    break;
                default:
                    System.out.println("Uneli ste pogresnu komandu!");
            }
        }
        return listaOsoba;
    }
}
