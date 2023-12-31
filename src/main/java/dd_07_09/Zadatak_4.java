package dd_07_09;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {

//    Zadatak 4: Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Scanner scanner = new Scanner(System.in);

        Film film_1 = new Film();

        System.out.print("Unesite naziv filma: ");
        film_1.naslov = scanner.nextLine();
        System.out.print("Unesite rezisera: ");
        film_1.reziser = scanner.nextLine();
        System.out.print("Unesite godinu kada je film izasao: ");
        film_1.godinaIzdanja = scanner.nextInt();
        //Unet je "scanner.nextLine();" u sledecem redu jer:
        // This is happening because of the Scanner.nextInt method does not read the
        // newline character in the input generated by hitting "Enter," and so the
        // call to Scanner.nextLine retorts after reading that newline.
        scanner.nextLine();
        System.out.println();

        Film film_2 = new Film();

        System.out.print("Unesite naziv filma: ");
        film_2.naslov = scanner.nextLine();
        System.out.print("Unesite rezisera: ");
        film_2.reziser = scanner.nextLine();
        System.out.print("Unesite godinu kada je film izasao: ");
        film_2.godinaIzdanja = scanner.nextInt();

        System.out.println();
        System.out.println("Informacije o prvom filmu: " + film_1.naslov + ", godina izdanja je " + film_1.godinaIzdanja +
                ", a reziser filma je " + film_1.reziser);
        System.out.println("Informacije o drugom filmu: " + film_2.naslov + ", godina izdanja je " + film_2.godinaIzdanja +
                ", a reziser filma je " + film_2.reziser);

    }
}
