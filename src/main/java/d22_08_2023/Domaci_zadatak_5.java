package d22_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//        Primer izvrsenja 2:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: =
//        Zagrade nisu uparene
//                (Objasnjenje: fali poslednja zagrada iz formule)


        //System.out.print("Unos: ");
        int prva_zagrada = 0;
        int druga_zagrada = 0;
        int broj_unosa = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unos: ");
            String unos = scanner.next();
            if (unos.equals("(")) {
                prva_zagrada = prva_zagrada + 1;
            } else if (unos.equals(")")) {
                druga_zagrada = druga_zagrada + 1;
            }

            if (unos.equals("=")) {
                isValid = true;
            }
        }

        if (prva_zagrada % 2 == 0 && druga_zagrada % 2 == 0) {
            System.out.println("Zagrade su uparene");
            System.out.println("(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)");
        } else if (prva_zagrada % 2 == 1) {
            System.out.println("Zagrade  nisu uparene");
            System.out.println("(Objasnjenje: fali druga zagrada iz formule)");
        } else if (druga_zagrada % 2 == 1) {
            System.out.println("Zagrade nisu uparene");
            System.out.println("(Objasnjenje: fali prva zagrada iz formule)");
        }









    }
}
