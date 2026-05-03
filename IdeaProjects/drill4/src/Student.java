import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    private String firstName;
    private String lastName;
    protected List<LectureNote> notes = new ArrayList<>();
    protected List<Teaching> visits = new ArrayList<>();

    public Student(String s, String l) {
        this.firstName = s;
        this.lastName = l;
    }


    public String toString() {
        return firstName;
    }

    public  abstract void takeNotes(String a);


}
