package d17_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//                  Ime
//                  Prezime
//                  godinu rodjenja
//        I stampa informaicije u formatu:
//        [ime] [prezime] - [startost] god
//
//        Primer izvrsenja:
//        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//        Milan Jovanovic - 26 god

        System.out.println("Unesite ime: ");
        String ime = scanner.next();
        System.out.println("Unesite prezime: ");
        String prezime = scanner.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja  = scanner.nextInt();

        System.out.println();
        System.out.println(ime + " " + prezime + " - " + godinaRodjenja + " god");




    }
}
