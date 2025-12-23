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
        if (text.length() == 0 ) return 0;
        int count = 1;
        char[] chars = text.toCharArray();
        char temp = chars[0];
        int max = 0;

        for (int i = 1; i < chars.length; i++) {
            if(temp == chars[i]) {
                count++;
                temp = chars[i];
                max = count;
            } else {
                count= 1;
                temp = chars[i];
            }

        }
        if (max == 0) return count;
            return max;  // Stimmt vermutlich selten!
    }

    public static void main(String[] args) {
        int block = maxBlockLength("abcXXXabc");
        System.out.println(block); // => 3
        System.out.println(maxBlockLength("xxxabyyyycd")); // => 4
        System.out.println(maxBlockLength("abc")); // => 1
    }
}