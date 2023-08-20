package d17_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//        T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//
//
//        Primer izvrsenja 1:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 50
//        Unesite y za M: 50
//        Kliknuto je unutar forme
//
//        Primer izvrsenja 2:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 120
//        Unesite y za M: 50
//        Nije kliknuto je unutar forme


        System.out.print("Unesite x za T1: ");
        int x_za_T1 = scanner.nextInt();
        System.out.print("Unesite y za T1: ");
        int y_za_T1 = scanner.nextInt();
        System.out.print("Unesite x za T2: ");
        int x_za_T2 = scanner.nextInt();
        System.out.print("Unesite y za T2: ");
        int y_za_T2 = scanner.nextInt();
        System.out.print("Unesite x za M: ");
        int x_za_M = scanner.nextInt();
        System.out.print("Unesite y za M: ");
        int y_za_M = scanner.nextInt();

//        int t1 = x_za_T1 + y_za_T1;
//        int t2= x_za_T2 + y_za_T2;
//        int m=  x_za_M + y_za_M;

        if (x_za_M >= x_za_T1 && x_za_M <= x_za_T2 && y_za_M <= y_za_T1 && y_za_M >= y_za_T2) {
            System.out.println("Kliknuto je unutar forme");
        } else System.out.println("Nije kliknuto unutar forme");




    }
}
