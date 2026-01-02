import java.util.HashMap;
import java.util.Map;

/**
 * ## [Leetspeech](https://de.wikipedia.org/wiki/Leetspeak)
 *
 * Leetspeak (oder 1337) bezeichnet im Netzjargon das Ersetzen
 * von Buchstaben durch ähnlich aussehende Ziffern sowie
 * Sonderzeichen. Die häufige Schreibweise 1337 für Leetspeak
 * entstand aus dem englischen Wort "Elite". Es wurde dabei erst
 * zu Eleet verballhornt und dann zu 'leet abgekürzt, was im
 * Leetspeak als 1337 geschrieben wird.
 *
 * Es gibt vielfältige Leetspeak-Ersetzungen, z.B.:
 *
 *      A=4    B=8    E=3    G=6
 *      L=1    O=0    P=9    S=5
 *      T=7    Z=2
 *
 * A=4 bedeutet bspw., dass alle Vorkommen von 'a' oder 'A'
 * durch die Ziffer 4 in einer Zeichenkette zu ersetzen wären,
 * den 4 sieht ähnlich aus wie A.
 *
 * Mit der obigen Ersetzung würde "Hello World" zu "H3110 W0r1d".
 *
 * Entwickeln Sie nun bitte die folgenden Methoden für eine
 * effiziente Leetspeech-Verarbeitung:
 *
 * - `replacings()` soll Leetspeech-Ersetzungen aus einer
 *   Komma-separierten Zeichenkette erzeugen.
 * - Mit der Methode `leetspech()` sollen Leetspeech Ersetzungen
 *   dann auf Zeichenketten angewendet werden können.
 *
 * Aufrufbeispiele für beide Methoden finden Sie in der
 * `main()`-Methode. Aus diesen können Sie die Wirkungsweise
 * ableiten und generalisieren.
 *
 * __Hinweise:__
 *
 * - Die `split()`-Methode der Klasse `String` kann hilfreich sein.
 *
 */
class Main {
    public static Map<Character, String> replacings(String words) {
        Map<Character, String> mapping = new HashMap<>();
        String[] wort = words.split(",");

        for (int i = 0; i < wort.length; i++) {
            String[] array = wort[i].split("=");
            mapping.put(Character.toLowerCase(array[0].charAt(0)), array[1]);
            mapping.put(Character.toUpperCase(array[0].charAt(0)), array[1]);

        }

        return mapping;
    }
    public static String leetspeech(String word, Map<Character,String> mapping) {
        String translated = "";
        for (int i = 0; i < word.length(); i++) {
            if(mapping.containsKey(word.charAt(i))) {
                translated += mapping.get(word.charAt(i));
            } else {
                translated += word.charAt(i);
            }
        }

        return translated;
    }

    // Bitte geben Sie hier die replacings() Methode an:


    // Bitte geben Sie hier die leetspeech() Methode an:


    public static void main(String[] args) {

        // Mit der Methode replacings() sollen Leetspeech-
        // Ersetzungen aus Komma-separierten Zeichenketten
        // erzeugt werden können.
        Map<Character, String> mappings = replacings(
                "A=4,B=8,E=3,G=6,L=1,O=0,S=5,T=7,Z=2,"
        );
        System.out.println(mappings);
        /* Dies erzeugt folgende Mappingausgabe auf der Konsole
           (ohne Zeilenumbruch):
        {A=4, B=8, E=3, G=6, L=1, O=0, S=5, T=7, Z=2,
         a=4, b=8, e=3, g=6, l=1, o=0, s=5, t=7, z=2}
        */

        // Die Methode leetspeech() soll diese Ersetzungen
        // dann auf Zeichenketten anwenden.
        String leet = leetspeech("Elite speech", mappings);
        System.out.println(leet);
        // => 31i73 5p33ch
        System.out.println(leetspeech("Berlin", replacings("B=8,l=1")));
        // => 8er1in
        System.out.println(leetspeech("Wow", replacings("w=VV,O=0")));
        // => VV0VV
    }
}