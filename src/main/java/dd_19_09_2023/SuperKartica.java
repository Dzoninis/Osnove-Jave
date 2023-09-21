package dd_19_09_2023;

public class SuperKartica {

    private String brojKartice;
    private String imePrezime;
    private int popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imePrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    public void stampajArtikal() {
        System.out.println("Super Kartica");
        System.out.println("Broj kartice: " + brojKartice + ", vlasnik je " + imePrezime);
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
}
