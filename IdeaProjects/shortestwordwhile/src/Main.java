
public class Main {
    public static String shortestWord(String text) {
        String[] words = text.split(" ");
        String shortest = words[0];
        int i = 1;
while (i < words.length) {
    if (words[i].length() < shortest.length())
        shortest = words[i];
    i++;
}
       return shortest;
    }





    public static void main(String[] args) {
        String text = "Hallo Welt Java";
        System.out.println(shortestWord(text)); // Gibt "Welt" aus
    }
}