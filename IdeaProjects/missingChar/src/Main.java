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
    public static String missingChar(String a, int b) {
        int length = a.length();
        if (b > length || b < 0)
            return a;
        String w = a.substring(0,b) + a.substring(b + 1);
        return w;
    }

    public static void main(String[] args) {
        String s = missingChar("Hello", 3);
        System.out.println(s); // => Helo
        System.out.println(missingChar("Hello", 1));  // => Hllo
        System.out.println(missingChar("Hello", 4));  // => Hell
        System.out.println(missingChar("Hello", -1)); // => Hello
        System.out.println(missingChar("Hello", 10)); // => Hello
        System.out.println(missingChar("Hello", 0));
    }
}