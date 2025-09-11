public class Laprador implements hundinterface{
    int age ;
    int height;
    String name ;

    public Laprador(int age, int height, String name ) {
        this.age = age;
        this.height = height;
        this.name = name ;

    }
    @Override
    public void bellen (){
        System.out.println("bellen");
    }

    @Override
    public void fressen() {

    }

}
