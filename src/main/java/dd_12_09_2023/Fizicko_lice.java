package dd_12_09_2023;

public class Fizicko_lice {

    private String imePrezime;
    private int brojLicneKarte;
    private String jmbg;
    private boolean daLiJeKupovala;

    public Fizicko_lice(String imePrezime, int brojLicneKarte, String jmbg, boolean daLiJeKupovala) {
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeKupovala = daLiJeKupovala;

    }

    public void stampajFizickoLice() {
        System.out.println(imePrezime + ", " + brojLicneKarte);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isDaLiJeKupovala() {
        return daLiJeKupovala;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setBrojLicneKarte(int brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public void setDaLiJeKupovala(Boolean daLiJeKupovala) {
        this.daLiJeKupovala = daLiJeKupovala;
    }
}
