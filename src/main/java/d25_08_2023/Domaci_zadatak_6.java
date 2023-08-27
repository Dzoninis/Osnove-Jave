package d25_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_6 {

    public static void main(String[] args) {


//        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int M = scanner.nextInt();
        System.out.print("Unesite N: ");
        int N = scanner.nextInt();


        brojevi(M, N);

    }


    public static int brojevi (int broj1, int broj2) {
        int brojac = 0;


        for (int i = broj1 + 1; i < broj2 ; i++) {
            brojac++;
        }
        System.out.println(brojac);
        return brojac;
    }



}
