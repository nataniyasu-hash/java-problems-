/**
 * ## Letzte Ziffer
 *
 * Entwickeln Sie nun bitte eine Methode `lastDigit()`, die
 * für zwei Zahlen (Dezimalnotation) prüft, ob diese dieselbe letzte Ziffer haben.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Der Modulo Operator % ist sicher hilfreich (siehe Unit 03, arithmetische Operatoren)
 * - Einen Betrag können Sie mittels `Math.abs()` bestimmen.
 *
 */
class Main {

    public static boolean lastDigit(int a, int b) {
        int first = a % 10;
        int sec = b % 10;
        if (first == sec ) return true;
        return false;
    }
    public static void main(String[] args) {
        boolean result = lastDigit(21, 12);
        System.out.println(result); // => false
        System.out.println(lastDigit(121, 2001)); // => true
    }
}