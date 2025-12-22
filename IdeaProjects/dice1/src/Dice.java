public class Dice {
    String wurf;
    // mit parameter
    public Dice(int a) {
        wurf = "W" + a;
    }
    // ohne parameter
    public Dice() {
        int zahl = (int) (Math.random() * 6 + 1);
        wurf = "W"+ zahl;
    }
    public String toString() {
    return wurf;
    }
}
