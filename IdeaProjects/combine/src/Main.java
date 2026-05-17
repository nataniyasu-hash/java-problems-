import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * ## Generic `combine()`
 *
 * Entwickeln Sie nun bitte eine generische Klasse `Combination`
 * und eine eigenständig generische Methode `combine()`.
 * `combine()` soll alle Elemente zweier Listen beliebigen Typs
 * paarweise kombinieren und als Liste von 
 * `Combination`s zurück geben.
 *
 * Aufrufbeispiele zur Erzeugung einer `Combination` und
 * dem Aufruf der Methode `combine()`  finden Sie in der
 * `main()`-Methode.
 *
 * Achten Sie auf eine sinnvolle Behandlung von null-Pointern.
 *
 */
class Main {

    public static <A, S> List<Combination<A, S>> combine(List<A> list1, List<S> list2) {
        List<Combination<A, S>> result = new ArrayList<>();
        if (list1 == null || list2 == null || list2.isEmpty() || list2.isEmpty())
            return result;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                result.add(new Combination<>(list1.get(i), list2.get(j)));
            }
        }
        return result;
    }

    // Bitte hier die Methode combine() entwicklen.

    public static void main(String[] args) {
        // Combination-Beispiele
        Combination<String, Integer> c = new Combination<>("Hello", 42);
        System.out.println(c.toString()); // => (Hello, 42)
        System.out.println(c.getFirst()); // => Hello
        System.out.println(c.getSecond()); // => 42

        List<String> strs = Arrays.asList("A", "B", "C");
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> doubles = Arrays.asList(0.0);
        List<Boolean> bools = Arrays.asList();
        List<Character> nil = null;

        List<Combination<Integer, Double>> result = combine(ints, doubles);
        System.out.println(result);
        // => [(1, 0.0), (2, 0.0)]

        System.out.println(combine(doubles, ints)); // => [(0.0, 1), (0.0, 2)]
        System.out.println(combine(strs, bools)); // => []
        System.out.println(combine(nil, strs)); // => []
    }
}
