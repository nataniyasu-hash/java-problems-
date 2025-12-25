import java.util.ArrayList;
import java.util.List;

/**
 * ## Palindrome in Zeichenketten bestimmen
 *
 * Palindrome sind Zeichenketten, die von vorne und hinten
 * gelesen, dasselbe Wort ergeben (z.B. "stets"). Die Groß-/
 * Kleinschreibung soll dabei ignoriert werden.
 *
 * Ein Wort ist eine zusammenhängende Zeichenkette, welches 
 * durch ein oder mehrere Leerzeichen von anderen Worten in
 * einer Zeichenkette getrennt ist.
 *
 * Entwickeln Sie nun bitte eine Methode `palindromes()`,
 * um in einem String alle Palindromwörter zu bestimmen
 * und diese Palindrome als Liste von Zeichenketten zurückzugeben.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static String drehen (String wort) {
        String gedreht = "";
        char[] chars = wort.toLowerCase().toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            gedreht += chars[i];
        }
        return gedreht;
    }
    public static List<String> palindromes(String words) {
        List<String> gedreht = new ArrayList<>();
        String[] array = words.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().equals(drehen(array[i]))) {
                gedreht.add(array[i]);
            }
        }
        return gedreht;
    }

    public static void main(String[] args) {
        List<String> palindromes = palindromes("Es ist stets dasselbe Beispiel");
        System.out.println(palindromes); // => ["stets"]
        System.out.println(palindromes("Regallager")); // => ["Regallager"]
        System.out.println(palindromes("no palinedromes")); // => []
        System.out.println(palindromes("Natan ist stets weise")); // => ["Natan", "stets"]
    }
}
