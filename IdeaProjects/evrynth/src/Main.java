/**
 * ## Addieren mit der `luckySum()`
 *
 * Entwickeln Sie nun bitte eine Methode `luckySum()`, die eine
 * variable Anzahl von ganzzahligen Parametern solange aufaddiert bis
 * der Wert 13 in einem Parameter auftaucht.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal variable Parameter in Unit 2 (Methoden) an.
 *
 */
class Main {
    public static int luckySum(int ... zahlen) {
        int sum = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] != 13) {
                sum += zahlen[i];
            }
            if (zahlen[i] == 13) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = luckySum(5, 6, 13, 8);
        System.out.println(result); // => 11
        System.out.println(luckySum(1, 2, 3, 4, 5)); // => 15
        System.out.println(luckySum(1, 2)); // => 3
        System.out.println(luckySum(13)); // => 0
    }
}