import java.util.List;
import java.util.Map;
import java.util.Arrays;

/**
 * ## Würfeln
 *
 * Entwickeln Sie nun bitte eine Klasse `Dice`,
 * die einen Würfel und dessen zufälliges Würfelverhalten
 * abbilden soll. Ein Würfel kann 6 Zustände einnehmen:
 * W1, W2, W3, W4, W5 und W6 (diese Zustände sollen als
 * Strings ausgedrückt werden).
 *
 * Diese Zustände sind statistisch gleichverteilt.
 *
 * In der `main()`-Methode finden Sie Beispiele,
 * wie Würfelobjekte zufällig und nicht zufällig
 * angelegt und auf der Konsole ausgegeben werden können
 * sollen.
 *
 * Um den Zufallsgenerator zu prüfen, sollen Sie zusätzlich
 * auswerten, wie häufig für eine Liste von Würfelobjekten
 * eine Zahl gewürfelt worden ist. Entwickeln Sie hierfür
 * eine Methode `evaluate()`. In der `main()`-Methode finden
 * Sie, wie `evaluate()` aufgerufen werden können soll.
 *
 * __Hinweise:__
 *
 * - Mittels `Math.random()` können Sie eine gleichverteilte
 *   Zufallszahl im Bereich von [0.0, 1.0[ bestimmen.
 *
 */
class Main {

    public static void main(String[] args) {

        // Konstruktor ohne Parameter: Zahl wird per Zufall bestimmt
        Dice wuerfel = new Dice();
        System.out.println(wuerfel); // => W4 (oder W1, W2, W3, W5, W6)

        // Konstruktor mit einem Parameter: Zahl wird per Parameter gesetzt
        wuerfel = new Dice(3);
        System.out.println(wuerfel); // => W3

        List<Dice> zufallswuerfe = Arrays.asList(
                new Dice(), new Dice(), new Dice(),
                new Dice(), new Dice(), new Dice()
        );
        System.out.println(zufallswuerfe);
        // z.B. => [W4, W6, W4, W3, W2, W5] 
        // (oder andere zufällige Folge)

        List<Dice> schummelwuerfe = Arrays.asList(
                new Dice(1), new Dice(2), new Dice(3),
                new Dice(4), new Dice(5), new Dice(6)
        );
        System.out.println(schummelwuerfe);
        // [W1, W2, W3, W4, W5, W6]

        // Zählen der Häufigkeit von Würfelzuständen
        Map<String, Integer> auswertung = Dice.evaluate(zufallswuerfe);
        System.out.println(auswertung);
        // => z.B. {W2=1, W3=1, W4=2, W6=1}
        // (oder andere zufällige Häufigkeit)
        System.out.println(Dice.evaluate(schummelwuerfe));
        // => {W1=1, W2=1, W3=1, W4=1, W5=1, W6=1}
    }
}
