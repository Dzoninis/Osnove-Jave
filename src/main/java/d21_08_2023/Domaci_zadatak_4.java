package d21_08_2023;

import java.util.Scanner;

public class Domaci_zadatak_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1
//
//        Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//        POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter


        System.out.print("Unesite N: ");
        int brojUnosa = scanner.nextInt();
        String reakcija = "";

        int likeCounter = 0;
        int smileCounter = 0;
        int heartConter = 0;

        for (int i = 0; i < brojUnosa; i++) {
            System.out.print("Reaguj: ");
            reakcija = scanner.next();
            if (reakcija.equals("like")) {
                likeCounter = likeCounter + 1;
            } else if (reakcija.equals("smile")) {
                smileCounter = smileCounter + 1;
            } else if (reakcija.equals("heart")) {
                heartConter = heartConter + 1;
            }
        }

            System.out.println("Summary: like " + likeCounter + " | smile " + smileCounter + " | heart " + heartConter);
        }




}
