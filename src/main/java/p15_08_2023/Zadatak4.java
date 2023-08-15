package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {


//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]


        int sifra = 5;
        String nazivProizvoda = "Majica";
        int cena = 150;
        int popust = 10;
        String boja = "plava";
        String velicina = "M";

        System.out.println(sifra);
        System.out.println(nazivProizvoda + " - $" + cena + " - " + "Popust" + " " + popust + "%");
        System.out.println(boja + ", " + velicina);

    }
}
