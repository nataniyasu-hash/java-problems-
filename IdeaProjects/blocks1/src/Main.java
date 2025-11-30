import java.util.ArrayList;
import java.util.List;

/**
 * ## Blöcke in Zeichenketten bestimmen.
 *
 * Entwickeln Sie nun bitte eine Methode `blocks()`,
 * um in einem String alle Blöcke gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<String> blocks(String wort) {
        List<String> repeats = new ArrayList<>();
        if (wort.length() == 0 ) return repeats;
        char s = wort.charAt(0);
        int count = 1;

        for (int i = 1; i <wort.length(); i++) {
            if (s == wort.charAt(i)) {
                count++;
            } else {
                if (count >= 2 ) {
                    String ekub = String.valueOf(s).repeat(count);
                    repeats.add(ekub);
                }
                s = wort.charAt(i);
                count = 1;

            }

        }
        if (count > 1) {
            String ekub = String.valueOf(s).repeat(count);
            repeats.add(ekub);
        }
            return repeats;

    }

    public static void main(String[] args) {
        List<String> blocks = blocks("Hello faaantastic world");
        System.out.println(blocks); // => ["ll", "aaa"]
        System.out.println(blocks("aaabccdeeeefaaa")); // => ["aaa", "cc", "eeee", "aaa"]
        System.out.println(blocks("This is an example")); // => []
        System.out.println(blocks("Another  example ...")); // => ["  ", "..."]
        System.out.println(blocks("")); // => []
    }
}
