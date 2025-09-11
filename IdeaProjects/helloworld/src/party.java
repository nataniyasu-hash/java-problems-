import java.util.Scanner;
public class party {
    public static void main(String []args) {
        int guests ;
        Scanner scan = new Scanner (System.in);
        boolean bool = true ;
 System.out.println ("Gib die Anzahl der Gästen an :");
 guests= scan.nextInt();
        System.out.println("Anzahl der Guesten "+guests);
        while (bool){
          System.out.println("Gib (1) um ein GAst anzumelden, ein (2) um ei GAst abzumelden. und (3) um das programm zu beenden");
          int value= scan.nextInt();
          if (value==1){
              guests ++;
          }
          if (value == 2){
              guests--;
          }
          if (value==3){
              bool = false;
              System.out.println("Anzahl der guesten "+guests);
          }

        }
    }

}
