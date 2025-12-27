import java.util.*;

/**
 * ## Armstrongzahlen gruppieren
 *
 * Entwickeln Sie nun bitte die Methoden
 *
 * - `armstrongs()`, die eine Liste aller aufsteigend sortierter
 *   Armstrongzahlen bis zu einer oberen Schranke erzeugt,
 * - und `groupyByLength()`, die eine Liste von Integer Werten mittels einer
 *   Map nach der Anzahl ihrer Stellen gruppiert. Die Map soll das Ordnungskriterium
 *   Stellenanzahl bei einer sequentiellen Verarbeitung der Schlüssel erhalten.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Sie haben bereits einmal eine Lösung entwickelt, die prüft, ob eine Zahl eine Armstrongzahl ist.
 * - Beachten Sie die Wahl ihrer Map-Implementierung.
 *
 */
class Main {
    public static boolean armstrong(int a ) {
        int zahl = a;
        int length = String.valueOf(a).length();
        int sum = 0;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            double potenz = Math.pow(ziffer, length);
            sum += potenz;
            zahl = zahl / 10;

        }
        if (sum == a ) return true;
        return false;
    }
    public static List<Integer> armstrongs(int a ) {
        List<Integer> armstrong = new ArrayList<>();
        Set<Integer>  sets = new TreeSet<>();
        for (int i = 0; i <= a; i ++) {
            if (armstrong(i)) sets.add(i);
        }
        armstrong.addAll(sets);

        return armstrong;
    }
    public static Map <Integer, List<Integer>> groupByLength(List<Integer> list) {
        Map<Integer, List<Integer>> grouped = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            grouped.put(String.valueOf(list.get(i)).length(), new ArrayList<>());
        }
        for (int i = 0; i < list.size(); i++) {
            grouped.get(String.valueOf(list.get(i)).length()).add(list.get(i));
        }
        return grouped;
    }

    public static void main(String[] args) {
        List<Integer> lance = armstrongs(500);
        System.out.println(lance);
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407]

        Map<Integer, List<Integer>> grouped = groupByLength(lance);
        System.out.println(grouped);
        // {1=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9], 3=[153, 370, 371, 407]}
    }
}