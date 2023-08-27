package d25_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_7 {
    public static void main(String[] args) {

//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//        Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite brojeve: ");

        int broj1 = scanner.nextInt();
        int broj2 = scanner.nextInt();
        int broj3 = scanner.nextInt();

        int najmanjiBroj = numbers(broj1, broj2, broj3);

        System.out.println("Najmanji broj je: " + najmanjiBroj);

    }

    public static int numbers (int broj1, int broj2, int broj3) {
        int x = 0;

        if (broj1 < broj2 && broj1 < broj3) {
            x = broj1;
        } else if (broj2 < broj1 && broj2 < broj3) {
            x = broj2;
        } else if (broj3 < broj1 && broj3 < broj2) {
            x = broj3;
        } return x;

    }


}
