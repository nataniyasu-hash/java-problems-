import java.util.ArrayList;
import java.util.List;

public class Pruefung {
    private String bezeichnung;
    private String datum;
    private int dauer;

    protected List<Aufgabe> aufgaben = new ArrayList<>();

    public Pruefung(String b, String d, int dauer) {
        this.bezeichnung = b;
        this.datum = d;
        this.dauer = dauer;
    }

    public void aktualisiereDauer(int a) {
        dauer = a;
    }

    public List<Antwort> getResultate() {
        return new ArrayList<>();
    }

    public void ergaenze(Aufgabe a) {
        aufgaben.add(a);
    }
}
