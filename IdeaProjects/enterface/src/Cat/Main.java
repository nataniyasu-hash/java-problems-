//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Cat;
public class Main {
    public static void main(String[] args) {

Katzeinterface k = new Luci (18, " Luci ", "klettern");
Katzeinterface l = new Luis (19, "Luis",  "rechnen");

Katzeinterface  [] katze = {k , l};

for (Katzeinterface katzen : katze ){
    System.out.println(katze.getClass().toString());
    katzen.aufgaben();
    katzen.rechnen ();
}
    }
}



