public class Experimentmitarray {
    public static void main(String []args) {
double  [] zahlen = {1,2,3,4,5,6,7,8,9};
double summe = 0;
for (int i =0; i< zahlen.length; i++){
    summe += zahlen [i];
}
        System.out.println("der druchschnitt beträgt:" +summe / zahlen.length);
    }
}
