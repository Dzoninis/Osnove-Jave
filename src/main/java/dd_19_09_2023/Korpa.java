package dd_19_09_2023;

import java.util.AbstractMap;
import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza) {
        this.ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String unosBarkoda) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarkod().equals(unosBarkoda)) {
                ambalaze.remove(i);
            }
        }
    }

    public double cenaSvihSaPopustom(SuperKartica superKartica) {
        double cenaSvih = 0;
        double cenaNova = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaSvih += ambalaze.get(i).cenaArtikla();
            cenaSvih += ambalaze.get(i).cenaArtikla();
            cenaNova= cenaSvih - superKartica.getPopust();
        }
        return cenaNova;
    }

}