package d15_08_2023;

public class domaci_zadatak_7 {

    public static void main(String[] args) {

//        Napisati program koji za datu boju trazi kontrastnu boju. Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
//        Svaka komponenta boje je u opsegu od 0 do 255(informativno)
//                Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
//        Primer izvrsenja:
//        Originalna boja: RGB(140, 12,  100)
//        Kontrastna boja: RGB(115, 243, 155)

        int red = 140, green = 12, blue = 100;
        int komponenta = 255;
        int kontrastRed = komponenta - red;
        int kontrastGreen = komponenta - green;
        int kontrastBlue = komponenta - blue;


        System.out.println("Originalna boja: RGB(" + red + ", " + green + ", " + blue + ")" );
        System.out.println ("Kontrasna boja: RGB(" + kontrastRed + ", " + kontrastGreen + ", " +  kontrastBlue + ")" );


    }
}
