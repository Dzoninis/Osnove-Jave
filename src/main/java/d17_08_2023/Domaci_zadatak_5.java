package d17_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//        Primer 1:                                              Primer 2:
//        Unestite a: 6                                        Unestite a: 6
//        Unesite b: 3                                         Unesite b: 3
//        Unesite operator: +                             Unesite operator: /
//        Rezultat: 9                                           Rezultat: 2


        System.out.println("Unesite A: ");
        int a = scanner.nextInt();
        System.out.println("Unesite B: ");
        int b = scanner.nextInt();
        System.out.println("Unesite operator: ");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat: " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat: " + (a - b));
        } else if (operator.equals("*")) {
            System.out.println("Rezultat: " + (a * b));
        } else if (operator.equals("/")) {
            System.out.println("Rezultat: " + (a / b));
        }




    }
}
