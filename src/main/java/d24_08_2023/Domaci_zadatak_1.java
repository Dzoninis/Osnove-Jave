package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_zadatak_1 {

    public static void main(String[] args) {



//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i
//        koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(18);
        number.add(20);
        number.add(30);
        number.add(44);
        number.add(55);
        number.add(65);
        number.add(73);
        number.add(86);
        number.add(93);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int unos = scanner.nextInt();
        System.out.print("Unesite novu vrednost: ");
        int novavrednost = scanner.nextInt();

        System.out.println(number);
        number.set(unos,novavrednost);
        System.out.println(number);


   }
}
