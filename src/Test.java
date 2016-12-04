import java.util.ArrayList;

/**
 * Created by MarcR on 20.11.2016.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("Testprogramm startet: \n");

        String gold = "100 Gold";
        String essen = "Apfel";
        String zauberstab = "Donnerspalter";
        String gegenstand  = "Hammer";

        ArrayList<String> invEinfach = new ArrayList<String>();
        invEinfach.add(gold);
        invEinfach.add(gold);
        invEinfach.add(gold);

        ArrayList<String> invZauberer = new ArrayList<String>();
        invZauberer.add(zauberstab);
        invZauberer.add(gold);
        invZauberer.add(essen);


        ArrayList<String> invDrache = new ArrayList<String>();
        invDrache.add(gegenstand);
        invDrache.add(gold);
        invDrache.add(gold);

        Spielfiguren sf1 = new Spielfiguren("Bauer","Herman der Lustige", 1.8, invEinfach );

        Zauberer z1 =  new Zauberer("Mächtiger Zabuerer","Merlin", 1.9, invZauberer, 100);

        Drachen d1 =  new Drachen("Großer Roter", "Ragnaror der Rote", 13.5, invDrache,  300, "Feuer");


        ArrayList<Spielfiguren> alleSpielfiguren = new ArrayList<Spielfiguren>();
        alleSpielfiguren.add(sf1);
        alleSpielfiguren.add(z1);
        alleSpielfiguren.add(d1);

        System.out.println("Ihr seht folgende Spielfiguren auf dem Feld: \n");
        for( Spielfiguren s : alleSpielfiguren){

            System.out.println(s);

        }

        System.out.println("\nProgramm beendet");

    }
}
