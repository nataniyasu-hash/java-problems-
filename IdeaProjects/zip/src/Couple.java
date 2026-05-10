public class Couple<T, U> {
    private T a;
    private U b;

    public Couple(T a, U b) {
        this.a = a;
        this.b = b;
    }

    public T first() {
        return a;
    }

    public U second() {
        return b;
    }

    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
