
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Note> notes  = new ArrayList<>();
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       while (true){
           System.out.println(" willkommen in dein Notizen");
           System.out.println(" Bitte wähle von den Option 1 bis 5 aus");
           System.out.println("1: neu Notiz erstellen");
           System.out.println("2 : alle Notizen wiedergeben ");
           System.out.println("3 : Notiz bearbeiten ");
           System.out.println("4 : Notiz löschen");
           System.out.println("5 : Programm beenden");

        int choices = scan.nextInt();
        scan.nextLine();
        switch (choices) {
            case 1 : notesErstellen (scan);
            break;
            case 2 : Notesanzeigen ();
            break ;
            case 3 : editNotes (scan);
            break;
            case 4 : deletNotes (scan);
            case 5 :
                System.out.println("adios");
                scan.close();
                System.exit(0);
                break;
            default:
                System.out.println(" bitte nur 1-5 wählen");
        }

       }


    }
    private static void notesErstellen (Scanner scan ){
        System.out.println(" Neue Notiz erstellen ");

        System.out.println(" Gib den Titel deines Notizs an ");
        String title = scan.nextLine();
        System.out.println(" Inhalt eingeben ");
        String content = scan.nextLine();

        Note neuNotiz = new Note(title, content );
        notes.add (neuNotiz);

        System.out.println(" dein Notiz wurde erfolgreich gespeichert ");

    }
    private static void Notesanzeigen () {
        System.out.println(" ---- ALLE NOTIZTEN ---");

        if (notes.isEmpty()) {
            System.out.println(" Deine Speicherort ist Leer ");
            return;
        }
     //-->    for (int i = 0; i < notes.size(); i++) {

        }
    }
    private static void editNotes (Scanner scan ){
        System.out.println(" kommt später");
    }
    private static void deletNotes (Scanner scan ){
        System.out.println( " kommt auch später");
    }

        public void main() {
        }

