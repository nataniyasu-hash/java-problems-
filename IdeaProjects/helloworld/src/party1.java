import java.util.Scanner;
public class party1 {
    public static void main (String []args){
       Scanner scan = new Scanner(System.in);
       int guests;
        System.out.println( " Gib die Anzahl der Gästen an:");
        guests = scan.nextInt();

        while(true){
            System.out.println("X um in Gast anzumelden, -X um ein Gast abzumelden, 0 um das Programm zu beenden ");
            int value= scan.nextInt();
            if (value == 0){
                System.out.println(" es ist nicht möglich weitere Gäste an oder ab zumelden ");
                break;

            }
            if(value > 0){
                for(int i = 0; i< guests; i++){
                    System.out.println(" Ein Gast würde angemeldet ");
                    guests ++;
                    System.out.println(" Die Anzahl der Gästen ist jetzt "+ guests );
                }
            }
            if (value< 0){
                for (int i = 0; i>guests; i--){
                    System.out.println("Ein Gast wurde abgemeldet");
                    guests --;
                    System.out.println(" Die Anzahl der Gästen ist jetzt "+ guests );

                }
            }
        }



        }
    }


