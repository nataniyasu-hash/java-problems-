import java.util.ArrayList;
import java.util.List;

public class Aufgabe {
    private String text;
    private double gewichtung;
    private List<Antwort> antworten = new ArrayList<>();

    public Aufgabe(String t, double d) {
        this.text= t;
        this.gewichtung = d;
    }

    public String stelleFrage() {
        return "what";
    }

    public List<Antwort> listAntworten() {
        return new ArrayList<>();
    }


}
