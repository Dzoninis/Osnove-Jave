package d22_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)


        System.out.print("Unesite broj: ");
        int broj = scanner.nextInt();
        int brojac_2 = 0;
        int brojac_3 = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite broj: ");
        broj = scanner.nextInt();
        if (broj == 2) {
            brojac_2 = brojac_2 + 1;
        }
        if (broj == 1) {
            brojac_3 = brojac_3 + 1;
        }
        if (brojac_2 == 2 || brojac_3 == 3) {
            isValid = true;
        }
    }

        if (brojac_2 == 2) {
            System.out.println("(Objasnjenje: Kraj je jer je uneto " + brojac_2 + " dvojke)");
        } else if (brojac_3 == 3) {
            System.out.println("(Objasnjenje: Kraj je jer je uneto " + brojac_3 + " jedinice)");
        }




    }
}


