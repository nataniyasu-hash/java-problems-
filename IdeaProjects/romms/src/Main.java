/**
 * ## Zeichenketten "rotieren"
 *
 * Entwickeln Sie nun bitte eine Methode `rotate()`, die eine Zeichenkette
 * nach links oder rechts "rotiert". Zeichen die links oder rechts aus
 * der Zeichenkette "geschoben" werden, sollen rechts bzw. links wieder
 * "hineingeschoben" werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie, dass eine Rotation positiv und negativ sein kann.
 * - Beachten Sie, dass eine Rotation länger als die eigentliche Zeichenkette sein kann.
 * - Das Problem lässt sich tatsächlich ohne Schleife lösen (sicherlich aber auch mit ;-).
 *
 */
class Main {

    public static String rotate(int n, String s) {
        String rotated = "";
        int length = s.length();
        n %= length; // große zahl auf vielfach reduzieren.
        if (n < 0) n += length;

        rotated = s.substring(length - n) + s.substring(0, n);

        return rotated;
    }

    public static void main(String[] args) {
        String result = rotate(2, "Hello");
        System.out.println(result); // => "loHel"
        System.out.println(rotate(3, "Hello")); // => "lloHe"
        System.out.println(rotate(6, "Hello")); // => "oHell"
    }
}