package d25_08_2023;

public class Domaci_zadatak_1 {

    public static void main(String[] args) {

//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.


        int a = 10;
        int b = 25;
        int c = 80;


        stampajVrednostZa10Vecu(a);
        stampajVrednostZa10Vecu(b);
        stampajVrednostZa10Vecu(c);

    }

    public static void stampajVrednostZa10Vecu (int x) {

        int novaVrednost = x + 10;
        System.out.println("Nova vrednost je " + novaVrednost);
    }

}
