import java.util.*;

public class Dice {
    String wurf;


    public Dice (int a ) {
        wurf = "W"+ a;
    }

    public Dice () {
       int random = (int) Math.random() * 6 + 1;
       wurf = "W" + random;
    }
    public String toString() {
        return wurf;
    }
    public static Map<String, Integer> evaluate(List<Dice> list) {
        Map<String, Integer > mapping = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); i++) {
            mapping.put(list.get(i).toString(), mapping.getOrDefault(list.get(i).toString(), 0) + 1);
        }
        return mapping;
    }

}
