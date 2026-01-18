import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * ## `wordMultiple()`
 *
 * Gegeben sei eine Liste von Strings. Entwickeln Sie eine Methode `wordMultiple()`, die
 * mittels einer Map kenntlich macht, welche der Zeichenketten mehrmals in der
 * Liste von Strings vorkommt. Leere Zeichenketten sollen nicht berücksichtigt werden.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */
public class Main {
    public static Map<String, Boolean> wordMultiple(List<String> list) {
        Map<String, Boolean> mapping = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) continue;
            count.put(list.get(i), count.getOrDefault(list.get(i), 0) + 1);
        }

        for (String alpfa : count.keySet()) {
            mapping.put(alpfa, count.get(alpfa) > 1);
        }

        return mapping;

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Boolean> multiple = wordMultiple(list);
        System.out.println(multiple);
        // => { "a": true, "b": true, "c": false }

        list = Arrays.asList("c", "b", "a");
        System.out.println(wordMultiple(list));
        // => { "a": false, "b": false, "c": false }

        list = Arrays.asList("c", "c", "c");
        System.out.println(wordMultiple(list));
        // => { "c": true }
    }
}