import java.util.ArrayList;

/**
 * Created by MarcR on 20.11.2016.
 */
public class Zauberer extends Spielfiguren {

    int mana;

    public Zauberer(String beschreibung, String name, double groeße, ArrayList<String> inventar, int mana) {
        super(beschreibung, name, groeße, inventar);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Zauberer: " + super.toString() + " Mana: "+getMana();
    }
}
