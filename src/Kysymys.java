public class Kysymys {
    private String kysymys;
    private String vastaus1;
    private String vastaus2;
    private String vastaus3;
    private String oikea;

    public Kysymys(String kysymys, String vastaus1, String vastaus2, String vastaus3, String oikea) {
        this.kysymys = kysymys;
        this.vastaus1 = vastaus1;
        this.vastaus2 = vastaus2;
        this.vastaus3 = vastaus3;
        this.oikea = oikea;
    }

    @Override
    public String toString() {
        return kysymys + '\n' +
                "\ta) " + vastaus1 + '\n' +
                "\tb) " + vastaus2 + '\n' +
                "\tc) " + vastaus3 + '\n' +
                "Anna vastaus (a, b tai c) tai lopeta (x): "
                ;
    }

    public String getKysymys() {
        return kysymys;
    }

    public String getVastaus1() {
        return vastaus1;
    }

    public String getVastaus2() {
        return vastaus2;
    }

    public String getVastaus3() {
        return vastaus3;
    }

    public String getOikea() {
        return oikea;
    }
}
