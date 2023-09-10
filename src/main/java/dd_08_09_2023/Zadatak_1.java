package dd_08_09_2023;

public class Zadatak_1 {
    public static void main(String[] args) {

//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


        Proizvod proizvod_1 = new Proizvod();

        proizvod_1.nazivProizvoda = "Fox TV";
        proizvod_1.cena = 22000;
        proizvod_1.tezina = 3000;

        Proizvod proizvod_2 = new Proizvod();

        proizvod_2.nazivProizvoda = "Slusalice za telefon";
        proizvod_2.cena = 2500;
        proizvod_2.tezina = 120;

        proizvod_1.stampajPodatke();
        proizvod_1.povecajCenu(500);
        System.out.println("Nova cena sa povecanjem iznosi " + proizvod_1.cena + " dinara");
        proizvod_1.vratiCenuSaPopustom(15);
        System.out.println("Cena sa uracunatim popustom od 15% iznosi " + proizvod_1.vratiCenuSaPopustom(15));
        proizvod_1.racunajPostarinu();
        System.out.println("Postarina za proizvod " + proizvod_1.nazivProizvoda + " koji ima tezinu " + proizvod_1.tezina +
                " grama bice " + proizvod_1.racunajPostarinu() + " dinara");
        System.out.println();

        proizvod_2.stampajPodatke();
        proizvod_2.povecajCenu(300);
        System.out.println("Nova cena sa povecanjem iznosi " + proizvod_2.cena + " dinara");
        proizvod_2.vratiCenuSaPopustom(10);
        System.out.println("Cena sa uracunatim popustom od 10% iznosi " + proizvod_2.vratiCenuSaPopustom(10));
        proizvod_2.racunajPostarinu();
        System.out.println("Postarina za proizvod " + proizvod_2.nazivProizvoda + " koji ima tezinu " + proizvod_2.tezina +
                " grama bice " + proizvod_2.racunajPostarinu() + " dinara");
    }
}