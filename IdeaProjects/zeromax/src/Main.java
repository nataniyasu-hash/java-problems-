import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static int[]  zeroMax(List<Integer> liste) {
        int[] ergebnis = new int[liste.size()];
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == 0) {
                int max = 0;
                for (int j = i + 1; j < liste.size(); j++) {
                    if (liste.get(j) > max) {
                        max = liste.get(j);
                    }
                }
                ergebnis[i] = max;
            } else {
                ergebnis[i] = liste.get(i);
            }
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 5, 0, 3);
        int[] result = zeroMax(list);
        System.out.println(Arrays.toString(result));        // => [5, 5, 3, 3]

        list = Arrays.asList(0, 4, 0, 3);
        System.out.println(Arrays.toString(zeroMax(list))); // => [4, 4, 3, 3]

        list = Arrays.asList(0, 1, 0);
        System.out.println(Arrays.toString(zeroMax(list)));  // => [1, 1, 0]
    }
}