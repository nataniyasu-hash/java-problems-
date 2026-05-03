import java.util.ArrayList;
import java.util.List;

public class Exam extends Bar implements Misc {
    private List<Boolean> result= new ArrayList<>();
    public List<Boolean> getResult() {
        return result;
    }
    public double test(Foo f) {
        return 42.0;
    }
    public boolean check(Foo f) {
        return true;
    }
    public String magic(String s) {
        return s;
    }
}
