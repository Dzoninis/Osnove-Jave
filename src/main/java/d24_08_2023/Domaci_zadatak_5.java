package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_zadatak_5 {

    public static void main(String[] args) {

//        Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3
//
//        Kako bi bolje razumeli sta je ideja u ovom zadatku, upoznajte se sa status kodovima. Koristan clanak


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();


        System.out.print("Unesite N: ");
        int N = scanner.nextInt();
        int broj = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite broj: ");
            broj = scanner.nextInt();

            number.add(broj);
        }

        System.out.print("Unesite X: ");
        int x = scanner.nextInt();
        System.out.print("Elementi niza A koji su jednaki broju X imaju indekse: ");

        for (int i = 0; i < N; i++) {
            if (x == number.get(i)) {
                System.out.print( i + ", " );
            }

        }







    }

}
