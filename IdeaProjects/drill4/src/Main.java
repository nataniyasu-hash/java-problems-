/**
 * ## UML to Java (Drillaufgabe 4)
 *
 * Bitte setzen Sie das gegebene UML-Diagramm in Java-Code um.
 *
 * ![UML](../E - Objektorientierte Programmierung und UML/ex-05h-uml-8/uml.png)
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
 *
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
 *    Sie diese ggf. noch korrigieren. Achten Sie dabei darauf, wieviele Freiversuche Sie noch haben.
 * 4. Beachten Sie, dass in Klassen zu implementierende Methoden abstrakter Basisklassen bzw.
 *    in zu implementierenden Schnittstellen definierte Methoden im UML-Diagramm nicht wiederholt
 *    angegeben werden (diese Erfordernisse sind aus dem UML-Diagramm durch Sie selber abzuleiten).
 *
 */
class Main {

    public static void main(String[] args) {
        System.out.println("Prüfen Sie mittels run, ob Ihre Klassen kompilierbar sind.");
        // Beachten Sie den ggf. erforderlichen Einsatz von super() in Konstruktoren
        // voneinander abgeleiteter Klassen.

        Teaching teacher = new Lecturer("Nane", "Kratzke");
        Student b = new EagerStudent("Max", "Musterfrau");
        LectureNote note = new LectureNote("Objekte haben einen Zustand");

        System.out.println("Scheint zu klappen. Versuchen Sie zu evaluieren.");

    }
}
