package dd_11_09_2023;

public class Zadatak_2 {
    public static void main(String[] args) {

//        2.Zadatak
//        Kreirati klasu Korisnik koja ima
//                ime
//        prezime
//        gettere i settere za ime i prezime
//        konstuktore koje mislite da su vam potrebni
//        metoda koja stampa u formatu:
//        (ime) (prezime)
//
//                Kreirati klasu FacebookPost
//        opis
//        korisnik (referenca na korisnika koji je kreirao post)
//        konstrukore koje mislite da su vam potrebni
//        metoda print, stampa u formatu:
//        (ime) (prezime)
//                (opis post-a)
//
//        U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

        Korisnik korisnik_1 = new Korisnik();
        korisnik_1.setIme("Nikola");
        korisnik_1.setPrezime("Stevanovic");

        Facebook_post post_1 = new Facebook_post(korisnik_1);

        post_1.setOpis("Novak Djokovic je car!");
        post_1.stampaj_Facebook_post();
    }
}
