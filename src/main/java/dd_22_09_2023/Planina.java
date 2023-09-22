package dd_22_09_2023;

public class Planina {

    private String imePlanine;
    private String drzavaPlanine;
    private double visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String drzavaPlanine, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.drzavaPlanine = drzavaPlanine;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public String getDrzavaPlanine() {
        return drzavaPlanine;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public void setDrzavaPlanine(String drzavaPlanine) {
        this.drzavaPlanine = drzavaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
