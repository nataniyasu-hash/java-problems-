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
        int count = 1;
        int max = 1;
        char temp = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (temp == text.charAt(i)) {
                count++;
                temp = text.charAt(i);
            } else {
                if (count > max) {
                    max = count;
                }
                temp = text.charAt(i);
                count = 1;
            }
        }

        return max;
        // Stimmt vermutlich selten!
    }

    public static void main(String[] args) {
        int block = maxBlockLength("abcXXXabc");
        System.out.println(block); // => 3
        System.out.println(maxBlockLength("xxxabyyyycd")); // => 4        
        System.out.println(maxBlockLength("abc")); // => 1
    }
}