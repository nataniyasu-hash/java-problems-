import java.util.*;

/**
 * Gegeben sei eine Liste von Worten.
 *
 * Entwickeln Sie bitte eine Methode `groupWordsByFirstChar()`,
 * die alle Worte in einem Text anhand ihres Anfangsbuchstabens
 * gruppiert und als **Map** zurück gibt.
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
 public class Main{
public static Map<Character, List<String>> groupWordsByFirstCharacter(String text) {
    Map<Character, List<String>> grouped = new HashMap<>();
    String[] words = text.trim().split("\\s+");

    for (String w : words) {
        char alpha = w.charAt(0);
        grouped.put(alpha, new ArrayList<>());
    }
    for (String w : words) {
    grouped.get(w.charAt(0)).add(w);
}
    return grouped;
}



public static void main(String[] args) {
    String text = "Dies ist mal wieder nur ein Beispiel - ein doofes Beispiel";

    Map<Character, List<String>> grouped = groupWordsByFirstCharacter(text);
    System.out.println(grouped);
    // => {-=[-], B=[Beispiel, Beispiel], D=[Dies], d=[doofes], e=[ein, ein], i=[ist], m=[mal], n=[nur], w=[wieder]}

}
}