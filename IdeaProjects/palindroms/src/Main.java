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

    public static String reverse(String word) {
       char[] chars = word.toCharArray();
       String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars.length > 0) {
                reverse += chars[i];
            }
        }
        return reverse;
    }
    public static List<String> palindromes(String wort) {
        List<String> gleich = new ArrayList<>();
        String[] word = wort.split(" ");
        if (wort.length() == 0) return gleich;


        for (int i = 0; i < word.length; i++) {

            if (word[i].length() == 1) {
                gleich.add(word[i]);
            }

            if (word[i].toLowerCase().equals(reverse(word[i].toLowerCase()))) {
                gleich.add(word[i]);
            }



        }
        return gleich;
    }

    public static void main(String[] args) {
        List<String> palindromes = palindromes("Es ist stets dasselbe Beispiel");
        System.out.println(palindromes); // => ["stets"]
        System.out.println(palindromes("Regallager")); // => ["Regallager"]
        System.out.println(palindromes("no palinedromes")); // => []
        System.out.println(palindromes("Natan ist stets weise")); // => ["Natan", "stets"]
    }
}
