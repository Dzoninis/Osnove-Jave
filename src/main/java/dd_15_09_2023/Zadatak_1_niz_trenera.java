package dd_15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_niz_trenera {
    public static void main(String[] args) {

//        1.Zadatak
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//                jmbg
//        godinu rodjenja
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)
//
//        Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//        Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//        godine iskustva
//        tip trenera (kondicioni, za igru, pomocni, personalni)
//        metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//        U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();

        System.out.print("Unesite broj igraca: ");
        int brojIgraca = scanner.nextInt();

        for (int i = 0; i < brojIgraca; i++) {

            System.out.println("Unesite podatke o igracu");
            System.out.print("Ime i prezime igraca: ");
            String igrac = scanner.next();
            igrac = igrac + scanner.nextLine();
            System.out.print("Jmbg igraca: ");
            String jmbg = scanner.next();
            System.out.print("Godina rodjenja igraca: ");
            int godinaRodjenja = scanner.nextInt();
            System.out.print("Broj na dresu igraca: ");
            int brojNaDresu = scanner.nextInt();
            System.out.print("Pozicija igraca: ");
            String pozicija = scanner.next();
            System.out.print("Da li je igrac kapiten: ");
            boolean kapitenskaTraka = scanner.nextBoolean();
            System.out.println();

            Igrac spisak_igraca = new Igrac();
            spisak_igraca.setImePrezime(igrac);
            spisak_igraca.setJmbg(jmbg);
            spisak_igraca.setGodinaRodjenja(godinaRodjenja);
            spisak_igraca.setBrojNaDresu(brojNaDresu);
            spisak_igraca.setPozicijaIgraca(pozicija);
            if (kapitenskaTraka) {
                spisak_igraca.setDaLiJeKapiten(kapitenskaTraka);
            }
            igraci.add(spisak_igraca);
        }


        ArrayList<Trener> treneri = new ArrayList<>();

        System.out.print("Unesite broj trenera: ");
        int brojTrenera = scanner.nextInt();

        for (int i = 0; i < brojTrenera; i++) {
            System.out.println("Unesite podatke o treneru");
            System.out.print("Unesite ime i prezime trenera: ");
            String imeIPrezimeTrenera = scanner.next();
            imeIPrezimeTrenera = imeIPrezimeTrenera + scanner.nextLine();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = scanner.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godine = scanner.nextInt();
            System.out.print("Unesite godine iskustva: ");
            int godineIskustva = scanner.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = scanner.next();
            tip = tip + scanner.nextLine();

            Trener spisak_trenera = new Trener();
            spisak_trenera.setImePrezime(imeIPrezimeTrenera);
            spisak_trenera.setJmbg(jmbg);
            spisak_trenera.setGodinaRodjenja(godine);
            spisak_trenera.setGodineIskustva(godineIskustva);
            spisak_trenera.setTipTrenera(tip);
            treneri.add(spisak_trenera);
        }

        System.out.println();
        System.out.println("Spisak igraca je sledeci: ");
        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampajOsobu();
        }

        System.out.println();
        System.out.println("Spisak trenera je sledeci: ");
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampajOsobu();
        }
    }
}