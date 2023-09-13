package pp_12_09_2023;

import dd_11_09_2023.Autor;

public class Knjiga {

    private String isbn;
    private String nazivKnjige;
    private int godinaIzdanja;
    private Autor autorKnjige;

    public Knjiga(Autor autor) {
        this.autorKnjige = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void stampajKnjigu() {
        System.out.println(isbn);
        System.out.println(nazivKnjige + " - " + godinaIzdanja);
        System.out.println("autor: " + autorKnjige.getIme() + "- " + autorKnjige.getPrezime());
    }
}