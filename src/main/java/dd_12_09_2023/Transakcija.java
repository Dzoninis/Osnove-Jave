package dd_12_09_2023;

public class Transakcija {

    private int idTransakcije;
    private Racun racunSaKog;
    private Racun racunNaKoji;

    public Transakcija (int id, Racun prebacivanjeSa, Racun prebacivanjeNa) {
        this.idTransakcije = id;
        this.racunSaKog = prebacivanjeSa;
        this.racunNaKoji = prebacivanjeNa;
    }

    public double provizija (double iznos) {
        if (iznos < 4500) {
            return 45;
        } else {
            return 0.01 * iznos;
        }
    }

    public void izvrsiTransakciju (double iznos) {

        if (this.racunSaKog.getStanje() - iznos - this.provizija(iznos) >= 0) {
            this.racunSaKog.skiniSaRacuna(iznos + this.provizija(iznos));
            this.racunNaKoji.uplatiNaRacun(iznos);

            System.out.println("Transakcija je realizovana.");
        } else {
            System.out.println("Transakcija nije realizovana. Nemate dovoljno sredstava na racunu.");
        }
    }
    public void print () {
        System.out.println(this.idTransakcije);
        System.out.println("Racun sa: " + this.racunSaKog.getPunoIme() + " - " + this.racunSaKog.getBrRacuna());
        System.out.println("Racun na: " + this.racunNaKoji.getPunoIme() +  " - " + this.racunNaKoji.getBrRacuna());
        System.out.println();
    }

    public int getId() {
        return idTransakcije;
    }

    public Racun getPrebacivanjeSa() {
        return racunSaKog;
    }

    public Racun getPrebacivanjeNa() {
        return racunNaKoji;
    }

    public void setId(int id) {
        this.idTransakcije = id;
    }

    public void setPrebacivanjeNa(Racun prebacivanjeNa) {
        this.racunNaKoji = prebacivanjeNa;
    }

    public void setPrebacivanjeSa(Racun prebacivanjeSa) {
        this.racunSaKog = prebacivanjeSa;
    }
}