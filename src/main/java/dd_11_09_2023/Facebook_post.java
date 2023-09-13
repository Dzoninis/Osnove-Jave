package dd_11_09_2023;

public class Facebook_post {

    private String opis;
    private Korisnik korisnik_posta;

    public Facebook_post(Korisnik ime) {
        this.korisnik_posta = ime;
    }

    public Facebook_post() {
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void stampaj_Facebook_post() {
        System.out.println(korisnik_posta.getIme() + " " + korisnik_posta.getPrezime());
        System.out.println(opis);
    }
}
