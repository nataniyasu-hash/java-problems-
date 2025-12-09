import java.util.*;
class Main {
    public static boolean isPrim(int a) {
        if (a <= 1) return false;
        int count = 0;
        int counter = 1;

        for (int i = 1; i < 10; i++) {
            if (a < 10 && a % i == 0) {
                count++;
            }
            if (a >= 10 && a % i == 0) {
                counter++;
            }
        }
        if (count > 2 ) return false;
        if (counter > 2) return false;
        return true;
    }
    public static List<Integer> primsUntil(int a) {
        Set<Integer> pr = new TreeSet<>();
        List<Integer> prim = new ArrayList<>();
        if (a < 1) return prim;

        for (int i = 1; i < a; i++) {
            if (isPrim(i)) {
                pr.add(i);
            }
        }
        prim.addAll(pr);
        return prim;
    }
    public static String columnize(List<Integer> list, int a) {
    String ergeb = " ";
    int count = 0;

    for (int i = 0; i < list.size(); i++) {
        ergeb += list.get(i);
        count++;

        if (count == a) {
            ergeb += "\n";
            count = 0;
        } else {
            ergeb += "\t";
        }
    }
    return ergeb.trim();
    }

    public static void main(String[] args) {
        boolean prim = isPrim(7);
        System.out.println(prim);
        List<Integer> prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]
        String output = columnize(prims, 3);
        System.out.println(output);
        // 2   3   5
        // 7   11  13
        // 17  19

        // Entspricht der Zeichenkette: "2\t3\t5\n7\t11\t13\n17\t19"
    }
}