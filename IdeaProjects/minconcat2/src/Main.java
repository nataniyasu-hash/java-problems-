/**
 * ## Cats and Dogs
 *
 * Entwickeln Sie bitte eine Methode `catsDogs()`,
 * die prüft, ob in einer Zeichenkette gleich häufig
 * die Zeichenketten "cat" und "dog" vorkommen.
 *
 * Wenn weder "cat" noch "dog" vorkommen, ist dies als
 * nicht gleich häufig zu werten.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 * Challenge: Lösen Sie die Aufgabe ohne Schleifen.
 *
 */
class Main {
    public static boolean catsDogs(String a) {
        if (a.length() <= 3) return false;
        int rad = a.replaceAll("dog", "").length();
        int rac = a.replaceAll("cat", "").length();
        if (rad ==  rac) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean r = catsDogs("catdog");
        System.out.println(r); // => true
        System.out.println(catsDogs("catcat")); // => false
        System.out.println(catsDogs("1cat1cadodog")); // => true
    }
}
