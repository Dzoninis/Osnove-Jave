package dd_12_09_2023;

public class Racun {

        private String brojRacuna;
        private String punoIme;
        private double trenutnoStanje;

        public Racun() {

        }

        public void uplatiNaRacun(double vrednost) {
            this.trenutnoStanje += vrednost;
        }

        public void skiniSaRacuna(double vrednost) {
            this.trenutnoStanje -= vrednost;
        }

        public void stampajRacun() {
            System.out.println(punoIme + " - " + brojRacuna);
            System.out.println("Stanje na racunu je " + trenutnoStanje + " rsd.");
        }

        public String getBrRacuna() {
            return brojRacuna;
        }

        public String getPunoIme() {
            return punoIme;
        }

        public double getStanje() {
            return trenutnoStanje;
        }

        public void setBrRacuna(String brRacuna) {
            this.brojRacuna = brRacuna;
        }

        public void setPunoIme(String punoIme) {
            this.punoIme = punoIme;
        }
    }