//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.println(" Please write a sentence : ");
      String sentence = scanner.nextLine();
checksentence(sentence);
    }
    public static void checksentence  (String sentence ){
char [] chars = sentence.toCharArray();
int uppercase = 0;
int lowercase =  0;
int space =0;

for (int  i= 0;  i< chars.length; i++) {
    if (chars [i]== ' ')
        space++;
    if (Character.isUpperCase(chars[i]))
        uppercase++;
    if (Character.isLowerCase(chars[i]))
        lowercase++;



}
System.out.println(" the sentence You have typed contains: ");
System.out.println(" Uppercase letters:  " + uppercase );
System.out.println(" Lowercase  letters:  " + lowercase );
System.out.println(" spaces letters:  " + space );
    }
    }