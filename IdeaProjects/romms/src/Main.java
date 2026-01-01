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
    public static List<String> blocks(String words) {
        List<String> blocks = new ArrayList<>();
        int count = 1;
        if (words.length() == 0) return blocks;
        char temp = words.charAt(0);
        for (int i = 1; i < words.length(); i++) {
            if (temp == words.charAt(i)) {
                count++;
                temp = words.charAt(i);
            } else {
                if (count > 1) {
                    String ekub = String.valueOf(temp).repeat(count);
                    blocks.add(ekub);
                    count = 1;
                }
                temp = words.charAt(i);

            }
        }
        if (count > 1) {
            String ekub = String.valueOf(temp).repeat(count);
            blocks.add(ekub);
        }
        return blocks;
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
