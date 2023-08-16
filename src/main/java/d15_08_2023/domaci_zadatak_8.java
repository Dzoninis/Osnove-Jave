package d15_08_2023;

public class domaci_zadatak_8 {

    public static void main(String[] args) {
//        Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla. Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb. Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu
//        naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
//                *****************************
//                 ***********procenat %
//                 *****************************
//        Primer izvrsenja:
//        profile-image.png 7Mb/2Mb
//                *****************************
//                 *********** 28%
//                *****************************

        String nazivFajla = "selenium_documentation.pdf";
        int velicinaSkinutogFajla = 25;
        int velicinaOriginalnogFajla = 150;
        int procenat= 100 * velicinaSkinutogFajla / velicinaOriginalnogFajla;

        System.out.println();
        System.out.println(nazivFajla + velicinaOriginalnogFajla + "Mb/" + velicinaSkinutogFajla + "Mb");
        System.out.println ("*******************");
        System.out.println("***********" + procenat + "%");
        System.out.println ("*******************");

    }
}

