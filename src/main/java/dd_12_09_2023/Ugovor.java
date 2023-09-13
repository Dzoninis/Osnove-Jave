package dd_12_09_2023;

public class Ugovor {

    private String datumUgovora;
    private Fizicko_lice prodavac;
    private Fizicko_lice kupac;
    private int cena;
    private String adresa;

    public Ugovor(String datum, Fizicko_lice prodavac, Fizicko_lice kupac, int cena, String adresa) {
        this.datumUgovora = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade() {
        if (kupac.isDaLiJeKupovala()) {
            return 0.03;
        } else {
            return 0.02;
        }
    }

    public double zaradaAgencije() {
        return 1000 + cena * procenatZarade();
    }

    public void stampajUgovor() {
        System.out.print("Dana: " + this.datumUgovora + " god., sklopljen je ugovor izmedju ");
        System.out.println();
        this.prodavac.stampajFizickoLice();
        System.out.print(" i ");
        this.kupac.stampajFizickoLice();
        System.out.print(" o kupovini nekretnine koja se nalazi u ulici " + this.adresa +
                " po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost " +
                "u iznosu od " + this.zaradaAgencije() + "rsd.");
    }

        public String getDatum () {
            return datumUgovora;
        }

        public Fizicko_lice getProdavac () {
            return prodavac;
        }

        public Fizicko_lice getKupac () {
            return kupac;
        }

        public int getCena () {
            return cena;
        }

        public String getAdresa () {
            return adresa;
        }
    }