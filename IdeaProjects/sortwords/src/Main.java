import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
/**
 *
 * ## `sortWords()`
 *
 * Entwickeln Sie bitte eine Methode `sortWords()`, die aus einer
 * Zeichenkette eine Liste von alphabetisch sortierten Worten erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * Treten Worte mehrfach in der Zeichenkette auf, sollen diese nur
 * einmal in der Liste alphabetisch sortierter Wörter auftreten.
 * Worte sind Case-sensitiv zu handhaben.
 *
 * __Hinweis:__
 * Denken Sie über den Einsatz einer TreeMap nach.
 * Eine TreeMap erhält das Ordnungskriterium eines Schlüssels.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<String> sortWords(String text) {
        Set<String> ordered = new TreeSet<>();
        List<String> sorted = new ArrayList<>();
        if (text.isEmpty()) {
            sorted.add("");
            return sorted;

        }
        String[] words = text.trim().split("[,\\s]+");

        for (int i = 0; i < words.length; i++) {
            ordered.add(words[i]);
        }
        sorted.addAll(ordered);
        return sorted;
    }

    public static void main(String[] args) {
        List<String> words = sortWords("Dies ist nur ein Beispiel");
        System.out.println(words); // => [Beispiel, Dies, ein, ist, nur]
        System.out.println(sortWords("Abc Abc Abc"));  // => [Abc]
        System.out.println(sortWords("abc Abc"));  // => [Abc, abc]
    }
}