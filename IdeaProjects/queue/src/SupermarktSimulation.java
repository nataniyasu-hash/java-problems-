
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SupermarktSimulation  {
    public static void SupermarktSimulation(String[] args) {
        SupermarktSimulation supermarkt = new SupermarktSimulation ();

Queue<String> warteschlange = new LinkedList<>();

    }
    private Queue<Kunde> expressKasse ;
    private Queue<Kunde> normaleKasse;
    private Random random ;
    private int Kundennummer ;

    public   SupermarktSimulation (){
        expressKasse = new LinkedList<>();
        normaleKasse = new LinkedList<>();
        random = new Random();
        Kundennummer = 1;



    }
    public void neueKunde(){
        int artikelAnzahl = random.nextInt (15)+1;
        Kunde kunde = new Kunde ("Kunde "+Kundennummer++, artikelAnzahl);

        if (artikelAnzahl<= 6){
            expressKasse.offer(kunde);
            System.out.println(kunde+ "stellt sich an expressKasse");
        }else {
normaleKasse.add(kunde){
                System.out.println(kunde+"stellt sich an normaleKasse");

            }
        }
    }
}