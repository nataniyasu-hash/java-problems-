/**
 * ## UML to Java (Drillaufgabe 2)
 *
 * Bitte setzen Sie das gegebene UML-Diagramm in Java-Code um.
 *
 * ![UML](../E - Objektorientierte Programmierung und UML/ex-05b-uml-2/uml.png)
 *
 * Ziel der Aufgabe ist es zu prüfen, wie gut und schnell Sie UML-Diagramme lesen
 * und zielsicher in Code übersetzen können. Es kommt dabei nur auf die Klassenstruktur
 * und nicht auf die Methodenimplementierungen an!
 *
 * Methoden mit Rückgaben können Sie also als reine "Dummy"-Methoden
 * implementieren. Z.B. so:
 *
 * ```Java
 *  public int foo() {
 *      return 42;
 *  }
 *  public String bar() {
 *      return null;
 *  }
 * ```
 *
 * __Achtung__:
 * Die Anzahl Ihrer Evaluationsversuche ist auf wenige Versuche limitiert.
 * Probieren Sie also nicht einfach nur herum, sondern gehen Sie
 * sehr systematisch, bspw. in folgenden Schritten, vor:
 *
 * 1. __Implementieren Sie Ihren Code__ erst mit allen Assoziationen, Datenfeldern
 *    und Methoden gem. UML-Diagramm. Nutzen Sie hierfür die Dateien, die
 *    gem. Java-Konventionen entsprechend benannt und für Sie vorbereitet sind.
 *    D.h. entwickeln Sie eine Klasse `X` auch in der entsprechend benannten Datei `X.java`.
 * 2. __Prüfen Sie dann mittels "Run"__ in der Console, ob sich Ihre Lösung kompilieren lässt.
 *    Korrigieren Sie ggf. Fehler gem. Compiler-Errors. Die `main()`-Methode ist
 *    dafür entsprechend vorbereitet.
 * 3. __Evaluieren Sie erst dann Ihren Code__ im Evaluator. Findet der Evaluator Fehler können
 *    Sie diese ggf. noch korrigieren. Achten Sie dabei darauf, wieviel Freiversuche Sie noch haben.
 *
 */
class Main {

    public static void main(String[] args) {
        System.out.println("Prüfen Sie mittels run, ob Ihre Klassen kompilierbar sind.");
        Misc m = new Exam();
        Foo f = new Foo();
        Bar b = new Exam();
        Exam e = new Exam();
        System.out.println("Das scheint zu funktionieren. Versuchen Sie zu evaluieren.");
    }
}
