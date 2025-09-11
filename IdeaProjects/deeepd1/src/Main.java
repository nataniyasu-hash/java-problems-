import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
List<Integer> zahlenliste = new ArrayList<>();
zahlenliste.add (3);
zahlenliste.add (2);
zahlenliste.add (5);
zahlenliste.add (6);

        System.out.println(zahlenliste);
        zahlenliste.set(1, 10);
        System.out.println(zahlenliste);
        zahlenliste.remove(2);
        System.out.println(zahlenliste);
        if (      zahlenliste.contains (2)){
            System.out.println(" true");
        }else {
            System.out.println("false");
        }
       int Zahlenliste =  zahlenliste.size();
        System.out.println(Zahlenliste);
for(int zahl: zahlenliste){
    System.out.println(zahl);

}
        int  summe = 0;
for (int zahl :zahlenliste){

    summe  += zahl ;
}
        System.out.println(summe);



    }
}