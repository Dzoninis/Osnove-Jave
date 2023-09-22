package dd_22_09_2023;

public abstract class Planinar {

    protected int idBrojPLaninara;
    protected String punoImePlaninara;

    public Planinar(int idBrojPLaninara, String punoImePlaninara) {
        this.idBrojPLaninara = idBrojPLaninara;
        this.punoImePlaninara = punoImePlaninara;
    }

    public abstract void stampajPlaninara();

    public abstract int clanarinaPlaninara();

    public abstract boolean uspesanUspon(Planina planina);

    public int getBrojPlaninara() {
        return idBrojPLaninara;
    }

    public String getPunoImePlaninara() {
        return punoImePlaninara;
    }
}
