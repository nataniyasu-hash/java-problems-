import java.awt.Point;
import java.util.Scanner;

public class snake {
    public static void main (String [] args) {

        // objekte erstellen
        
        Point snakeposition = new Point(5, 7);
        Point spielerposition = new Point(1, 1);
        Point goldposition = new Point(1, 7);
        Point Tuerposition = new Point(1, 9);
boolean weiter = true;

        // Spielfeld erstellen 10*40

        while (weiter) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 40; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(spielerposition))
                        System.out.print("p");
                    else if (p.equals(snakeposition))
                        System.out.print("S");
                    else if (p.equals(goldposition))
                        System.out.print("G");
                    else if (p.equals(Tuerposition))
                        System.out.print("T");
                    else System.out.print(".");

                }
                System.out.println("");
            }
            if (spielerposition.equals(goldposition)){
                System.out.println("Gold eingesammelt");
                goldposition = new Point (-1,-1);
            }
            if (spielerposition.equals(snakeposition)){
                weiter= false;
                System.out.println("Du hast verloren");
            }
            if (spielerposition.equals(Tuerposition)){
                weiter= false;
                System.out.println("Yo have won the game!!");
            }
            Bewegespieler(spielerposition);
            decreasesnakeposition (snakeposition, spielerposition);


        }
    }
    public static void decreasesnakeposition(Point snakeposition, Point spielerposition){
        if (snakeposition.x < spielerposition.x)
snakeposition.x--;
        else if (snakeposition.x> spielerposition.x)
        snakeposition.x++;
        if (snakeposition.y < spielerposition.y)
            snakeposition.y--;
        else if (snakeposition.y> spielerposition.y)
            snakeposition.y++;
    }


public static void Bewegespieler(Point spielerposition) {
    Scanner scan = new Scanner(System.in);
    String eingabe = scan.next();

    // Spieler bewegungsmöglichkeiten  w,s,a,d
    if (eingabe.equals("w")) {
        if (spielerposition.y > 0)
            spielerposition.y--;
    } else if (eingabe.equals("s")) {
        if (spielerposition.y < 9)
            spielerposition.y++;
    } else if (spielerposition.equals("a")) {
        if (spielerposition.x < 39)
            spielerposition.x--;
    } else if (spielerposition.equals("d")) {
        if (spielerposition.x > 0)
            spielerposition.x++;
    }
}
}


