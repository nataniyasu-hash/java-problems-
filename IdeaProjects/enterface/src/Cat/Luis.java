package Cat;

public class Luis implements Katzeinterface{
   public int age ;
   public String name ;
    public String speciallity ;

    public Luis(int age, String name, String speciallity) {
        this.age = age;
        this.name = name;
        this.speciallity = speciallity;
    }

    @Override
    public void aufgaben() {
        System.out.println(" hunting the rat ");
    }

    @Override
    public void rechnen() {
System.out.println(" 2+2 = 4 oh ich bin besser als Luci");
    }


}
