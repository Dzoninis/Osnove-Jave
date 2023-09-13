package dd_11_09_2023;

import pp_12_09_2023.Knjiga;

public class Zadatak_1 {
    public static void main(String[] args) {

//        Kreirati klasu Autor koja ima
//                -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//                -naziv
//                -godina izdanja
//                -autor
//                -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//                (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

        Autor autor_1 = new Autor();
        autor_1.setIme("Ivo ");
        autor_1.setPrezime("Andric");

        Autor autor_2 = new Autor();
        autor_2.setIme("Bora ");
        autor_2.setPrezime("Stankovic");

        Knjiga knjiga_1 = new Knjiga(autor_1);
        knjiga_1.setNazivKnjige("Na Drini cuprija");
        knjiga_1.setGodinaIzdanja(1945);
        knjiga_1.setIsbn("9959/984");

        Knjiga knjiga_2 = new Knjiga(autor_2);
        knjiga_2.setNazivKnjige("Kostana");
        knjiga_2.setGodinaIzdanja(1929);
        knjiga_2.setIsbn("94989/198");

        knjiga_1.stampajKnjigu();
        System.out.println();
        knjiga_2.stampajKnjigu();
    }
}