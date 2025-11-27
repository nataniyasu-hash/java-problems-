/**
 * ## Tripple in Zeichenketten finden
 *
 * Entwickeln Sie nun bitte eine Methode `noMultiples()`, die prüft, ob in
 * einer Zeichenkette niemals drei (oder mehr) gleiche Zeichen aufeinander
 * folgen.
 *
 * Verallgemeinern Sie `noMultiples()` nun so,
 * dass die Anzahl der zu wiederholenden Zeichen parametrisiert ist.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal überladene Methoden in Unit 2 (Methoden) an.
 *
 */
class Main {
    public static boolean noMultiples(String s) {
        char[] zeichnen = s.toCharArray();
        int counter = 1;
        for (int i = 0; i < zeichnen.length - 1; i++) {
            if (zeichnen[i] == zeichnen[i + 1]) {
                counter++;
            } else {
            counter = 1;
            }
            if (counter == 3)
                return false;
        }

        return true;
    }
    public static boolean noMultiples(int a,String s) {
        char[] zeichnen = s.toCharArray();
        int counter = 1;
        for (int i = 0; i < zeichnen.length - 1; i++) {
            if (zeichnen[i] == zeichnen[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter == a)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        boolean result = noMultiples("Hello World");
        System.out.println(result); // => true
        System.out.println(noMultiples("faaantastic")); // => false
        System.out.println(noMultiples(2, "Hello World")); // => false
    }
}