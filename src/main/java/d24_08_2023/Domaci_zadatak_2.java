package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_zadatak_2 {

    public static void main(String[] args) {

//        .Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();


        System.out.print("Unesite N: ");
        int unos = scanner.nextInt();
        int parniBrojevi = 0;
//        unos = number.size();



        for (int i = 0; i < unos; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            number.add(broj);

           if (broj % 2 == 0) {
                parniBrojevi++;
        }

        }

        System.out.println();
        System.out.println("U nizu ima " + parniBrojevi + " parna broja.");

    }
}
