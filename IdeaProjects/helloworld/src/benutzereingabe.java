import java.util.Scanner;
public class benutzereingabe {
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);

        String sentence;
        int x ;

        System.out.println ("Gib einen Zahl ein : ");

       // sentence= scan.nextLine();
        x= scan.nextInt();;
        System.out.println("Deinen Zahl lautet:"+ (x/3) );;
    }
}
