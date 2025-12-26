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
    public static boolean checkBrackets(String zeichnen) {
        String brackets = "";
        for (int i = 0; i < zeichnen.length(); i++) {
            if (zeichnen.charAt(i) == '(' || zeichnen.charAt(i) == ')')
                brackets += zeichnen.charAt(i);
        }
        if (brackets.startsWith(")")) return false;
        if (brackets.endsWith("(")) return false;

        int counter = 0;
        for (int j = 0; j < brackets.length(); j++) {
            if (brackets.charAt(j) == '(')
                counter++;
            if (brackets.charAt(j) == ')') counter--;
            if (counter < 0) return false;
        }
        if (counter < 0 || counter > 0) return false;
        return true;
    }


    public static void main(String[] args) {

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true

        System.out.println(checkBrackets("(()")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false
    }
}