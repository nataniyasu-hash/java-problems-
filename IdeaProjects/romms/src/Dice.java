public class Dice {
    String wurf;

    // mit Parameter
    public Dice (int a) {
        wurf = "W" + a;
    }

    // ohen parameter

    public Dice () {
        wurf = "W" + (int)(Math.random() * 6+ 1);
    }

    public String toString () {
        return wurf;
    }

}
