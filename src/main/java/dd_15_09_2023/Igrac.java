package dd_15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {

    private int brojNaDresu;
    private String pozicijaIgraca;
    private boolean daLiJeKapiten;

    public Igrac() {
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int brojNaDresu, String pozicijaIgraca, boolean daLiJeKapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.brojNaDresu = brojNaDresu;
        this.pozicijaIgraca = pozicijaIgraca;
        this.daLiJeKapiten = daLiJeKapiten;
        this.kartoni = new ArrayList<>();
    }

    @Override
    public void stampajOsobu() {
        super.stampajOsobu();
        System.out.println("broj na dresu: " + brojNaDresu + ", pozicija igraca: "
                + pozicijaIgraca + ", da li je kapiten: " + kapitenskaTraka());
      //  for (int i = 0; i < kartoni.size(); i++) {
       //     System.out.println(kartoni.get(i).getTipKartona());
//            if (kartoni.get(i).getTipKartona().equals("zuti karton"))
//                System.out.println(brojZutihKartona());
            System.out.println("Broj zutih kartona: " + brojZutihKartona());
            System.out.println("Broj crvneih kartona: " + brojCrvenihKartona());
        }

    public String kapitenskaTraka() {
        String kapiten = "";
        if (daLiJeKapiten) {
            kapiten = "Da";
        } else {
            kapiten = "Ne";
        }
        return kapiten;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    private ArrayList<Kartoni> kartoni;

    public ArrayList<Kartoni> getKartoni() {
        return kartoni;
    }

    public void dodajKarton(Kartoni kartoni) {
        this.kartoni.add(kartoni);
    }

    public int brojZutihKartona () {
        int zutiKartoni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).getTipKartona().equals("zuti karton")) {
                zutiKartoni++;
            }
        }
        return zutiKartoni;
    }

    public int brojCrvenihKartona () {
        int crveniKartoni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).getTipKartona().equals("crveni karton")) {
                crveniKartoni++;
            }
        }
        return crveniKartoni;
    }
}