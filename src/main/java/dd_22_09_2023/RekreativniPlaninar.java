package dd_22_09_2023;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String okrugPlaninara;
    private int maxUsponPlaninara;

    public RekreativniPlaninar(int idBrojPlaninara, String punoImePlaninara, int tezinaOpreme, String okrugPlaninara, int maxUsponPlaninara) {
        super(idBrojPlaninara, punoImePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugPlaninara = okrugPlaninara;
        this.maxUsponPlaninara = maxUsponPlaninara;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        boolean moze = true;
        for (int i = 0; i < tezinaOpreme; i++) {
            maxUsponPlaninara -= 50;
        }
        if (maxUsponPlaninara > planina.getVisinaPlanine()) {
            moze = true;
        } else {
            moze = false;
        }
        return moze;
    }

    @Override
    public int clanarinaPlaninara() {
        int clanarina = 1000;
        return clanarina;
    }

    @Override
    public void stampajPlaninara() {
        System.out.println("Rekreativac, id: " + idBrojPLaninara);
        System.out.println("Ime: " + punoImePlaninara);
        System.out.println("Okrug: " + okrugPlaninara);
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrugPlaninara() {
        return okrugPlaninara;
    }

    public int getMaxUsponPlaninara() {
        return maxUsponPlaninara;
    }
}
