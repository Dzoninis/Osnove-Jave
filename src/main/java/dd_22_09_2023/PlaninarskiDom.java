package dd_22_09_2023;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnvivanja;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnvivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnvivanja = godinaOsnvivanja;
        this.planinari = new ArrayList<>();
    }

    public void uclaniPlaninara(Planinar osoba) {
        this.planinari.add(osoba);
    }

    public int brojPlaninaraUspesnih(Planina planinaparametar) {
        int brojac = 0;
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).uspesanUspon(planinaparametar)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void izbaciPlaninara(int identifikacioniBroj) {
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).idBrojPLaninara == identifikacioniBroj) {
                planinari.remove(i);
            }
        }
    }


    public void stampajPlaninara() {
        System.out.println("Naziv planinarskog doma: " + nazivDoma + ", osnovan " + godinaOsnvivanja + ". godine");
        System.out.println("Clanovi planinarskog doma su: ");
        for (int i = 0; i < planinari.size(); i++) {
            planinari.get(i).stampajPlaninara();
            System.out.println();
        }
    }

    public void mesecniPrihodClanarina() {
        int ukupnaclanarina = 0;
        for (int i = 0; i < planinari.size(); i++) {
            ukupnaclanarina += planinari.get(i).clanarinaPlaninara();
        }
        System.out.println("Ukupan mesecni prihod od clanarine svih planinara je " + ukupnaclanarina + " dinara");
    }


    public String getNazivDoma() {
        return nazivDoma;
    }

    public int getGodinaOsnvivanja() {
        return godinaOsnvivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public void setGodinaOsnvivanja(int godinaOsnvivanja) {
        this.godinaOsnvivanja = godinaOsnvivanja;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }
}
