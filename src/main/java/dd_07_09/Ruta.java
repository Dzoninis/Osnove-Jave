package dd_07_09;

public class Ruta {

    public String polaznaTacka;
    public String odrediste;
    public double duzinaRute;
    public int ocekivanoVreme;


    public void odstampajRutu () {
        System.out.println("Ruta: polazna tacka je: " + polaznaTacka + ", odrediste je: " + odrediste + ", duzina rute iznosi " +
                duzinaRute + ", ocekivano vreme za navedenu rutu je " + ocekivanoVreme + " minuta");
    }
}
