public class während {
    public static void main (String []args){
        int counter ;
        counter = 10;
        boolean weiter = true;
        while(weiter){
            counter --;;
            System.out.println(counter);
            if (counter <0){
                weiter = false;
                System.out.println (" DAs programm ist beendet ");
            }
        }
    }
}
