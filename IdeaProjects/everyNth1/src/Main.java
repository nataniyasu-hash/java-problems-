/**
 * ## Zeichenketten verarbeiten mit `everyNth()`
 *
 * Entwickeln Sie nun bitte eine Methode `everyNth()`, die für eine Zeichenkette $s$
 * nur jedes n.te Zeichen zurück liefert.
 * Bei $n = 3$ sollen also nur die Zeichen 0, 3, 6, ... und so weiter zurückgegeben werden.
 * Fuer $n <= 0$ soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()-Methode`.
 *
 * __Hinweis:__
 *
 * - Achtung: Diese Aufgabe ist anfällig für Endlosschleifen.
 * - Erhalten Sie in VPL eine Out-of-Memory oder "getötet"-Fehlermeldung,
 *   haben Sie vermutlich eine Endlosschleife gebaut.
 *
 */
class Main {
    public static String everyNth(String word, int a) {
        if (a <= 0)
            return "\"\"";
        char[] buchtaben = word.toCharArray();
        String wort = "";
        for (int i = 0; i < buchtaben.length; i +=a) {
            wort = wort + buchtaben[i];
        }
        return wort;
    }

    public static void main(String[] args) {
        String result = everyNth("Miracle", 2);
        System.out.println(result); // => "Mrce"
        result = everyNth("Miracle", 0);
        System.out.println(result); // => ""
        System.out.println(everyNth("abcdefg", 2)); // => "aceg"
        System.out.println(everyNth("abcdefg", 3)); // => "adg"
    }
}