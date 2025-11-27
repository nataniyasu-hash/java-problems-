/**
 * ## Bestimme die Länge des längsten Blocks
 *
 * Unter einem Block verstehen wir mehrere aufeinander folgende gleiche Zeichen
 * in einer Zeichenkette (z.B. "aaa" in "xaaax" oder "bb" in "abbcde").
 *
 * Entwickeln Sie bitte eine Methode `maxBlockLength()`, die in einer
 * beliebigen Zeichenkette, die Länge des längsten Blocks bestimmt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
public class Main {

    public static int maxBlockLength(String text) {
        char [] zeichnen = text.toCharArray();
        if (text.isEmpty())
            return 0;
        int count = 1;
        int max = 1;
        for (int i= 0; i< zeichnen.length - 1; i++) {
            if (zeichnen[i] == zeichnen[i+1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
            max = count;
            }
            }
        return max; // Stimmt vermutlich selten!
    }

    public static void main(String[] args) {
        int block = maxBlockLength("abcXXXabc");
        System.out.println(block); // => 3
        System.out.println(maxBlockLength("xxxabyyyycd")); // => 4
        System.out.println(maxBlockLength("abc")); // => 1
    }
}