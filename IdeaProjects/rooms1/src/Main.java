/**
 * ## Räume
 *
 * Sie sollen nun eine Klasse anlegen, mit denen man
 * Räume verwalten kann, die dem Benennungsschema
 * der TH Lübeck entsprechen.
 *
 * Ein Raum liegt
 *
 * - in einem Gebäude,
 * - auf einer Etage
 * - und hat eine Raumnummer (< 100).
 *
 * Wie Räume angelegt und ausgegeben werden können,
 * lässt sich den Beispielen in der `main()`-Methode entnehmen.
 *
 * Ergänzend sollen Räume noch gem. Java Konventionen
 * inhaltlich verglichen und geklont werden können.
 *
 *
 * __Hinweise:__
 *
 * - Sehen Sie sich die relevanten Punkte in Unit 03 noch einmal an.
 * - Sehen Sie sich nochmal `String.format()` in Unit 01 an.
 *
 */
class Main {

    public static void main(String[] args) {
        Rooms office = new Rooms(17, 0, 10);
        Rooms lecture = new Rooms(2, 0, 10);
        Rooms lab = new Rooms(18, 1, 1);

        System.out.println(office);  // => "17-0.10"
        System.out.println(lecture); // => " 2-0.10"
        System.out.println(lab);     // => "18-1.01"
    }
}