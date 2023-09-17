package dd_15_09_2023;

public class Osoba {

    protected String imePrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imePrezime, String jmbg, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampajOsobu () {
        System.out.println(imePrezime + ", jmbg " + jmbg + ", godina rodjenja " + godinaRodjenja);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
}