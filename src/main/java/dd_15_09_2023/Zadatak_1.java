package dd_15_09_2023;

public class Zadatak_1 {
    public static void main(String[] args) {

        Igrac igrac_1 = new Igrac("Aleksandar Mitrovic", "2126189186", 1994, 9, "napadac", false);
        Igrac igrac_2 = new Igrac("Dusan Tadic", "165184516", 1988, 10, "napadac", true);

        Trener trener_1 = new Trener("Milorad Miljkovic", "19879987998", 1973, 20, "kondicioni trener");
        Trener trener_2 = new Trener("Nenad Vasic", "0298789878", 1970, 19, "pomocni trener");

        Kartoni zuti = new Kartoni("zuti karton");
        Kartoni crveni = new Kartoni("crveni karton");

        igrac_1.dodajKarton(zuti);
        igrac_1.dodajKarton(zuti);
        igrac_1.dodajKarton(zuti);
        igrac_1.dodajKarton(crveni);
        igrac_1.dodajKarton(crveni);

        igrac_2.dodajKarton(zuti);
        igrac_2.dodajKarton(zuti);
        igrac_2.dodajKarton(crveni);

        igrac_1.stampajOsobu();
        System.out.println();
        igrac_2.stampajOsobu();
        System.out.println();
        trener_1.stampajOsobu();
        System.out.println();
        trener_2.stampajOsobu();
    }
}