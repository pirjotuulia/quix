public class Kysymys {
    private String kysymys;
    private String vastaus;


    public Kysymys(String kysymys, String vastaus) {
        this.kysymys = kysymys;
        this.vastaus = vastaus;
    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public String getVastaus() {
        return vastaus;
    }

    public void setVastaus(String vastaus) {
        this.vastaus = vastaus;
    }


}
