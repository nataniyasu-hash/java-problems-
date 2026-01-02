import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

/**
 * ## Listen von Zeichenketten mittels `wordAppend()`verarbeiten
 *
 * Entwickeln Sie nun bitte eine Methode `wordAppend()`.
 * Diese soll eine Liste von Strings durchlaufen, um einen Ausgabestring
 * zu erzeugen. Gehen Sie dabei wie folgt vor:
 *
 * Immer wenn ein String zum 2., 4., 6., usw. mal in der Liste auftaucht,
 * soll der String an den Ausgabestring gehängt werden. Wenn kein String doppelt
 * vorkommt, soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Denken Sie über den Einsatz einer geeigneten Datenstruktur
 *   (`Collection`) nach.
 *
 */
public class Main {
    public static String wordAppend(List<String> list) {
        String append = "";
        Map<String, Integer> counter = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            counter.put(list.get(i), counter.getOrDefault(list.get(i), 0) + 1);
            if(counter.get(list.get(i)) % 2 == 0) {
                append += list.get(i);
            }
        }


        return append;
    }

    public static void main(String[] args) {
        List<String> example = Arrays.asList("a", "b", "a");
        String result = wordAppend(example);
        System.out.println(result); // -> "a"
        System.out.println(wordAppend(
                Arrays.asList("a", "b", "a", "c", "a", "d", "a")
        )); // -> "aa"
        System.out.println(wordAppend(Arrays.asList("a", "", "a"))); // -> "a"
    }

}