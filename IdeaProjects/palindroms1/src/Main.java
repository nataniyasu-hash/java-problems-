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
    public static String reverese(String wort) {
            char[] chars = wort.toCharArray();
            String reverse= "";
            for (int j = chars.length - 1; j >=0; j-- ) {

                reverse += chars[j];
            }
return reverse;

    }
    public static List<String> palindromes(String wort) {
String [] words = wort.split("\\s+");
List<String> reverse = new ArrayList<>();
if (words.length == 0) return reverse;

for (int i = 0; i < words.length; i++) {
    if (words[i].length() == 1) reverse.add(words[i]);
    if (words[i].toLowerCase().equals(reverese(words[i].toLowerCase()))) {
        reverse.add(words[i]);
    }
}
return reverse;
    }

    public static void main(String[] args) {
        List<String> palindromes = palindromes("Es ist stets dasselbe Beispiel");
        System.out.println(palindromes); // => ["stets"]
        System.out.println(palindromes("Regallager")); // => ["Regallager"]
        System.out.println(palindromes("no palinedromes")); // => []
        System.out.println(palindromes("Natan ist stets weise")); // => ["Natan", "stets"]
    }
}
