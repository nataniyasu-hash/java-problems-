/**
 *
 *  ## Zeichenketten aneinander hängen
 *
 * Entwickeln Sie bitte eine Methode `minConcat()`,
 * die zwei Zeichenketten unterschiedlicher Länge
 * aneinander hängt. Dabei soll die längere der
 * beiden Zeichenketten auf die Länge der kürzeren
 * Zeichenkette so gekürzt werden, dass die ersten
 * Zeichen der Zeichenkette nicht in das Resultat
 * übernommen werden.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static String minConcat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength ) {
            String aLenger = a.substring(aLength - bLength) + b;
            return aLenger;
        }
        if (bLength > aLength) {
            String bLenger = a + b.substring(bLength - aLength);
            return bLenger;
        }
        return a + b;
    }

    public static void main(String[] args) {

        String resultat = minConcat("Hello", "Hi");
        System.out.println(resultat); // => "loHi"

        System.out.println(minConcat("Hello", "java"));
        // => "ellojava"
        System.out.println(minConcat("java", "Hello"));
        // => "javaello"
    }
}
