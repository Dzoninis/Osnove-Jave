package dd_19_09_2023;

public class Tetrapak extends Ambalaza {

    private boolean daLiSeReciklira;
    private double osnovnaCenaTetrapaka;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCenaTetrapaka = osnovnaCena;
    }

    public Tetrapak() {
    }

    @Override
    public double cenaArtikla() {
        double cena = 0;
        if (daLiSeReciklira) {
            cena = (brutoTezina - netoTezina) * 1.5 + osnovnaCenaTetrapaka;
        } else {
            cena = osnovnaCenaTetrapaka;
        }
        return cena;
    }

    @Override
    public void stampajArtikal() {
        System.out.println("Artikal " + nazivArtikla + ", cena artikla je " + osnovnaCenaTetrapaka + " dinara");
        System.out.print("Tezina pakovanja je ");
        tezinaPakovanja();
        if (daLiSeReciklira) {
            System.out.println("Ovaj artikal se reciklira");
        } else {
            System.out.println("Ovaj artikal se ne reciklira");
        }
    }


        public boolean isDaLiSeReciklira () {
            return daLiSeReciklira;
        }

        public double getOsnovnaCena () {
            return osnovnaCenaTetrapaka;
        }

        public void setDaLiSeReciklira ( boolean daLiSeReciklira){
            this.daLiSeReciklira = daLiSeReciklira;
        }

        public void setOsnovnaCena ( double osnovnaCena){
            this.osnovnaCenaTetrapaka = osnovnaCena;
        }

    }