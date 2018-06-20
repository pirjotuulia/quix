package kayttis;

import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.List;
import java.util.Scanner;
import kysymys1.Tekstikayttoliittyma;
import fi.academy.saana.KayttoliittymaHedelma;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä peliä haluat pelata? Hedelmäpeli, Suomi-visa vai Tietopeli? (h/s/t)");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("h")) {
            //käynnistä Saanan peli;
            KayttoliittymaHedelma klh = new KayttoliittymaHedelma();
            klh.kaynnista();
        } else if (vastaus.equals("s")) {
            Kysymystenlukija kys = new Kysymystenlukija();
            List<Kysymys> kysymykset = kys.kysymyslista();
            Kayttoliittyma kl = new Kayttoliittyma(kysymykset);
            kl.kaynnista();
        } else if (vastaus.equals("t")) {
            Tekstikayttoliittyma t = new Tekstikayttoliittyma();
            t.kaynnista();
        }
    }
}
