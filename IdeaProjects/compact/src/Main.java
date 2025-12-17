import java.util.List;
import java.util.ArrayList;

/**
 * ## Liste von Blöcken aus Zeichenketten extrahieren
 *
 * Unter einem Block verstehen wir eine Folge gleicher Zeichen, z.B. “aaaa”. 
 * Blöcke mit mehr als einem Zeichen, können kompakt dargestellt werden, 
 * indem nur das Zeichen und die Wiederholung angegeben wird 
 * (die Kompaktschreibweise für “aaaa” wäre “a4”).
 * Blöcke der Länge 1 werden nicht in Kompaktschreibweise notiert 
 * (“a” wird also nie zu “a1”).
 *
 * Entwickeln Sie nun bitte eine Methode `compacts()`,
 * die aus einer beliebigen Zeichenkette eine Liste von Blöcken in
 * Kompaktschreibweise erzeugt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<String>  compacts(String word) {
        List<String> list = new ArrayList<>();
        char[] chars = word.toCharArray();
        if (chars.length == 0) return list;
        char first = chars[0]; // 1
        int count = 1;
        for (int  i = 1; i < chars.length; i++) {
            if (first == chars[i]) {
                count++;
            } else {
                if (count > 1) {
                    list.add(first + String.valueOf(count));

                }
                if (count <= 1) {
                    list.add(String.valueOf(first)); // 

                }

                count = 1;
                first = chars[i];
            }                               // fris= 0 char = 1 --> h mit e = h 
            //first = 1 char =2 " --> E MIT l = e
            // first = 2  char = 3 --> l mit l c = 2 --> l2
            // first = 3 char = 4 --> l mit o =

        }
        if (count > 1) {
            list.add(String.valueOf(first) + count);

        }
        if (count <= 1) {
            list.add(String.valueOf(first));
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> blocks = compacts("Hello");
        System.out.println(blocks); // => ["H", "e", "l2", "o"]
        System.out.println(compacts("Oooorder")); // => ["O", "o3", "r", "d", "e", "r"]
        System.out.println(compacts("C3PO")); // => ["C", "3", "P", "O"]
        System.out.println(compacts("...")); // => [".3"]
        System.out.println(compacts("")); // => []
    }
}
