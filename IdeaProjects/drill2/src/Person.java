import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private List<Antwort> antworten = new ArrayList<>();

    public Person(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
