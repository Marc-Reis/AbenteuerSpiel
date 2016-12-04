import java.util.ArrayList;

/**
 * Created by MarcR on 20.11.2016.
 */
public class Drachen extends Spielfiguren {

    int staerke;
    String sonderfaehigkeit;

    public Drachen(String beschreibung, String name, double groeße, ArrayList<String> inventar, int staerke, String sonderfaehigkeit) {
        super(beschreibung, name, groeße, inventar);
        this.staerke = staerke;
        this.sonderfaehigkeit = sonderfaehigkeit;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public String getSonderfaehigkeit() {
        return sonderfaehigkeit;
    }

    public void setSonderfaehigkeit(String sonderfaehigkeit) {
        this.sonderfaehigkeit = sonderfaehigkeit;
    }


    @Override
    public String toString() {
        return "Drache "+ super.toString() + "Stärke: "+getStaerke() +" Sonferfähigkeiten "+getSonderfaehigkeit();
    }
}
