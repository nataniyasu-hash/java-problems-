import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//String [] words ={"Lulya", "Smret", "Gelila"};
//for (String word : words){
        // System.out.println( word);
        //  Mitarbeiter [] mitarbeiterarray = {
        // new Mitarbeiter ("paskal", 16,"kann fussball"),
        // new Mitarbeiter ("ronaldo", 41, "profi"),
        // new Mitarbeiter ("idris", 19,"oke")
        // };

//for (Mitarbeiter mitarbeiter: mitarbeiterarray){
        //  System.out.print(mitarbeiter.name);
        //System.out.println(mitarbeiter.alter);


        // }
        //int [] numbers = {123, 13, 100,239,497 };
        // int sum = 0;
        // for (int number: numbers){
        //  if (number <= 99)
        //      continue;
        //System.out.println(number+ "wurde hinzufügt");
        //sum  += number;
        // }
        //for (int i = 0; i < 10; i++) {
        //if (i== 6){
        // continue;
        //}
        // System.out.println(i);
        //  }
        //}
        //}
      //  Random random = new Random();
      //  while (true){
          //  int zufallszahl = random.nextInt(20);
          //  if (zufallszahl == 5){

             //   break;

        Random random = new Random ();
        int würfel = random.nextInt(6)+1;
        switch (würfel){
            case 1:
                System.out.println("du hast eine eins geworfen, versuch es nochmal um bessere ergebniss zu erzielen");
                break;
            case 2:
                System.out.println("du hast eine zwei geworfen, versuch es nochmal um bessere ergebniss zu erzielen");
                break;
            case 3:
                System.out.println("du hast eine drei geworfen, versuch es nochmal um bessere ergebniss zu erzielen");
                break;
            case 4:
                System.out.println("du hast eine vier geworfen, versuch es nochmal um bessere ergebniss zu erzielen");
                break;
            case 5 :
                System.out.println("du hast eine sechs geworfen, versuch es nochmal um bessere ergebniss zu erzielen");
            case 6:
                System.out.println("stark");
                break;
        }

            }
           // System.out.println("super du bist unter 25% weiter so");
       // }
   // }
}




