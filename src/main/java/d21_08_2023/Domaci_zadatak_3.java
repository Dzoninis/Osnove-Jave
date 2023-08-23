package d21_08_2023;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Scanner;

public class Domaci_zadatak_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//        ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//        ako se ne sadrzi, program dostampa na kraju
//        Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite tekst: Cao!
//                Cao!
//                Unesite tekst: Hello
//        Hello!
//                Unesite tekst: Hi!
//                Hi!
//                Unesite tekst: Cuti
//        Cuti!
//                Unesite tekst: Ajde!
//                Ajde!
//                Nivo agresivnosti 60.
//        (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)


        System.out.print("Unesite N: ");
        int unos = scanner.nextInt();
        int agresivnost = 0;
        int stepen_agresivnosti = 0;

        for (int i = 0; i < unos; i++) {
            System.out.print("Unesite tekst: ");
            String tekst = scanner.next();
            if (tekst.contains("!")) {
                System.out.println(tekst);
            } else {
                System.out.println(tekst + "!");
            }

            if(tekst.contains("!")) {
                agresivnost = agresivnost + 1;
                stepen_agresivnosti = 100 * agresivnost / unos;
            }
        }

        System.out.println("Nivo agresivnosti je: " + stepen_agresivnosti);


    }
}
