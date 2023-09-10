package dd_07_09;

public class Zadatak_3 {
    public static void main(String[] args) {


//    Zadatak 3: Kreiranje klase "Proizvod"
//    Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.


        Proizvod proizvod_1 = new Proizvod();

        proizvod_1.naziv = "Krem bananaica";
        proizvod_1.cena = 30;

        Proizvod proizvod_2 = new Proizvod();

        proizvod_2.naziv = "Plazma kekss";
        proizvod_2.cena = 120;

        Proizvod proizvod_3 = new Proizvod();

        proizvod_3.naziv = "Jaffa keks";
        proizvod_3.cena = 130;

        System.out.println("Osnovne informacije o proizvodu: " + proizvod_1.naziv + ", cena - " + proizvod_1.cena + " din");
        System.out.println("Osnovne informacije o proizvodu: " + proizvod_2.naziv + ", cena - " + proizvod_2.cena + " din");
        System.out.println("Osnovne informacije o proizvodu: " + proizvod_3.naziv + ", cena - " + proizvod_3.cena + " din");

    }
}
