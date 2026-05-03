import java.util.ArrayList;
import java.util.List;

public class Lecturer implements Teaching {
    private  String givenName;
    private String lastName;
    private List<LectureNote> units = new ArrayList<>();

    public Lecturer(String g, String l) {
        this.givenName = g;
        this.lastName = l;
    }
    public String toString() {
        return givenName;
    }

    public void teach(String a) {

    }

    public String answerQuestion(String a) {
        return "gute Frgae";
    }
}
