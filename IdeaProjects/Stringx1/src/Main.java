/**
 * ## Verflixtes Zeichenketten formatieren mit `stringX()`
 *
 * Entwickeln Sie nun bitte eine Methode `stringX()`, die
 * alle 'x' aus einer Zeichenkette entfernt, es sei denn sie stehen am Anfang oder
 * am Ende der Zeichenkette.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * Hinweise:
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `replaceAll()`
 *
 */
class Main {

    public static String stringX(String s) {
        int length = s.length();
        char beginn = s.charAt(0);
        char ende = s.charAt(length - 1);
        String ohneX = s.replaceAll("x","").trim();
        if (beginn == 'x' && ende == 'x')
            return "x" + ohneX + "x";
        if (beginn == 'x') {
            return "x"+ohneX;
        }
        if (ende == 'x') {
            return  ohneX + "x";
        } else {
            return ohneX;
        }
    }

    public static void main(String[] args) {
        String result = stringX("xxHix");
        System.out.println(result); // => xHix

        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx
    }
}