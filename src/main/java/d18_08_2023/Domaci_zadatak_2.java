package d18_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
//        ime
//                prezime
//        jmbg
//        broj primeraka za stampu
//        Primer izvrsenja:
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite jmbg: 2109238932232
//        Unesite broj primeraka za stampu: 2
//
//        Primerak 1
//                **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//                **********************************
//
//        Primerak 2
//                **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//                **********************************


        System.out.print("Unesite ime: ");
        String ime = scanner.next();
        System.out.print("Unesite prezime: ");
        String prezime = scanner.next();
        System.out.print("Unesite jmbg: ");
        String  jmbg = scanner.next();
        System.out.print("Unesite broj primeraka za stampu: ");
        int stampa = scanner.nextInt();

        for (int i = 0; i < stampa; i++) {
            System.out.println();
            System.out.println("********************************");
            System.out.println("Ime i prezime: " + ime + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("********************************");
        }







    }

}
