package d15_08_2023;

public class domaci_zadatak_2 {

    public static void main(String[] args) {

//        2.	Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//        Napomena: svaka informacija mora da bude u okviru posebne promenljive.


        String nazivKartice = "Credit Card";
        String brojKartice = "1234 1232 4321 1212";
        String vazenjeKartice = "valid > 10/25";
        String vlasnikKartice = "Nikola Stevanovic";

        System.out.println();
        System.out.println("******************************");
        System.out.println("*   "+ nazivKartice + "              *");
        System.out.println("*     ****                   *");
        System.out.println("*     ****                   *");
        System.out.println("*       " + brojKartice + "  *");
        System.out.println("*            " + vazenjeKartice + "   *");
        System.out.println("*                            *");
        System.out.println("*    " + vlasnikKartice + "       *");
        System.out.println("******************************");
    }
}
