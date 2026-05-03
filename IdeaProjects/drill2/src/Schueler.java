public class Schueler extends Person {
    private String Id;

    public Schueler(String id, String n) {
        super(n);
        this.Id= id;
    }

    public String toString() {
        return Id + "";
    }
}
