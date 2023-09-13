package dd_12_09_2023;

import java.util.Scanner;

public class Zadatak_3 {
    public static void main(String[] args) {


//        Zadatak
//        Kreirati klasu Racun koja ima:
//        broj racuna (npr: 170-289328923-23)
//        ime i prezime osobe
//        trenutno stanje na racunu (npr: 100, 1220)
//        gettere i setter za sve atribute, sem settera za stanje na racunu
//        metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//        metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//        metodu koja stampa podatke o racunu u formatu:
//        Ime i prezime  -  broj racuna
//        stanje na racunu je (trenutno stanje) rsd.
//
//                Kreirati klasu Transakcija koja ima:
//        id transakcije
//        racun sa kog se prenose sredstva
//        racun na koji se prenose sredstva
//        gettere i settere
//                konstruktore
//        metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//        ako je prenos sredstava manji od 4500, provizija je fiksna 45
//        ako je prenos sredstava veci od 4500, provizija je 1%
//                S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//        Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//        metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
//                Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).

        Scanner s = new Scanner(System.in);

        Racun racun_1 = new Racun();
        Racun racun_2 = new Racun();

        racun_1.setBrRacuna("298-49849-49844");
        racun_1.setPunoIme("Vladimir Vasic");

        racun_2.setBrRacuna("123-18849-9498");
        racun_2.setPunoIme("Milica Nedeljkovic");

        racun_1.uplatiNaRacun(150000);
        racun_2.uplatiNaRacun(200000);

        System.out.print("Unesite iznos za transakciju: ");
        double iznos = s.nextDouble();

        Transakcija transakcija = new Transakcija(15, racun_1, racun_2);

        transakcija.izvrsiTransakciju(iznos);
        transakcija.print();
        racun_1.stampajRacun();
        racun_2.stampajRacun();
    }
}