package dd_11_09_2023;

public class Korisnik {

    private String ime;
    private String prezime;

    public Korisnik() {
    }

    public void stampajKorisnika() {
        System.out.println(ime + " " + prezime);
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
