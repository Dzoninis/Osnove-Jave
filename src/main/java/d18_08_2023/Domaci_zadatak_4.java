package d18_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//        Primer izvrsenja:
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _


        System.out.println("Unesite broj stampanja: ");
        int stampa = scanner.nextInt();

        for (int i = 1; i <= stampa ; i++) {
            if (i % 5 == 0) {
                System.out.println("-");}
            else {
                 System.out.print("-");}
            
        }


    }
}
