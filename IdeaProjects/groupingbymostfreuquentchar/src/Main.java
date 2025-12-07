import java.util.*;

/**
 * Gegeben sei eine Liste von Worten.
 *
 * Entwickeln Sie bitte eine Methode `groupByMostFrequentChar()`,
 * die alle Worte in einem Text anhand des häufigsten Buchstabens in einem Wort gruppiert.
 *
 * Hat ein Wort mehrere häufigste Buchstaben,
 * soll nach dem ersten im Wort vorkommenden häufigsten Buchstaben gruppiert werden.
 *
 * - Der häugigste Buchstabe in "Kaffeekanne" wäre bspw. das 'e'.
 * - Der häugiste Buchstabe in "Kaffee" wäre 'f', da f vor e in Kaffee steht!
 *
 * Beachten Sie die Checkliste zur Entwicklung von Methoden:
 *
 * Methodenkopf:
 * 1. Was geht rein?
 * 2. Was kommt raus?
 * 3. Wie heißt die Logik?
 *
 * Methodenrumpf:
 * - [ggf. Guard Conditions]
 * - Aggregatvariable (1)
 * - [ggf. Hilfsvariablen]
 * - [ggf. Preprocessing]
 * - Data Loop (3)
 *   - Logik (4)
 * - [ggf. Postprocessing]
 * - Return (2)
 *
 */
public class Main {
    public static Character mostfrequentchar(String word) {
    word = word.toLowerCase();
    char[] buchtabe = word.toCharArray();
    int mostfrequentsofar = 1;
    char mostfrequentchar = buchtabe[0];
    for (char w : buchtabe) {
        int current = word.length() - word.replaceAll(w+"","").length();
        if (current > mostfrequentsofar) {
            mostfrequentchar = w;
            mostfrequentsofar = current;
        }
    }
    return mostfrequentchar;
    }

    public static Map<Character, List<String>> groupByMostFrequentChar(List<String> words) {
        Map<Character, List<String>> ordered = new TreeMap<>();
        for (String w : words) {
            ordered.put(mostfrequentchar(w), new ArrayList<>());
        }
        for (String w : words) {
            ordered.get(mostfrequentchar(w)).add(w);
        }
        return ordered;
    }
public static void main(String[] args) {
    List<String> words = List.of(
            "Mama", "Tee", "Kaffeekanne",
            "Schuss", "Alle", "Seele",
            "Klappspaten", "Sessel", "Knaller"
    );

    Map<Character, List<String>> grouped = groupByMostFrequentChar(words);
    System.out.println(grouped);
    // => {e=[Tee, Kaffeekanne, Seele], l=[Alle, Knaller], m=[Mama], p=[Klappspaten], s=[Schuss, Sessel]}
}
}