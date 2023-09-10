package dd_07_09;

public class Vozilo {

    public String marka;
    public String model;
    public String registracija;
    public int godinaProizvodnje;

    public void odstampajvozilo () {
        System.out.println("Automobil marke: " + marka + ", model: " + model + " sa registracionom oznakom " +
                registracija + ", godina proizvodnje - " + godinaProizvodnje);
    }
}
