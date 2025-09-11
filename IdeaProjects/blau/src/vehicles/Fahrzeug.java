package vehicles;


public class Fahrzeug {
 public String markeName;

 public Fahrzeug (String markeName){
   this.markeName = markeName;
 }
 public void makeSound (){
     System.out.println(markeName+ " vroom vroom ... ");
 }
}




