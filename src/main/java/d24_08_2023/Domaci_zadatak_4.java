package d24_08_2023;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_zadatak_4 {

    public static void main(String[] args) {


//        Zadatak
//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//
//        Brojevi veci od nule u nizu A su: 1, 3, 9,

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        System.out.print("Unesite N: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Unesite broj: ");
            int broj = scanner.nextInt();
            number.add(broj);
        }

        System.out.print("Brojevi veci od nule u nizu su: ");
        for (int i = 0; i < N; i++) {
            if (number.get(i) > 0) {
                System.out.print(number.get(i) + ", ");
            }
        }
    }
}