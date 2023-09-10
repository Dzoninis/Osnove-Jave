package dd_07_09;

public class Zadatak_1 {
    public static void main(String[] args) {

//        Zadatak 1: Kreiranje klase "Student"
//        Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.


        Student student_1 = new Student();

        student_1.ime = "Pera Peric";
        student_1.brojIndexa = 55486;
        student_1.fakultet = "Medicinski fakultet - Nis";

        Student student_2 = new Student();

        student_2.ime = "Marko Markovic";
        student_2.brojIndexa = 48668;
        student_2.fakultet = "Ekonomski fakultet - Nis";

        Student student_3 = new Student();

        student_3.ime = "Nikola Nikolic";
        student_3.brojIndexa = 16838;
        student_3.fakultet = "Masinski fakultet - Nis";

        System.out.println("Student " + student_1.ime + ", broj indeksa studenta je " + student_1.brojIndexa + ", a fakultet je " + student_1.fakultet);
        System.out.println("Student " + student_2.ime + ", broj indeksa studenta je " + student_2.brojIndexa + ", a fakultet je " + student_2.fakultet);
        System.out.println("Student " + student_3.ime + ", broj indeksa studenta je " + student_3.brojIndexa + ", a fakultet je " + student_3.fakultet);

    }
}
