public class array {
    public  static void main (String [] args){

        int [] zahlen = new int [101];

        for (int i= 0; i<zahlen.length; i++){
            zahlen [i]= i*i ;

        }
        for (int i= 0; i<zahlen.length; i++){
            System.out.println(zahlen[i]);
        }
    }
}
