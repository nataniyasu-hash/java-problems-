/**
 * ## Vorkommen von Zeichenketten zählen
 *
 * Schreiben Sie nun eine Methode `countOccurences()` die zählt, wie häufig eine Zeichenkette *a* in einer
 * anderen Zeichenkette *b* vorkommt. Sich überlagernde Zeichenketten sind erlaubt.
 * D.h. "xx" ist als zweimal in "xxx" vorhanden zu zählen.
 * Leere Zeichenketten sind nicht zu zählen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - In der Vorlesung wurde erläutert, was Methoden sind und wie sie funktionieren.
 *   Mit diesem Wissen können Sie ab sofort die Methodenköpfe selber ableiten.
 * - Beachten Sie, dass leere Zeichenketten schnell eine Endlosschleife erzeugen können.
 * - Liefert VPL eine Out-of-Memory Fehlermeldung ist dies vermutlich auf eine
 *   Endlosschleife zurückzuführen.
 * - Die String-Methoden `indexOf()` oder `startsWith()` könnten hilfreich sein.
 *
 */
class Main {
    public static int countOccurences (String a, String b) {
        if (b.isEmpty())
            return 0;
        if (a.isEmpty())
            return 0;
     int count = 0;
    for (int i= 0; i<b.length(); i++)
        if (b.startsWith(a,i)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2
    }
}