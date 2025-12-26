import java.util.HashMap;
import java.util.Map;

/**
 * ## Worthäufigkeit in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun eine Methode `wordCount()`, die die absolute
 * Häufigkeit von Worten in einem Text mittels eines Mappings zählt.
 * Worte sind durch ein oder mehrere Whitespace Zeichen
 * (Leerzeichen, Tabulatoren, Linebreaks, etc.) voneinander getrennt.
 * Worte sollen case-insensitiv gezählt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - In regulären Ausdrücken können Sie alle Whitespace Zeichen
 *   mit `"\\s"` selektieren.
 *
 */
class Main {
    public static Map<String, Integer> wordCount(String words) {
        Map<String, Integer> count = new HashMap<>();
        String[] array = words.trim().toLowerCase().split("\\s+");
        for (int i =0; i < array.length; i++) {
            count.put(array[i], count.getOrDefault(array[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = wordCount("aa BB cC Aa Cc Bb aA AA");
        System.out.println(result); // => { "aa": 4, "bb": 2, "cc": 2 }
        System.out.println(wordCount("Ein kleines Beispiel"));
        // => { "ein": 1, "kleines": 1, "beispiel": 1 }
    }
}