import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * ## Listen nach geraden und ungeraden Zahlen ordnen
 *
 * Entwickeln Sie nun bitte eine Methode namens `evenOdd()`,
 * die eine Liste auf Basis einer bestehenden Liste von Integern erzeugt.
 *
 * - In der neuen Liste müssen erst alle geraden Werte der ursprünglichen Liste
 *   stehen, erst dann sollen die ungeraden Werte folgen.
 * - Die Reihenfolge der ursprünglichen Liste soll innerhalb der geraden und ungeraden
 *   Werte aber erhalten bleiben.
 *
 * Aufrufbeispiele finden sich in der `main()`-Methode.
 *
 */
class Main {
    public static List<Integer> evenOdd(List<Integer> zahlen) {
        if (zahlen.isEmpty())
            return zahlen;
       List <Integer> even = new ArrayList<>();
       List <Integer> odd = new ArrayList<>();
       List <Integer> zusammen = new ArrayList<>();

        for (int i = 0; i < zahlen.size(); i++) {
            if(zahlen.get(i) % 2 == 0) {
                 even.add(zahlen.get(i));
            }
            if (zahlen.get(i) % 2 != 0 ) {
                odd.add(zahlen.get(i));
            }
        }
       zusammen.addAll(even);
        zusammen.addAll(odd);
        return zusammen;

    }

    public static void main(String[] args) {
        List<Integer> result = evenOdd(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(result); // => [2, 4, 6, 1, 3, 5]
        System.out.println(evenOdd(Arrays.asList(5, 1, 3))); // => [5, 1, 3]
        System.out.println(evenOdd(Arrays.asList(4, 2, 6))); // => [4, 2, 6]
    }
}