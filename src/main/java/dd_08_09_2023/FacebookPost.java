package dd_08_09_2023;

public class FacebookPost {

    public String imePrezimeKorisnika;
    public String imeZaTudjiProfil;
    public String tekstObjave;
    public int like;
    public int share;

    public int brojLajkova () {
        int brojacLajkova = 0;
        brojacLajkova = like + 1;
       return brojacLajkova;
    }

    public int brojShareova () {
        int brojacShareova = 0;
        brojacShareova = share + 1;
        return brojacShareova;
    }



}
