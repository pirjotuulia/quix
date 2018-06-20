package kayttis;

import kayttis.Kayttoliittyma;
import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä peliä haluat pelata? Hedelmäpeli, Suomi-visa vai Tietopeli? (h/s/t)");
        String vastaus = lukija.nextLine();
        if (vastaus.equals("h")) {
            //käynnistä Saanan peli;

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
