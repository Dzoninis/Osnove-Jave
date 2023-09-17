package dd_14_09_2023;

import pp14_09_2023.Reakcija;

import java.util.ArrayList;

public class Student {

    private String brojIndeksa;
    private String imePrezimeStudetna;
    private String tipStudija;
    private ArrayList<Ispiti> ispiti;

//    public Student(ArrayList<Ispiti> ispit) {
//        this.ispiti = new ArrayList<>();
//    }

    public Student(String brojIndeksa, String imePrezimeStudetna, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezimeStudetna = imePrezimeStudetna;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit (Ispiti test) {
        this.ispiti.add(test);
    }

    public void setIspiti(ArrayList<Ispiti> ispiti) {
        this.ispiti = ispiti;
    }

    public double prosekStudija () {
        double prosekSaStudija = 0;
        double brojPolozenihIspita = 0;
        double zbirOcenaSaIspita = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).daLiJePolozen(ispiti.get(i).getOcenaSaIspita())) {
                brojPolozenihIspita += 1;
                zbirOcenaSaIspita = zbirOcenaSaIspita + ispiti.get(i).getOcenaSaIspita();
            }
        }
        prosekSaStudija = zbirOcenaSaIspita / brojPolozenihIspita;
        return prosekSaStudija;
    }

    public void stampajStudenta () {
        System.out.println(brojIndeksa + " - " + imePrezimeStudetna + " - " + tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(ispiti.get(i).getNazivPredmeta() + " - " + ispiti.get(i).getImePrezimeProfesora() +
                    " - " + ispiti.get(i).getOcenaSaIspita());
        }
        System.out.print("Prosecna ocena: " + prosekStudija());
    }

    public ArrayList<Ispiti> getIspiti() {
        return ispiti;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getImePrezimeStudetna() {
        return imePrezimeStudetna;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setImePrezimeStudetna(String imePrezimeStudetna) {
        this.imePrezimeStudetna = imePrezimeStudetna;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
}
