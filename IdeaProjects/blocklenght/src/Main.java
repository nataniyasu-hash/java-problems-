import java.util.List;
import java.util.ArrayList;

/**
 * ## Blocklängen in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun bitte eine Methode `blockLengths()`,
 * um in einem String die Blocklängen gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<Integer> blockLengths(String text) {
    List<Integer> repeats = new ArrayList<>();
    char[] chars = text.toCharArray();
    if (chars.length == 0) return repeats;
    char alpha = chars[0];
    int count = 1;

    for (int i = 1; i < chars.length; i++) {
        if (alpha == chars[i]) {
            count++;
        } else {
            if (count > 1) {
                repeats.add(count);
                alpha = chars[i];
                count = 1;
            }
            if (count == 1) {
                alpha = chars[i];
            }
        }
    }
    if (count > 1) repeats.add(count);
    return repeats;
    }


    public static void main(String[] args) {
        List<Integer> blocks = blockLengths("Hello faaantastic world");
        System.out.println(blocks); // => [2, 3]
        System.out.println(blockLengths("aaabccdeeeefaaa")); // => [3, 2, 4, 3]
        System.out.println(blockLengths("This is an example")); // => []
        System.out.println(blockLengths("Another  example ...")); // => [2, 3]
        System.out.println(blockLengths("")); // => []
    }
}
