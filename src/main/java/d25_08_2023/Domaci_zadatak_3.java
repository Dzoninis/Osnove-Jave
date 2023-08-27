package d25_08_2023;

public class Domaci_zadatak_3 {
    public static void main(String[] args) {

//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.


String brojOdJmbg = "" ;
String podaciIme = "" ;
String podaciPrezime = "";
String podaciGodina = "";
boolean daLiJeAktivan = true;


//        String jmbg = "19813595191";
//        String ime = "Pera";
//        String prezime = "Peric";
//        String godina_rodjenja = "1988";
//        boolean daLiJeAktivan = true;

        podaci(brojOdJmbg, podaciIme, podaciPrezime, podaciGodina,daLiJeAktivan);


    }

        public static void podaci (String jmbg, String ime, String prezime, String god_rodjenja, boolean aktivan) {
            jmbg = "19813595191";
            ime = "Pera";
            prezime = "Peric";
            god_rodjenja = "1988";
            aktivan = true;

            System.out.println("JMBG: " + jmbg);
            System.out.println("Ime: " + ime);
            System.out.println("Prezime: " + prezime);
            System.out.println("Godina rodjenja: " + god_rodjenja);
            System.out.println("Aktivan: " + aktivan);

        }




}
