import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * ## Generische `compact()`-Methode
 *
 * Entwickeln Sie bitte eine eigenständig generische `compact()`-Methode,
 * die in beliebigen Listen alle `null` Einträge herausfiltert.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static <A> List<A> compact(List<A> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        List<A> liste = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null)
                liste.add(list.get(i));
        }
        return liste;
    }

    public static void main(String[] args) {
        List<Integer> is = Arrays.asList(1, 2, 3, null, 4, 5, 6);
        List<Integer> cis = compact(is);
        System.out.println(cis); // [1, 2, 3, 4, 5, 6]
        List<String> strings = Arrays.asList("Hello", null, "World");
        System.out.println(compact(strings)); // ["Hello", "World"]
    }
}
