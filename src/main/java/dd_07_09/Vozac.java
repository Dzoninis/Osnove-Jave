package dd_07_09;

public class Vozac {

    public String ime;
    public String prezime;
    public String jmbg;
    public int brojVozacke;
    public String datumIsteka;

    public void OdstampajVozaca () {
        System.out.println("Vozac: " + ime + " " + prezime + ", jmbg " + jmbg + " broj vozacke " + brojVozacke +
                " sa datumom isteka " + datumIsteka);
    }
}
