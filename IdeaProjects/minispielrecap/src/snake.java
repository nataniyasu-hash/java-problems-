import java.awt.*;
import java.util.Scanner;
public class snake {
    public static void main(String[] args) {

        // Charaktere erstellen
         Point playerposi = new Point (4,9);
        Point snakeposi = new Point (5,9);
        Point goldposi = new Point (6,9);
        Point türposi = new Point (7,9);
boolean weiter = true ;
        // Feld erstellen
while (weiter) {
    for (int y = 0; y < 10; y++) {
        for (int x = 0; x < 40; x++) {
            System.out.print(".");
            Point p = new Point(x, y);
            if (p.equals(playerposi))
                System.out.print("P");
            if (p.equals(snakeposi))
                System.out.print("S");
            if (p.equals(goldposi))
                System.out.print("G");
            if (p.equals(türposi))
                System.out.print("T");
        }
        System.out.println("");
    }
    moveplayer(playerposi);
    movesnake (snakeposi,playerposi);

}


    }
    public static void movesnake(Point snakeposi, Point playerposi){
        if (playerposi.y < snakeposi.y)
            snakeposi.y--;
        if (playerposi.y > snakeposi.y)
            snakeposi.y++;
        if (playerposi.x < snakeposi.x)
            snakeposi.x--;
        if (playerposi.x > snakeposi.x)
            snakeposi.x++;

    }
    public static void moveplayer(Point playerposi) {
        Scanner scan = new Scanner (System.in);
        String eingabe = scan.next();

        if (eingabe.equals("w"))
            playerposi.y--;
        if (eingabe.equals("s"))
            playerposi.y++;
        if (eingabe.equals("a"))
            playerposi.x--;
        if (eingabe.equals("d"))
            playerposi.x++;

    }
}