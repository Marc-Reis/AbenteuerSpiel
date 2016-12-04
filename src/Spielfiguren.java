import java.util.ArrayList;

/**
 * Created by MarcR on 20.11.2016.
 */
public class Spielfiguren {

    String beschreibung;
    String name;
    double groeße;
    ArrayList<String> inventar;

    public Spielfiguren(String beschreibung, String name, double groeße, ArrayList<String> inventar) {
        this.beschreibung = beschreibung;
        this.name = name;
        this.groeße = groeße;
        this.inventar = inventar;
    }

    public double getGroeße() {
        return groeße;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getName() {
        return name;
    }
    public ArrayList<String> getInventar() {
        return inventar;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setGroeße(double groeße) {
        this.groeße = groeße;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventar(ArrayList<String> inventar) {
        this.inventar = inventar;
    }

    @Override
    public String toString() {
        return "Spielfigur{" +
                "Beschreibung='" + beschreibung + '\'' +
                ", Name='" + name + '\'' +
                ", Groeße=" + groeße +
                ", Inventar=" + inventar +
                '}';
    }
}
