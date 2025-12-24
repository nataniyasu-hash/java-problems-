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
    public static String minConcat(String a , String b ) {
    int lengthA = a.length();
    int lengthB = b.length();
    String together = "";
    if (lengthA > lengthB) {
        String start = a.substring(lengthA - lengthB);
        String ende = start + b;
        together = ende;
    }
        if (lengthB > lengthA) {
            String start = b.substring(lengthB - lengthA);
            String ende =  a + start;
            together = ende;
        }
        return together;
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
