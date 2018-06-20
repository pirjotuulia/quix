import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<Kysymys> kysymykset = new ArrayList<>();
    static int pisteet;

    public static void main(String[] args) {

        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        kysymykset.add(new Kysymys("Mikä on Java?", "Ohjelmointikieli", "Saari", "Hedelmä", "a"));
        kysymykset.add(new Kysymys("Mikä on olio?", "Mörkö", "Luokan ilmentymä", "Hedelmä", "b"));
        kysymykset.add(new Kysymys("Mitä tekee PrintWriter?", "Kirjoittaa tekstiä", "Kastelee kukkia", "Soittaa InputStreamReaderia", "a"));
        kysymykset.add(new Kysymys("Mikä on uusi in?", "Undecimber", "out", "Hedelmä", "b"));
        kysymykset.add(new Kysymys("Mikä on uusi hard?", "Soft", "Hassut housut", "Hedelmä", "a"));
        kysymykset.add(new Kysymys("Mikä on holio?", "Mörkö", "Ei mikään", "Hedelmä", "b"));
        kysymykset.add(new Kysymys("Täydennä: Grow your ...", "Strengths", "Intelligences", "Fruits", "a"));
        kysymykset.add(new Kysymys("Mitä voi metsästää regexillä (\\d{4}(\\.|\\-|\\/)\\d{1,2}(\\.|\\-|\\/)\\d{1,2})|(\\d{1,2}(\\.|\\-|\\/)\\d{1,2}(\\.|\\-|\\/)\\d{4})?", "IP-osoitteita", "Hedelmiä", "Päivämääriä", "c"));
        kysymykset.add(new Kysymys("Mikä näistä on Javassa varattu avainsana?", "const", "pabst", "fruit", "a"));
        kysymykset.add(new Kysymys("Mikä on Exceptionin kantaluokka?", "Error", "Throwable", "ThrowApple", "b"));
        kysymykset.add(new Kysymys("Nimettömiä metodeja ovat...", "Lambadat", "Lambdat", "Longanit", "b"));

        // TODO Kysymykset
        System.out.println("\nTervetuloa pelaamaan Hedelmä-kysymyspeliä. Vastaa kymmeneen kysymykseen... jos vain uskallat!");

        for (int i=0;i<10;i++) {
            int q = random.nextInt(kysymykset.size());
            System.out.println("\nKysymys "+(i+1)+"/10: "+kysymykset.get(q));
            String vastaus = validoi();
            if (vastaus.equals("x")) break;
            boolean tosi = tarkistaVastaus(vastaus, q);
            laskuri(tosi);

            // TODO ??
            kysymykset.remove(q);
        }
        System.out.println("\nPeli päättyi. Pisteesi: "+pisteet+"/10");
    }

    static String validoi () {
        Scanner sc = new Scanner (System.in);
        while (true) {
            String vastaus = sc.nextLine();
            vastaus = vastaus.toLowerCase();
            if (vastaus.equals("a") || vastaus.equals("b") || vastaus.equals("c") || vastaus.equals("x")) {
                return vastaus;
            } else {
                System.out.println("Valitse a, b tai c!");
            }

        }
    }

    static boolean tarkistaVastaus(String vastaus, int q) {
        return (vastaus.equals(kysymykset.get(q).getOikea()));
    }

    static void laskuri(boolean tosi) {
        if (tosi) {
            System.out.println("\nVastaus on oikein!");
            pisteet++;
            System.out.println("Pisteesi: "+pisteet);
        } else {
            System.out.println("\nVäärä vastaus!");
        }
    }
}
