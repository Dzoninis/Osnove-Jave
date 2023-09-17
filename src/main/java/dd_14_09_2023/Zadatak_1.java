package dd_14_09_2023;

public class Zadatak_1 {
    public static void main(String[] args) {

//        Napisati klasu Student koja ima
//
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                (naziv predmeta) - (profesor) - (ocena)
//                Prosecna ocena: (prosecna ocena)
//
//
//        Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)

        Student student_1 = new Student("8498/89", "Nikola Pesic", "osnovne akademske studije");;
        Student student_2 = new Student("4988/984", "Veljko Miljkovic", "osnovne strukovne studije");

        Ispiti ispit_1 = new Ispiti("Interna medicina", 6, "Veljko Smiljkovic");
        Ispiti ispit_2 = new Ispiti("Anatomija", 7, "Miljana Misic");
        Ispiti ispit_3 = new Ispiti("Histologija", 9, "Miodrag Bocinovic");
        Ispiti ispit_4 = new Ispiti("Opsta medicina", 8, "Petar Smiljkovic");

        student_1.dodajIspit(ispit_1);
        student_1.dodajIspit(ispit_2);
        student_1.dodajIspit(ispit_3);
        student_1.dodajIspit(ispit_4);

        student_1.stampajStudenta();
        System.out.println();

    }
}
