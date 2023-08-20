package d17_08_2023;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Domaci_zadatak_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//        Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.

//                Primer izvrsenja 1:
//        Unesite a: 10  -> # 10
//        Unesite b: -2   -> -2 # 10
//        Unesite c: -1   -> -1 -2 # 10
//        Unesite d: 9    -> -1 -2 # 10 9
//        String p ime vrednost = -1 -2 # 10 9


        System.out.print("Unesite a: ");
        int a = scanner.nextInt();
        System.out.print("Unesite b: ");
        int b = scanner.nextInt();
        System.out.print("Unesite c: ");
        int c = scanner.nextInt();
        System.out.print("Unesite d: ");
        int d = scanner.nextInt();

        String p = "#";


    if (a < 0) {
    p = a + " " + p;
}
    if (a >= 0) {
    p = p + " " + a;
} if (b < 0) {
    p = b + " " + p;
}
    if (b >= 0) {
    p = p + " " + b;
}
if (c < 0) {
    p = c + " " + p;
}
if ( c >= 0) {
    p = p + " " + c;
}
if (d < 0) {
    p = d + " " + p;
}
if ( d >= 0) {
    p = p + " " + d;
}
        System.out.println("String p ima vrednosti: " + p);


}




}


