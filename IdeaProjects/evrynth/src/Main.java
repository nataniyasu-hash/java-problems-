import java.util.ArrayList;
import java.util.List;

/**
 * ## Blöcke in Zeichenketten bestimmen.
 *
 * Entwickeln Sie nun bitte eine Methode `blocks()`,
 * um in einem String alle Blöcke gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {
    public static List<String> blocks(String words) {
        List<String> list = new ArrayList<>();
        if (words.length() == 0) return list;
        int count = 1;
        char temp = words.charAt(0);
        for (int i = 1; i < words.length(); i++) {
            if (words.charAt(i) == temp) {
                count++;
                temp = words.charAt(i);
            } else {
                if (count >= 2) {
                    String ekub = String.valueOf(temp).repeat(count);
                    list.add(ekub);
                }
                count = 1;
                temp = words.charAt(i);
            }

        }
        if (count >= 2) {
            String ekub = String.valueOf(temp).repeat(count);
            list.add(ekub);
        }


        return list;

    }


        public static void main (String[]args){
            List<String> blocks = blocks("Hello faaantastic world");
            System.out.println(blocks); // => ["ll", "aaa"]
            System.out.println(blocks("aaabccdeeeefaaa")); // => ["aaa", "cc", "eeee", "aaa"]
            System.out.println(blocks("This is an example")); // => []
            System.out.println(blocks("Another  example ...")); // => ["  ", "..."]
            System.out.println(blocks("")); // => []
        }
    }


