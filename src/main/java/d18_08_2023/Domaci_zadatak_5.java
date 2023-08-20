package d18_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//        sve parne stampa kao negativne
//        sve neprane kao pozitivne brojeve
//        Primer izvrssenja:
//        0, 1, -2, 3, -4, 5, -6, ……..


        System.out.println("Unesite broj: ");
        int broj = scanner.nextInt();

        for (int i = 0; i <= broj; i++) {
            if (i % 2 == 0) {
                System.out.print(" -" + i + ",");}
            else {System.out.print(" " + i + ",");}

        }





    }

}
