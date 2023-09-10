package dd_07_09;

public class Zadatak_6 {
    public static void main(String[] args) {

//        Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila - Rešite Poslovni Problem
//
//        Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila. Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//                Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave. Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//                **Scenario:**
//
//        Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje. Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//                Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//        Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//                Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.


        Vozilo vozilo_1 = new Vozilo();

        vozilo_1.marka = "Peugeot";
        vozilo_1.model = "307";
        vozilo_1.registracija = "NI 123-132";
        vozilo_1.godinaProizvodnje = 2003;

        Vozilo vozilo_2 = new Vozilo();

        vozilo_2.marka = "Golf";
        vozilo_2.model = "4";
        vozilo_2.registracija = "NI 165-949";
        vozilo_2.godinaProizvodnje = 2004;

        Vozilo vozilo_3 = new Vozilo();

        vozilo_3.marka = "Opel";
        vozilo_3.model = "Cadet";
        vozilo_3.registracija = "NI 168-684";
        vozilo_3.godinaProizvodnje = 2001;

        Vozac vozac_1 = new Vozac();

        vozac_1.ime = "Mika";
        vozac_1.prezime = "Stojkovic";
        vozac_1.jmbg = "19873849";
        vozac_1.brojVozacke = 4984;
        vozac_1.datumIsteka = "12.12 .2025";

        Vozac vozac_2 = new Vozac();

        vozac_2.ime = "Lazar";
        vozac_2.prezime = "Trajkovic";
        vozac_2.jmbg = "25049448";
        vozac_2.brojVozacke = 9849;
        vozac_2.datumIsteka = "15.08 .2030";

        Vozac vozac_3 = new Vozac();

        vozac_3.ime = "Srdjan";
        vozac_3.prezime = "Stosic";
        vozac_3.jmbg = "060898";
        vozac_3.brojVozacke = 64978;
        vozac_3.datumIsteka = "10.06 .2028";

        Ruta ruta_1 = new Ruta();

        ruta_1.polaznaTacka = "Bulevar Djindjica 4";
        ruta_1.odrediste = "Stevan Sremac 18";
        ruta_1.duzinaRute = 2.1;
        ruta_1.ocekivanoVreme = 5;

        Ruta ruta_2 = new Ruta();

        ruta_2.polaznaTacka = "Sindjelicev trg 23";
        ruta_2.odrediste = "Skopska 29";
        ruta_2.duzinaRute = 3.5;
        ruta_2.ocekivanoVreme = 8;

        Ruta ruta_3 = new Ruta();

        ruta_3.polaznaTacka = "Vizantijski bulevar 128";
        ruta_3.odrediste = "Dusanova 3";
        ruta_3.duzinaRute = 4.8;
        ruta_3.ocekivanoVreme = 12;

        System.out.println();
        vozac_1.OdstampajVozaca();
        vozilo_1.odstampajvozilo();
        ruta_1.odstampajRutu();
        System.out.println();
        vozac_2.OdstampajVozaca();
        vozilo_2.odstampajvozilo();
        ruta_2.odstampajRutu();
        System.out.println();
        vozac_3.OdstampajVozaca();
        vozilo_3.odstampajvozilo();
        ruta_3.odstampajRutu();

    }
}
