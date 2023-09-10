package dd_08_09_2023;

public class Zadatak_2 {
    public static void main(String[] args) {

//        .Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

        FacebookPost post_1 = new FacebookPost();

        post_1.imePrezimeKorisnika = "Pera Peric";
        post_1.imeZaTudjiProfil = "Milan Milic";
        post_1.tekstObjave = "Zvezda je u Ligi Sampiona!";
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.like = post_1.brojLajkova();
        post_1.share = post_1.brojShareova();
        post_1.share = post_1.brojShareova();
        post_1.share = post_1.brojShareova();
        post_1.share = post_1.brojShareova();
        post_1.share = post_1.brojShareova();

        System.out.println(post_1.imePrezimeKorisnika + " >>> " + post_1.imeZaTudjiProfil);
        System.out.println(post_1.tekstObjave);
        System.out.println("Likes " + post_1.like + " | " + "Shares " + post_1.share);
        System.out.println();

        FacebookPost post_2 = new FacebookPost();

        post_2.imePrezimeKorisnika = "Mitar Miric";
        post_2.imeZaTudjiProfil = "Nikola Rokvic";
        post_2.tekstObjave = "Mi smo pevaci";
        post_2.like = post_2.brojLajkova();
        post_2.like = post_2.brojLajkova();
        post_2.like = post_2.brojLajkova();
        post_2.like = post_2.brojLajkova();
        post_2.share = post_2.brojShareova();
        post_2.share = post_2.brojShareova();
        post_2.share = post_2.brojShareova();


        System.out.println(post_2.imePrezimeKorisnika + " >>> " + post_2.imeZaTudjiProfil);
        System.out.println(post_2.tekstObjave);
        System.out.println("Likes " + post_2.like + " | " + "Shares " + post_2.share);
        System.out.println();
    }
}
