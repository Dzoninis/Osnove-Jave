package dd_19_09_2023;

public abstract class Ambalaza {

    protected String barkod;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public void  tezinaPakovanja () {
        double tezina = brutoTezina - netoTezina;
    }

    public abstract double cenaArtikla ();

    public abstract void stampajArtikal();

    public String getBarkod() {
        return barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

}
