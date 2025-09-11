public class experiment {
    public static void main (String [] args){
    double [] noten = {2,3, 2.5,6,3};
    double sum =0;
    for (int i= 0; i< noten.length; i++){
        sum += noten[i];

    }
        System.out.println(sum/ noten.length);
    }
}
