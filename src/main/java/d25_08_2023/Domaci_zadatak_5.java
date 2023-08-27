package d25_08_2023;

import com.sun.security.auth.module.KeyStoreLoginModule;

import java.util.Scanner;

public class Domaci_zadatak_5 {

    public static void main(String[] args) {

//        Zadatak
//        Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//                Primer poziva funkcija:
//        Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//        Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//        Primer izvrsenja main programa:
//        Unesite vrednost u eurima: 3
//        Unesite valutu za konverziju: RSD
//        3 EUR je 351.6339 RSD
//        Konverzija eura u druge valute:
//        1 EUR = 117.5 RSD
//        1 EUR = 1.1 USD
//        1 EUR = 62.98 RUB


        Scanner scanner = new Scanner(System.in);


        System.out.print("Unesite vrednost u eurima: ");
        double unos = scanner.nextDouble();
        System.out.print("Unesite valutu za konverziju: ");
        String unos_valute = scanner.next();
        double vrednost = evri(unos, unos_valute);
        String evro = "EUR";

        System.out.println(unos + "" + evro + " je " + vrednost + unos_valute);


    }

    public static Double evri (double kolicina, String drugaValuta) {

       double konverzija = 0;


            if (drugaValuta.equals("RSD")) {
                konverzija = 117.5 * kolicina;
            } else if (drugaValuta.equals("USD")) {
                konverzija = 1.1 * kolicina;
            } else if (drugaValuta.equals("RUB")) {
                konverzija = 62.98 * kolicina;
            }
            return konverzija;
        }




}
