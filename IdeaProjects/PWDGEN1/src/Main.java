/**
 * ## Ein Passwort-Generator
 *
 * Schreiben Sie nun bitte eine Methode `pwdgen()` zum Generieren von
 * Passwörtern.
 *
 * - Passwörter sollen dabei aus einem Satz gebildet werden.
 * - Worte in dem Satz sind durch ein oder mehrere  Leerzeichen voneinander
 *   getrennt.
 * - Für jedes Wort soll abwechselnd der erste oder letzte Buchstabe des
 *   Wortes genommen werden.
 * - Die Anzahl an Worten soll an den Anfang des Passworts gesetzt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die String-Methode `split()` ist sicher hilfreich.
 * - Beachten Sie, dass Sätze mit Leerzeichen beginnen oder enden können.
 *
 * __Achtung:__ Ab sofort werden keine Methodenköpfe mehr vorgegeben.
 * Diese aus der Problemformulierung zu bestimmen, ist Teil der Aufgabe.
 *
 */
class Main {

    public static String pwdgen(String s) {
        String [] word = s.split(" ");
        int length = word.length;
        String password= "";
        char alpha = ' ';
        for (int i= 0; i < length; i++) {
            if (i % 2 == 0) {
              alpha = word[i].charAt(0);
              password= password + alpha;
            }
            if (i % 2 != 0) {
                alpha= word[i].charAt(word[i].length() - 1);
                password= password + alpha;
            }
        }
        return length + password ;
    }
    public static void main(String[] args) {
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc
    }
}