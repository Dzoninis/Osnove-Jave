package d25_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_4 {
    public static void main(String[] args) {


//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
///          / / / /
//        Napomena: Metoda nista ne vraca.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Unesite N: ");
        int unosN = scanner.nextInt();
        String karakter = "";


        karakteri(unosN, karakter);


    }

    public static void karakteri (int N, String zvezdica) {
        for (int i = 0; i < N; i++) {
            System.out.print("* ");

        }

    }

}
