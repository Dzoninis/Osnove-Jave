package dd_08_09_2023;

public class Proizvod {

    public String nazivProizvoda;
    public double cena;
    public double tezina;

    public void stampajPodatke () {
        System.out.println(nazivProizvoda + ", " + cena + " din, " + tezina + "g");
    }

    public void povecajCenu (int povecanje) {
        cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom (int popust) {
        double novaCena = 0;
        novaCena = cena - (cena * popust / 100);
        return novaCena;
    }

    public int racunajPostarinu () {
        int postarina = 0;
        if (tezina <= 100) {
            postarina = 200;
        } else if (tezina <= 500) {
            postarina = 400;
        }
        else if (tezina > 500) {
            postarina = 1000;
        }
        return postarina;
    }
}
