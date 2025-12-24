/**
 * ## Selbstteilende Zahlen
 *
 * Entwickeln Sie nun bitte eine Methode `dividesSelf()`, die prüft,
 * ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend, wenn
 * alle ihre Stellen die Zahl ganzzahlig teilt.
 *
 * Da durch den Wert 0 bekanntlich nicht geteilt werden kann, können alle
 * Zahlen mit einer Nullziffer (Dezimalnotation) nicht sich selbstteilend
 * sein.
 *
 * z.B.: 128 = 128 % 1 == 0 && 128 % 2 == 0 && 128 % 8 == 0
 *
 * Entwickeln Sie zusätzlich eine Methode `countDividesSelf()` die
 * angibt, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen
 * Schranke gibt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Mittels % 10 können Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 können Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 * - In der Vorlesung wurde erläutert, was Methoden sind und wie sie funktionieren.
 *   Mit diesem Wissen können Sie ab sofort die Methodenköpfe selber ableiten.
 */
class Main {
    public static boolean dividesSelf(int a ) {
        if (String.valueOf(a).contains("0")) return false;
        int zahl = a;
        while (zahl > 0) {
            int ziffer;
            ziffer = zahl % 10;
            if (a % ziffer != 0) return false;
            zahl /= 10;

        }
        return true;
        }
    public static int countDividesSelf(int a) {
        int count = 0;
        for (int i = 0; i <= a; i++) {
        if (dividesSelf(i)) {
            count++;
        }
        }
        return count;
        }


    public static void main(String[] args) {

        boolean result = dividesSelf(128);
        System.out.println(result); // => true
        System.out.println(dividesSelf(12)); // => true
        System.out.println(dividesSelf(102)); // => false

         int n = countDividesSelf(10);
        System.out.println(n); // => 9
        System.out.println(countDividesSelf(100)); // => 23
        System.out.println(countDividesSelf(1000)); // => 79
   }
}