import java.util.ArrayList;
import java.util.List;

/**
 * ## Dezimalzahlen in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun bitte eine Methode `numbers()`,
 * um in einem String alle Dezimalzahlen zu bestimmen
 * und diese als Liste von Integer Werten zurückzugeben.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die Java-Methode `boolean Character.isDigit(char)` prüft,
 *   ob ein Zeichen eine Ziffer ('0', '1', .. '9') ist.
 * - Die Java-Methode `int Integer.parseInt(String)` konvertiert eine
 *   Zeichenkette in einen `int`-Wert (z.B. "101" -> 101).
 */
class Main {
    public static List<Integer> numbers(String zeichnen) {
       List<Integer> numbers = new ArrayList<>();
       int i = 0;

       while (i < zeichnen.length()) {
           if (Character.isDigit(zeichnen.charAt(i))) {
               int start = i;
               while ( i < zeichnen.length() && Character.isDigit(zeichnen.charAt(i))) {
                   i++;
               }
               String ekub = zeichnen.substring(start, i);
               numbers.add(Integer.parseInt(ekub));
           }
           i++;
       }
       return numbers;

    }

    public static void main(String[] args) {
        List<Integer> values = numbers("This is 1 world");
        System.out.println(values); // => [1]
        System.out.println(numbers("no numbers")); // => []
        System.out.println(numbers("1 12 123 1234")); // => [1, 12, 123, 1234]
        System.out.println(numbers("ab1c23ef45gh")); // => [1, 23, 45]
    }
}
