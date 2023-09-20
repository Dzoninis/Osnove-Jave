package dd_18_09_2023;

public class VideoPlayer {

    private int duzinaVidea;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitetVidea;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampajVideo() {
        System.out.println("Trenutno vreme videa je: " + trenutnoVreme + " sekundi");
        System.out.println("Jacina zvuka je " + jacinaZvuka);
        System.out.println("Kvalitet videa je " + kvalitetVidea + "px");
    }


    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
}
