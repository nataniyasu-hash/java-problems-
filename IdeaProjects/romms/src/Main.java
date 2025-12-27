import java.util.*;

/**
 * ## Primzahlen bestimmen
 *
 * Eine Primzahl ist eine natürliche Zahl > 1, die nur durch sich
 * selbst und 1 teilbar ist. Sie sollen nun Primzahlen
 * generieren und tabellarisch auf der Konsole ausgeben.
 *
 * Entwickeln Sie hierzu bitte die folgenden Methoden:
 *
 * - `isPrim()` prüft, ob eine gegebene Zahl eine Primzahl ist.
 * - `primsUntil()` erzeugt eine Liste aller aufsteigen sortierten Primzahlen
 *   bis zu einer oberen Schranke.
 * - `columnize()` erzeugt aus einer Liste eine Zeichenkette in dem jedes Element
 *   mit einem Tabulator `\t` getrennt wird. Jeder n.te Tabulator wird jedoch
 *   durch ein `\n` ersetzt (solche Zeichenketten erscheinen tabellarisch
 *   auf der Konsole).
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - https://de.wikipedia.org/wiki/Primzahl
 * - Kennen Sie noch die String Methode `trim()`?
 *
 */
class Main {
    public static boolean isPrim(int a ) {
        int count = 2;
        if (a <= 1) return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) count++;
        }
        if (count > 2) return false;
        return true;
    }
    public static List<Integer> primsUntil(int a ) {
        List<Integer> prims = new ArrayList<>();
        Set<Integer> sets = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            if(isPrim(i))
                sets.add(i);
        }
        prims.addAll(sets);
        return prims;
    }

    public static String columnize(List<Integer> prims, int a) {
        String ordered = "";

        for (int i = 0; i < prims.size(); i++) {
            if( (i + 1) % a != 0) {
                ordered += prims.get(i) + "\t";
            } else {
                ordered += prims.get(i) +"\n";
            }
        }

        return ordered;
    }
    public static void main(String[] args) {
        boolean prim = isPrim(7);
        System.out.println(prim); // => true

        List<Integer> prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]

        String output = columnize(prims, 3);
        System.out.println(output);
        // 2   3   5
        // 7   11  13
        // 17  19

        // Entspricht der Zeichenkette: "2\t3\t5\n7\t11\t13\n17\t19"
    }
}