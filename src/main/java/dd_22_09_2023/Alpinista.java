package dd_22_09_2023;

public class Alpinista extends Planinar {

    private int poeniAlpiniste;

    public Alpinista(int idBrojPlaninara, String punoImePlaninara, int poeniAlpiniste) {
        super(idBrojPlaninara, punoImePlaninara);
        this.poeniAlpiniste = poeniAlpiniste;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        boolean maxUspon;
        if (planina.getVisinaPlanine() <= 4000) {
            maxUspon = true;
        } else {
            maxUspon = false;
        }
        return maxUspon;
    }

    @Override
    public int clanarinaPlaninara() {
        int clanarina = 1500;
        return clanarina;
    }

    @Override
    public void stampajPlaninara() {
        System.out.println("Alpinista, id: " + idBrojPLaninara);
        System.out.println("Ime: " + punoImePlaninara);
        System.out.println("Broj poena: " + poeniAlpiniste);
    }

    public int getPoeniAlpiniste() {
        return poeniAlpiniste;
    }

    public void setPoeniAlpiniste(int poeniAlpiniste) {
        this.poeniAlpiniste = poeniAlpiniste;
    }
}
