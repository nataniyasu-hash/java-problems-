import java.sql.Array;
import java.util.List;
import java.util.Arrays;
import java.util.*;

/**
 * ## Generische `zip()`-Methode
 *
 * Entwickeln Sie bitte eine eigenständig generische `zip()`-Methode,
 * die zwei Listen zu einer Liste von `Couple`s zusammenführt.
 *
 * Aufruf-Beispiele zur Erzeugung von `Couple`s und Nutzung
 * der `zip()`-Methode finden Sie in der `main()`-Methode.
 *
 * Beachten Sie, dass zu zippende Listen nicht gleich lang sein müssen.
 * Achten Sie ferner auf eine sinnvolle und mit den Beispielen
 * übereinstimmende `null`-Behandlung.
 *
 */
class Main {

    public static <A, C> List<Couple<A, C>> zip(List<A> list1, List<C> list2) {
        List<Couple<A, C>> col = new ArrayList<>();
        if(list1 == null || list2 == null) return null;

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                col.add(new Couple<>(list1.get(i), list2.get(j)));
            }
        }
        return col;
    }

    // Entwickeln Sie hier bitte die zip()-Methode

    public static void main(String[] args) {
        // Beispiel zur Couple-Erzeugung
        Couple<String, Integer> c = new Couple<>("Answer", 42);
        System.out.println(c.first()); // => Answer
        System.out.println(c.second()); // => 42
        System.out.println(c.toString()); // => (Answer, 42)

        // Beispiellisten unterschiedlichen Typs
        List<Integer>   l1 = Arrays.asList(1, 2, 3);
        List<Character> l2 = Arrays.asList('a', 'b');
        List<Boolean>   l3 = Arrays.asList(true);

        // Beispiel zip()-Aufrufe
        List<Couple<Integer, Character>> r = zip(l1, l2);
        System.out.println(r);             // => [(1, a), (2, b), (3, null)]
        System.out.println(zip(l2, l3));   // => [(a, true), (b, null)]
        System.out.println(zip(l3, l2));   // => [(true, a), (null, b)]
        System.out.println(zip(l1, null)); // => null
    }
}
