package d24_08_2023;

import java.util.ArrayList;

public class Domaci_zadatak_6 {

    public static void main(String[] args) {

//        Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//        niz linkova
//        niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//        niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//        Nizovi potrebni za ovaj primer:
//        linkovi
//        https://cms.demo.katalon.com/cart/
//        https://cms.demo.katalon.com/shop/
//        https://cms.demo.katalon.com/account/
//        https://cms.demo.katalon.com/cart/
//        https://cms.demo.katalon.com/test/
//        expected status codes
//        200
//        200
//        404
//        204
//        200
//        actual status codes
//        200
//        200
//        400
//        200
//        404
//        Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod.
//        Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//        Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//        Primer izvrsenja:
//        Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//        Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//        Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404


        ArrayList<String> linkovi = new ArrayList<>();

       linkovi.add("https://cms.demo.katalon.com/cart/");
        linkovi.add("https://cms.demo.katalon.com/shop/");
        linkovi.add ("https://cms.demo.katalon.com/account/");
        linkovi.add ("https://cms.demo.katalon.com/cart/");
        linkovi.add ("https://cms.demo.katalon.com/test/");

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(200);
        expected.add(200);
        expected.add(404);
        expected.add(204);
        expected.add(200);




        ArrayList<Integer> actual = new ArrayList<>();

        actual.add(200);
        actual.add(200);
        actual.add(400);
        actual.add(200);
        actual.add(404);




        for (int i = 0; i < expected.size(); i++) {
            int dobijeno = actual.get(i);
            int  ocekivano = expected.get(i);


            if (ocekivano!=dobijeno) {

                System.out.println("Assertion Error: " + linkovi.get(i) + " expected " + ocekivano + " but got " + dobijeno);

//                Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
            }
        }





    }
}
