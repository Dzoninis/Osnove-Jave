package d15_08_2023;

public class domaci_zadatak_5 {

    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
//        Za stranicu trougla postavite proizvoljnu vrednost.
//        Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30


        int a = 25;
        double KOREN_BROJA_3 = 1.73;
        double povrsina = 0.25 * a * a * KOREN_BROJA_3;
        int obim = 3 * a;

        System.out.println();
        System.out.println("a: " + a);
        System.out.println("Povrsina je " +povrsina);
        System.out.println("Obim je " + obim);

    }
}
