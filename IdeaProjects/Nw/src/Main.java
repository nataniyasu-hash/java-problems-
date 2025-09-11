import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List <Note> notes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true){

    System.out.println("Welcome to ur Notes");
    System.out.println(" choose from the following options");
    System.out.println(" 1:create a new Note ");
    System.out.println(" 2:edit Note ");
    System.out.println(" 3:show all my Notes ");
    System.out.println(" 4:delet Notes ");
    System.out.println(" 5:prgramm beenden  ");

    int Auswahl ;
    Auswahl = scanner.nextInt();
    scanner.nextLine();

    switch  (Auswahl) {
        case 1 : createNote(scanner);
        break ;
        case 2: editNotes (scanner );
        break ;
        case 3: showNotes ();
        break ;
        case 4: deletNotes (scanner);
        break ;
        case 5 :
            System.out.println(" U have ended the Program ");
            scanner.close ();
            System.exit (0);
            break ;
        default:
            System.out.println(" Avaliable options are only from 1 to 5 ");
            break;
    }
    }

    }

    private static void createNote(Scanner scanner) {
        System.out.println(" welcome ");

        System.out.println(" add a tilte Please ");
        String Title =  scanner.nextLine();
        System.out.println(" Now U are ready to go ");
       String  Content =scanner.nextLine();

       Note newnotes = new Note (Title , Content );
       notes.add (newnotes);
        System.out.println(" Ur note is saved now ");

    }
    private static void editNotes(Scanner scanner ){
        System.out.println("-- Edit Notes ");
        if(notes.isEmpty()) {
            System.out.println(" Empty, pleasse add a Note first in order to edit ");
        return; }

        System.out.println("List of Ur notes ");
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println( (i+1)+ ". " + note.getTitle() );

        }
        System.out.println(" which note would u like to edit (1-" + notes.size()+ "):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice <1 || choice > notes.size()) {
            System.out.println(" chosen note is not included " +
                    ", please try again ");
            return ;
        }
        Note notetoEdit = notes.get(choice-1);

        System.out.println(" current Title : " + notetoEdit.getTitle());
        System.out.println(" current content "+ notetoEdit.getContent());
        System.out.println("______________________________________________________");

        System.out.println(" edit  Title (if u woudnt like to make any change,  just press enter");
        String newTitle = scanner.nextLine();

        System.out.println(" edit Content (if u wouldnt like to make any changes, pres enter in order to continue )");
        String newContent = scanner.nextLine();

    if (!newTitle.isEmpty()){
        notetoEdit.setTitle(newTitle);
    }

    if (!newContent.isEmpty()){
        notetoEdit.setContent(newContent);
    }



    }
    private static void showNotes () {
        System.out.println(" --- All Ur Notes ---");

        if (notes.isEmpty()) {
            System.out.println("Empty");
            return ;
        }
        for (int i = 0; i <notes.size () ; i++) {
            System.out.println("--- Titles ---");
            Note note = notes.get(i);
            System.out.println((i+1)+ ". "+ note.getTitle());
        }
    }
    private static void deletNotes(Scanner scanner ){
        System.out.println(" --- All Ur Notes ----");
        if (notes.isEmpty()) {
            System.out.println("Empty");
            return ; }

            for (int i = 0; i <notes.size() ; i++) {
                System.out.println(" ----Titles----");
                Note note = notes.get(i);
                System.out.println((i+1) + ". " + note.getTitle());
            }
        System.out.println(" choose from the following options 1-("+ notes.size()+ "):");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice <1 || choice > notes.size()){
                System.out.println(" chosen option coud not be found ");
                return;
            }
Note notetoDelet = notes.get(choice-1);
        System.out.println(" Are U sure to delet this note ");
        System.out.println("  Title" + notetoDelet.getTitle());
        System.out.println("  content " + notetoDelet.getTitle());
        System.out.println(" for confrimation please type 'yes' ");
        System.out.println("--------------------------------------------------");
        String confrimation = scanner.nextLine();

        if (confrimation.equalsIgnoreCase("yes")){
            notes.remove (choice-1 );
            System.out.println(" Deleted");
        }  else {
            System.out.println(" process cancled ");
            return ;
        }


        }
}
