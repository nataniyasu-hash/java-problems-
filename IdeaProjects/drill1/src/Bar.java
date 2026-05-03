import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Bar {
    private Map<String, String> config = new HashMap<>();
    private List<Foo> foos;

    public abstract String magic(String s);

    protected int outcome() {
        return 42;
    }
}
