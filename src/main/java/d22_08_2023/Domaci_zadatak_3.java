package d22_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//        Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1
//        Unesite rimski broj: KRAJ
//        Kraj programa.



        String rimskbroj ="";
        Boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite rimski broj: ");
            rimskbroj = scanner.next();

            if (rimskbroj.equals("X")) {
                System.out.println("Arapski: " + 10);
            } else if (rimskbroj.equals("C")) {
                System.out.println("Arapski: " + 100);
            } else if (rimskbroj.equals("D")) {
                System.out.println("Arapski: " + 500);
            } else if (rimskbroj.equals("M")) {
                System.out.println("Arapski: " + 1000);;
            }  else if (rimskbroj.equals("I")) {
                System.out.println("Arapski: " + 1);
            }  else if (rimskbroj.equals("V")) {
                System.out.println("Arapski: " + 5);
            }  else if (rimskbroj.equals("L")) {
                System.out.println("Arapski: " + 50);
            } else if (rimskbroj.equals("KRAJ")) {
                isValid = true;
        }

        }

        System.out.println("Kraj programa");



    }
}
