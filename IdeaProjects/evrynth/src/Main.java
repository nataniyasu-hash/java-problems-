/**
 * ## Aufsteigend sortierte Tripple finden
 *
 * Schreiben Sie nun bitte eine Methode `trippleUp()`
 * die in einem Integer-Array prüft, ob dieses
 * drei aufsteigende, benachbarte Werte wie bspw. 1, 2, 3,
 * oder auch 24, 25, 26 beinhaltet.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static boolean trippleUp(int[] array) {
        int count = 1;
        int erste = array[0];
        for (int i = 1; i < array.length; i++) {
            if(erste + 1 == array[i]) {
                count++;
                erste = array[i];
            } else {
                if (count >= 3) return true;
                if(count < 3) {
                    count = 1;
                    erste = array[i];
                }
            }
        }
        if (count >= 3 ) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 5, 6, 2};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 4};
        int[] a4 = {3, 2, 1};

        System.out.println(trippleUp(a1)); // => true
        System.out.println(trippleUp(a2)); // => true
        System.out.println(trippleUp(a3)); // => false
        System.out.println(trippleUp(a4)); // => false
    }
}