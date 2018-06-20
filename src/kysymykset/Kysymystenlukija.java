package kysymykset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kysymystenlukija {

    public List<Kysymys> kysymyslista() {
        ArrayList<Kysymys> kysymykset = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(new File("kysymykset.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                String kysymys = tiedostonLukija.nextLine();
                List<String> vastausvaihtoehdot = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                    vastausvaihtoehdot.add(tiedostonLukija.nextLine());
                }
                int vastaus = Integer.parseInt(tiedostonLukija.nextLine());
                Kysymys k = new Kysymys(kysymys, vastausvaihtoehdot, vastaus);
                kysymykset.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Virhe: " + e.getMessage());
        }
        return kysymykset;
    }
}

