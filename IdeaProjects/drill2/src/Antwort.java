public class Antwort {
    private String text;
    private Person von;
    private Aufgabe aufgabe;

    public Antwort(String t, Person p) {
        this.text= t;
        this.von = p;

    }

    public void aendre(String s) {
        this.text= s;
    }

    public String antwort() {
        return "ok";
    }

    public boolean pruefe() {
        return true;
    }
}
