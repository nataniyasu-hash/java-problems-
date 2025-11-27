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
    public static List<String> blocks(String liste) {
        List<String> zeichnen = new ArrayList<>();
        if (liste.isEmpty()) return zeichnen;
        int count = 1;
        char aktu = liste.charAt(0);

        for (int i = 1; i < liste.length(); i++) {
            if (liste.charAt(i) == aktu) {
                count++;
            } else {
                if (count >= 2){
                String ekub = String.valueOf((aktu)).repeat(count);
                zeichnen.add(ekub);
                }
                aktu = liste.charAt(i);
                count = 1;
            }

        }
        if (count >= 2) {
            String ekub = String.valueOf(aktu).repeat(count)
            zeichnen.add(ekub);
        }
        return zeichnen;
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
