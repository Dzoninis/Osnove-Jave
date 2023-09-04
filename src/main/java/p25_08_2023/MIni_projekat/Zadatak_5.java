package p25_08_2023.MIni_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_5 {
    public static void main(String[] args) {


//        **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//        Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//                generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//        generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//                Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//                Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//                - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//                Primer izvršenja 1:
//        Unesite dužinu passworda: 10
//        Da li želite da sadrži specijalan karakter: true
//        Generisan password: eD9Kx0e@
//
//                Primer izvršenja 2:
//        Unesite dužinu passworda: 10
//        Da li želite da sadrži specijalan karakter: false
//        Generisan password: eCxdwEeFEx


        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dužinu passworda: ");
        int unos = scanner.nextInt();
        System.out.print("Da li želite da sadrži specijalan karakter: ");
        boolean pitanje = scanner.nextBoolean();
        String generisanPassword = "";
        String password_1 = "";
        String password_2 = "";

        for (int i = 0; i < unos; i++) {
            if (pitanje && i == unos - 1) {
                password_1 = randomSpecijalanKarakter();
                generisanPassword = generisanPassword + password_1;
            } else {
                password_2 = generisiRandomKarakter();
                generisanPassword = generisanPassword + password_2;
            }
        }
        System.out.print("Generisan password: " + generisanPassword);
    }

// (Ovo je primer kada bi se kombinovali random i specijalni karakteri, da ne bude specijalni karakter samo na kraju)

//        while (unos > 0) {
//            if (pitanje && unos >= 2) {
//                password_1 = password_1 + generisiRandomKarakter() + randomSpecijalanKarakter();
//                unos = unos - 2;
//            } else {
//                password_1 = password_1 + generisiRandomKarakter();
//                unos--;
//            }
//        }
//
//       System.out.print("Generisan password: " + password_1);


    public static String generisiRandomKarakter() {

        ArrayList<String> karakterLista = new ArrayList<>();

        karakterLista.add("a");
        karakterLista.add("b");
        karakterLista.add("c");
        karakterLista.add("d");
        karakterLista.add("e");
        karakterLista.add("A");
        karakterLista.add("B");
        karakterLista.add("C");
        karakterLista.add("D");
        karakterLista.add("E");
        karakterLista.add("1");
        karakterLista.add("2");
        karakterLista.add("3");
        karakterLista.add("4");

        Random rand = new Random();
        String karakter = karakterLista.get(rand.nextInt(karakterLista.size()));

        return karakter;
    }

    public static String randomSpecijalanKarakter() {

        ArrayList<String> specijalnaLista = new ArrayList<>();

        specijalnaLista.add("@");
        specijalnaLista.add("£");
        specijalnaLista.add("$");
        specijalnaLista.add("%");
        specijalnaLista.add("^");
        specijalnaLista.add("&");
        specijalnaLista.add("*");
        specijalnaLista.add("!");
        specijalnaLista.add("_");
        specijalnaLista.add("+");

        Random rand = new Random();
        String specijalniKarakter = specijalnaLista.get(rand.nextInt(specijalnaLista.size()));

        return specijalniKarakter;
    }
}