import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Note> notes = new ArrayList<>();
    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
        while (true){

            System.out.println("Willkommen in dein Notes");
            System.out.println(" Wähle bitte aus folgenden Optionen um weiter zu machen");
            System.out.println(" 1: Eine neue Note erstellen");
            System.out.println(" 2 :Alle noten anzeigen lassen");
            System.out.println("  3: Noten beearbeiten ");
            System.out.println(" 4: Noten löschen");
            System.out.println(" 5: programm beenden ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1: createNote(scanner);
                break;
                case 2 : showNotes ();
                break ;
                case 3 : editNotes(scanner );
                break;
                case 4 : deletNotes (scanner );
                break ;
                case 5:
                    System.out.println("Programm würde beendet");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(" wähle bitte Optionen von 1-5 aus");
                    break;
            }
        }

    }

    private static void createNote(Scanner scanner ){
        System.out.println("noten erstellen ");

        System.out.println(" Titel eingeben ");
  String Title =scanner.nextLine();
        System.out.println(" content hinzufügen");
         String Content = scanner.nextLine();
         Note newNote = new Note (Title , Content );
        notes.add(newNote);

        System.out.println(" Dein neu ertsellete Notiz würe erfolgreich gespeichert ");



    }
    private static void showNotes (){
        System.out.println(" Hier sind deine bisher gespeicherte Note ");
        if(notes.isEmpty()){
            System.out.println("dein Ordner ist leer");
            return ;
        }
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(" ---- Title ----");
            Note note = notes.get(i);
            System.out.println((i+1)+ ". "+note.getTitle() );
        }
    }
    private static void editNotes (Scanner scanner ){
        System.out.println(" wähle die Datei die du bearbeiten möchtest");
        if(notes.isEmpty()){
            System.out.println("dein ordner ist leer ");
            return;
        }
        // Alle datein anzeigen lassen
        for (int i = 0; i<  notes.size()  ; i++) {
            Note note = notes.get(i);
            System.out.println((i+1)+". "+ note.getTitle());
        }
        // Datei auswählen
        System.out.println(" wähle welche datei du bearbeiten möchtest 1("+ notes.size()+ "):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice <1 || choice >notes.size()){
            System.out.println(" dein wahl ist nicht vorhanden");
            return;
        }
        Note nottoEdit = notes.get(choice- 1);
        System.out.println(" aktuelle Titel "+ nottoEdit.getTitle());
        System.out.println(" aktuelle Inhalt "+ nottoEdit.getContent());
        System.out.println("____________________________________________");
        System.out.println(" Du kannst jetzt dein Title beaarbeten (wenn du keine Änderungen vornehmen möchtest einfach enter drucken um frotzufahren ");
        String newTitle = scanner.nextLine();
        System.out.println(" jetzt darfst du auch dein Inhalt bearbeiten(Um fortzufahren einfach enter drücken )");
        String newContent = scanner.nextLine ();

        if (!newTitle.isEmpty()){
            nottoEdit.setTitle(newTitle);
        }
        if (!newContent.isEmpty()){
            nottoEdit.setConetnt(newContent);
        }
    }
    private static void deletNotes (Scanner scanner ){
        System.out.println(" Wähle die Datei aus die du wirklich löschen möchtest");
        if (notes.isEmpty()){
            System.out.println(" dein ordner ist leer");
            return;
        }
        // Alle datein anzeigen
        for (int i = 0; i < notes.size() ; i++) {
            Note note= notes.get(i );
            System.out.println((i+1)+ ". "+ note.getTitle());

        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        Note nottoDelet = notes.get(choice-1 );

        // nach bestätigung fragen
        System.out.println(" Ausgewählte datei "+ nottoDelet.getTitle());
        System.out.println(" Content"+ nottoDelet.getContent ());
        System.out.println(" willst du Wirklich die Datei Löschen, wenn ja bitte bitte gib 'ja ' ein");
       String   Confirmation = scanner.nextLine();
       if (Confirmation.equalsIgnoreCase("ja")){
           notes.remove(choice-1);
       }else {
           System.out.println(" Der Corgang wurde beendet");
           return ;
       }

    }
}