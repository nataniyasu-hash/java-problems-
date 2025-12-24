/**
 * ## `missingChar()``
 *
 * Entwickeln Sie bitte eine Methode `missingChar()`, die aus einer
 * Zeichenkette eine neue Zeichenkette erzeugt, in der das n-te Zeichen fehlt.
 *
 *
 * __Achtung:__
 * Der Wert von *n* muss nicht in der ursprünglichen Zeichenkette liegen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * Challenge: Versuchen Sie diese Aufgabe ohne Schleifen zu lösen.
 *
 * In der Vorlesung wurde erläutert, was Methoden sind und wie sie funktionieren.
 * Mit diesem Wissen können Sie ab sofort die Methodenköpfe selber ableiten.
 */
class Main {
    public static String missingChar(String word, int a) {
        String missingChar = "";
        if (a > word.length()) return word;
        char[] chars = word.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if ((i) != a) {
                missingChar += chars[i];
            }
        }
        return missingChar;
        }


    public static void main(String[] args) {
        String s = missingChar("Hello", 3);
        System.out.println(s); // => Helo
        System.out.println(missingChar("Hello", 1));  // => Hllo
        System.out.println(missingChar("Hello", 4));  // => Hell
        System.out.println(missingChar("Hello", -1)); // => Hello
        System.out.println(missingChar("Hello", 10)); // => Hello
    }
}