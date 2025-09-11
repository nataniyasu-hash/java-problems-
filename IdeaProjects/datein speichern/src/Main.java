
import java.io.FileNotFoundException;
import    java.util.Scanner;
import java.io.File ;
import  java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
       // File datei = new File ("/Users/nobeliyasu/Library/Mobile Documents/com~apple~TextEdit/Documents/abiotische.rtf");
       // Scanner scan = null;

            //try {
             //   scan = new Scanner(datei);
            //} catch (FileNotFoundException e) {

              //  throw new RuntimeException(e);
           // }
//if (scan != null){
  //  while (scan.hasNextLine())
    //    System.out.println( scan.nextLine());

  //  }

       File datei = new File("text123.txt");
       try {
           FileWriter write = new FileWriter (datei, true);
           write.write(" Hallo, Sie müssen sich um einzlogen nur die angegebenen Informationen folgen \n");
           write. write("zunächst muessen sie Ihre Vor und Nachname in der markiertenbereich eingeben \n ");
           write.flush();
       } catch (Exception e ){
       System.out.println(" error found");
       }
    }
       }


