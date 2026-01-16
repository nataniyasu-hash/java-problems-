import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeMap;


/**
 * ## Shirts
 *
 * Gegeben sei die Klasse `Shirt`. Ein Shirt hat
 *
 * - eine Größe (XS, S, M, L, XL, etc.),
 * - und eine Farbe ("rot", "grün", "blau", "gelb", etc.).
 *
 * Wie `Shirt`s angelegt und ausgegeben werden können,
 * lässt sich den Beispielen in der `main()`-Methode entnehmen.
 * Es ist ferner eine Methode `factory()` gegeben, die eine Liste von
 * *n* zufälligen `Shirt`s erzeugen kann.
 *
 * 1. Ergänzen Sie die gegebene Klasse `Shirt` gem. Java-Konventionen so,
 *    dass Objekte, wie in der `main()`-Methode exemplarisch gezeigt,
 *    angelegt und ausgegeben werden können.
 * 2. Ergänzen Sie ferner gem. Java-Konventionen getter() Methoden,
 *    die es erlauben aus `Shirt`-Objekten Farbe (Color) und Größe (Size) auszulesen.
 * 3. Entwickeln Sie ferner eine Methode `countColors()`,
 *    die zählt, wie viele `Shirt`s einer Farbe in einer List von `Shirt`s vorkommen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static Map<String, Integer> countColors(List<Shirt> shirts) {
        Map<String, Integer> list = new TreeMap<>();
        for (int i = 0; i < shirts.size(); i++) {
            list.put(shirts.get(i).getColor(), list.getOrDefault(shirts.get(i).getColor(), 0) + 1);
        }
        return list;
    }

    // gegeben
    public static List<Shirt> factory(int n) {
        List<Shirt> shirts = new ArrayList<>();
        String[] sizes = {"XS", "S", "M", "L", "XL"};
        String[] colors = {"rot", "grün", "blau"};
        while (n-- > 0) {
            String s = sizes[(int)(Math.random() * sizes.length)];
            String c = colors[(int)(Math.random() * colors.length)];
            shirts.add(new Shirt(s, c));
        }
        return shirts;
    }

    public static void main(String[] args) {
        Shirt s1 = new Shirt("XS", "rot");
        Shirt s2 = new Shirt("L", "grün");

        System.out.println(s1); // => "rotes XS-Shirt"
        System.out.println(s2); // => "grünes L-Shirt"

        List<Shirt> shirts = factory(10);
        Map<String, Integer> colors = countColors(shirts);
        System.out.println(colors); // => z.B. {blau=1, gelb=3, grün=2, rot=1, schwarz=3}

    }
}