package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci_zadatak_3 {

    public static void main(String[] args) {

//        Zadatak
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1


        ArrayList<Integer> brojevi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Unesite broj za niz: ");
//        int unos = scanner.nextInt();


        brojevi.add(15);
        brojevi.add(22);
        brojevi.add(35);
        brojevi.add(48);
        brojevi.add(65);
        brojevi.add(12);

        System.out.println(brojevi);

        for (int i = brojevi.size() - 1; i >= 0; i--) {
            System.out.print(brojevi.get(i) + ", ");
        }

//        brojevi.set(0, brojevi.get(5));
//        brojevi.set(1, brojevi.get(4));
//        brojevi.set(2, brojevi.get(3));
//        brojevi.set(3, brojevi.get(2));
//        brojevi.set(4, brojevi.get(1));
//        brojevi.set(5, brojevi.get(0));
//
//        System.out.println(brojevi);

//        for (int i = 0; i < brojevi.size() - 1; i++) {
//
//            int noviniz = brojevi.get(brojevi.size() - 1);
//
//            int drugi_brojevi = brojevi.get(brojevi.size() - 1);
//
//            int x = brojevi.set(i, noviniz);
//
////            brojevi.set(i, noviniz);
//        }
//        System.out.println(brojevi);

    }
}
