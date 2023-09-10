package dd_07_09;

import pp_08_09_2023.Auto;

public class Zadatak_2 {
    public static void main(String[] args) {

//        Zadatak 2: Kreiranje klase "Automobil"
//        Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

        Automobil automobil_1 = new Automobil();

        automobil_1.marka = "Audi";
        automobil_1.model = "Q7";
        automobil_1.godina_Proizvodnje = 2014;

        Automobil automobil_2 = new Automobil();

        automobil_2.marka = "Wolksvagen";
        automobil_2.model = "Golf 5";
        automobil_2.godina_Proizvodnje = 2008;

        Automobil automobil_3 = new Automobil();

        automobil_3.marka = "Peugeot";
        automobil_3.model = "306";
        automobil_3.godina_Proizvodnje = 2002;

        System.out.println("Prvi automobil je " + automobil_1.marka + ", model " + automobil_1.model +
                ", godina proizvodnje je " + automobil_1.godina_Proizvodnje);
        System.out.println("Drugi automobil je " + automobil_2.marka + ", model " + automobil_2.model +
                ", godina proizvodnje je " + automobil_2.godina_Proizvodnje);
        System.out.println("Treci automobil je " + automobil_3.marka + ", model " + automobil_3.model +
                ", godina proizvodnje je " + automobil_3.godina_Proizvodnje);
    }
}
