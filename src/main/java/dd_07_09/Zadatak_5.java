package dd_07_09;

import java.util.Scanner;

public class Zadatak_5 {
    public static void main(String[] args) {

//        Zadatak 5: Kreiranje klase "Oprema"
//        Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Scanner scanner = new Scanner(System.in);

        Oprema oprema_1 = new Oprema();

        System.out.print("Unesite tip opreme: ");
        oprema_1.tip = scanner.next();
        System.out.print("Unesite marku: ");
        oprema_1.marka = scanner.next();
        System.out.print("Unesite cenu: ");
        oprema_1.cena = scanner.nextInt();
        System.out.println();

        Oprema oprema_2 = new Oprema();

        System.out.print("Unesite tip opreme: ");
        oprema_2.tip = scanner.next();
        System.out.print("Unesite marku: ");
        oprema_2.marka = scanner.next();
        System.out.print("Unesite cenu: ");
        oprema_2.cena = scanner.nextInt();
        System.out.println();

        Oprema oprema_3 = new Oprema();

        System.out.print("Unesite tip opreme: ");
        oprema_3.tip = scanner.next();
        System.out.print("Unesite marku: ");
        oprema_3.marka = scanner.next();
        System.out.print("Unesite cenu: ");
        oprema_3.cena = scanner.nextInt();
        System.out.println();

        System.out.println("Osnovne informacije o opremi: " + oprema_1.tip + " marke " + oprema_1.marka + " sa cenom od "+
                oprema_1.cena + " dinara");
        System.out.println("Osnovne informacije o opremi: " + oprema_2.tip + " marke " + oprema_2.marka + " sa cenom od "+
                oprema_2.cena + " dinara");
        System.out.println("Osnovne informacije o opremi: " + oprema_3.tip + " marke " + oprema_3.marka + " sa cenom od "+
                oprema_3.cena + " dinara");
    }
}
