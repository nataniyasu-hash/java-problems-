/**
 * ## Sortierung von Arrays prüfen
 *
 * Sie sollen nun eine Methode `scoresIncreasing()` entwickeln,
 * die für ein gegebenes Array prüft, ob alle Wert in diesem
 * Array aufsteigend sortiert sind oder das Array leer ist.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich Arrays in Unit 03 noch einmal an.
 *
 */
class Main {
    public static boolean scoresIncreasing(int[] array) {
        if (array.length == 0) return false;
    int temp = array[0];

    for (int i = 1; i < array.length; i++) {
        if (temp > array[i]) {
            return false;
        }
        temp = array[i];
    }
    return true;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 3, 4};

        boolean increasing = scoresIncreasing(d1);
        System.out.println(increasing); // => true

        int[] d2 = {1, 3, 2};
        System.out.println(scoresIncreasing(d2)); // => false

        int[] d3 = {1, 1, 4};
        System.out.println(scoresIncreasing(d3)); // => true

        int[] d4 = {1};
        System.out.println(scoresIncreasing(d4)); // => true
    }
}