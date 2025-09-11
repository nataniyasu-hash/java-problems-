

 package Cat ;
public  class  Luci implements Katzeinterface{
int age ;
String name ;
String speciallity ;

    public Luci(int age, String name, String speciallity) {
        this.age = age;
        this.name = name;
        this.speciallity = speciallity;
    }


    @Override
    public  void aufgaben() {
System.out.println(" hunting the rat");
    }

    @Override
    public  void rechnen() {
 System.out.println("oh 1 +1 = 2 wow ich kann es ");
    }



}

