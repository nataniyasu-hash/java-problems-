//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Hund laport = new Hund ("max",23, true );
        Hund loki = new Hund ("lul",23, false );
        Hund lowkey = new Hund ("sm",23 , true);

        Hund [] hunde ={laport, loki,lowkey};

        System.out.println("welche Hunde sind flexible ? ");
        int counter= 0;
        for (int i=0; i<hunde.length; i++) {
            if (hunde[i].flexible)
                counter++;
        }
        System.out.println(counter);
        int  gesuchtealter = 23;
if (gesuchtealter== 23)
    System.out.println(hunde[i].name);
        }

       // System.out.println(" Der Hund ist "+ hund1.height + " groß");

//hund1.bellen ();
//hund1.rechnen(3,5);

    }
