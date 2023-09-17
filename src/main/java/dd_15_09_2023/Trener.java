package dd_15_09_2023;

import java.util.ArrayList;

public class Trener extends Osoba{

    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
    }

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampajOsobu () {
        super.stampajOsobu();
    System.out.println("Godine iskustva trenera: " + godineIskustva + ", tip trenera: " + tipTrenera);
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
}