import java.util.List;
import java.util.ArrayList;

/**
 * ## `missingWord()`
 *
 * Entwickeln Sie bitte eine Methode `missingWord()`, die aus einer
 * Zeichenkette eine Liste von Worten, allerdings ohne das n-te Wort, erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * __Achtung:__
 * Das *n*-te Wort muss nicht existieren.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<String> missingWord(String text, int a) {
        List<String> words = new ArrayList<>();


        String[] wort = text.trim().split("\\s+");
        if (wort.length == 0) return words;


        for (int i = 0; i < wort.length; i++) {
            if (i == a) {
                continue;
            } else {
                words.add(wort[i]);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        List<String> words = missingWord("Dies ist nur ein Beispiel", 2);
        System.out.println(words); // => [Dies, ist, ein, Beispiel]
        System.out.println(missingWord("Hello World", 1));  // => [Hello]
        System.out.println(missingWord("Hello World", 0));  // => [World]
        System.out.println(missingWord("Hello World", 2));  // => [Hello World]
        System.out.println(missingWord("Hello World", -1)); // => [Hello World]
    }
}