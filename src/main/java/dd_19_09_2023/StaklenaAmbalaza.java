package dd_19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private int kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCenaStaklene;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, int kaucija, boolean daLiSePlacaKaucija, double osnovnaCenaStaklene) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCenaStaklene = osnovnaCenaStaklene;
    }

    public StaklenaAmbalaza(int kaucija, boolean daLiSePlacaKaucija, double osnovnaCenaStaklene) {
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCenaStaklene = osnovnaCenaStaklene;
    }

    @Override
    public double cenaArtikla() {
        double cena = 0;
        if (daLiSePlacaKaucija) {
            cena = osnovnaCenaStaklene * 1.2 + kaucija;
        } else {
            cena = osnovnaCenaStaklene * 1.2;
        }
        return cena;
    }

    @Override
    public void stampajArtikal() {
        System.out.println("Artikal " + nazivArtikla + "barkod je " + barkod);
        System.out.println("Staklena flasa " + nazivArtikla + ", cena artikla je " + osnovnaCenaStaklene + " dinara");
        System.out.print("Da li se placa kaucija za staklenu flasu? " + daLiSePlacaKaucija);
        if(daLiSePlacaKaucija) {
            System.out.println("Da");
            System.out.println("Cena staklene flase sa kaucijom iznosi " + osnovnaCenaStaklene + " dinara");
        } else {
            System.out.println("Ne");
        }
    }

        public int getKaucija() {
        return kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public double getOsnovnaCenaStaklene() {
        return osnovnaCenaStaklene;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public void setOsnovnaCenaStaklene(double osnovnaCenaStaklene) {
        this.osnovnaCenaStaklene = osnovnaCenaStaklene;
    }
}