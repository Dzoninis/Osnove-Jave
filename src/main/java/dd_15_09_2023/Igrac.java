package dd_15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {

    private int brojNaDresu;
    private String pozicijaIgraca;
    private boolean daLiJeKapiten;

    public Igrac() {
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojNaDresu, String pozicijaIgraca, boolean daLiJeKapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojNaDresu = brojNaDresu;
        this.pozicijaIgraca = pozicijaIgraca;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    @Override
    public void stampajOsobu() {
        super.stampajOsobu();
        System.out.println("broj na dresu: " + brojNaDresu + ", pozicija igraca: "
                + pozicijaIgraca + ", da li je kapiten: " + kapitenskaTraka());
    }

    public String kapitenskaTraka() {
        String kapiten = "";
        if (daLiJeKapiten) {
            kapiten = "Da";
        } else {
            kapiten = "Ne";
        }
        return kapiten;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }


}