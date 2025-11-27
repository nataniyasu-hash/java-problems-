/**
 * ## Zeichenketten klammern
 *
 * Schreiben Sie eine Methode `embedCenter()`, die eine payload Zeichenkette in die
 * Mitte einer anderen Klammer-Zeichenkette setzt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie Sonderfälle wie leere Klammer und Payload Zeichenketten.
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html).
 * - `substring()`
 * - `length()`
 *
 */
class Main {

    public static String embedCenter(String embed, String payload) {
        int embedLength = embed.length();
        int middle = embedLength / 2;
        String beginn= embed.substring(0,middle);
        String ende = embed.substring(middle);
        //String payloadPosition = payload.substring(middle);
        return beginn + payload + ende;
    }

    public static void main(String[] args) {
        System.out.println(embedCenter("<<>>", "Yay")); // => <<Yay>>
        System.out.println(embedCenter("()", "Yay")); // => (Yay)
        System.out.println(embedCenter(":-)", "Example")); // :Example-)
    }
}

