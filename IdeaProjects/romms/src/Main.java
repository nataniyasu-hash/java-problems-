import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * ## `zeroMax()`
 *
 * Entwickeln Sie nun bitte eine Methode `zeroMax()`, die ein Integer Array aus
 * einer übergebenen Liste von Integer Werten erzeugt, bei der jeder Nullwert
 * (0, also nicht null!!!)
 * in der Liste durch den größten positiven Wert rechts von der Null ersetzt wird.
 * Wenn es rechts von der Null keinen größten positiven Wert gibt, wird die Null
 * als Null belassen.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 * Hinweis: Wenn Ihnen der Datentyp List (noch) nichts sagt, fragen Sie KIRA
 * was das für ein Datentyp ist und wie man mit diesem umgeht.
 *
 */
public class Main {
    public static int[] zeroMax(List<Integer> list) {
        int[] zeroMax = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i) != 0) {
                zeroMax[i] = list.get(i);
            }
            if (list.get(i) == 0) {
                int max = 0;
                int temp= 0;

                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) != 0) {
                         temp = list.get(j);
                    }
                    if (temp > max ) {
                        max = temp;
                    }
                }
                zeroMax[i] = max;
            }
        }
        return zeroMax;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 5, 0, 3);
        int[] result = zeroMax(list);
        System.out.println(Arrays.toString(result));        // => [5, 5, 3, 3]

        list = Arrays.asList(0, 4, 0, 3);
        System.out.println(Arrays.toString(zeroMax(list))); // => [4, 4, 3, 3]

        list = Arrays.asList(0, 1, 0);
        System.out.println(Arrays.toString(zeroMax(list)));  // => [1, 1, 0]
    }
}