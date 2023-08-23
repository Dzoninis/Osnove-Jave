package d22_08_2023;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Domaci_zadatak_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.


        System.out.print("Unesite vrednost: ");
        int  vrednost = scanner.nextInt();
        int zbir = 0;
        int brojac = zbir + (zbir +vrednost);
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Unesite vrednost: ");
              vrednost = scanner.nextInt();

              zbir = zbir + zbir;

            if (zbir >= 100) {
                isValid = true;
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + (zbir - (zbir - zbir)));
            } else {
                zbir = zbir + vrednost;
            }

        }









    }
}
