package dd_14_09_2023;

public class Ispiti {

    private String nazivPredmeta;
    private int ocenaSaIspita;
    private String imePrezimeProfesora;

    public Ispiti(String nazivPredmeta, int ocenaSaIspita, String imePrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocenaSaIspita = ocenaSaIspita;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public boolean daLiJePolozen(int ocenaSaIspita) {
        boolean polozio;
        if (ocenaSaIspita > 5 && ocenaSaIspita <= 10) {
            polozio = true;
        } else {
            polozio = false;
        }
        return polozio;
    }

    public void stampajIspite() {
        System.out.println(nazivPredmeta + " - " + imePrezimeProfesora + " - " + ocenaSaIspita);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getOcenaSaIspita() {
        return ocenaSaIspita;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setOcenaSaIspita(int ocenaSaIspita) {
        this.ocenaSaIspita = ocenaSaIspita;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }
}