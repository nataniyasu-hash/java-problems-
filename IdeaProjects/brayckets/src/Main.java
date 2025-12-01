/**
 * ## checkBrackets()
 *
 * Eine vollständige Klammerung bedeutet: Jeder geöffneten Klammer
 * muss eine schließende Klammer folgen. Darüber hinaus müssen
 * die runden Klammern korrekt verschachtelt sein. Andere Zeichen
 * sind zu ignorieren.
 *
 * Schreiben Sie nun eine Methode `checkBrackets()`, die prüft, ob eine
 * Zeichenkette den oben angegebenenen Regeln einer vollständigen
 * Klammerung entspricht oder nicht.
 *
 */
public class Main {
    public static boolean checkBrackets(String a) {
    char[] chars = a.toCharArray();
    int count = 0;  // für (
    int counter= 0; // für )
    int ausgegliechen = 0;

    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '(') {
            count++;
            ausgegliechen++;
        }


        else if (chars[i] == ')') {
            counter++;
            ausgegliechen--;
        }

    }
    if (counter == count && ausgegliechen == 0) return true ;
    return false;
    }


    public static void main(String[] args) {

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true

        System.out.println(checkBrackets("(()")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false
    }
}