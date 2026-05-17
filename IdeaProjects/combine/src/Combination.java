public class Combination <T, U> {
    private T first;
    private U second;

    public Combination(T f, U s) {
        this.first = f;
        this.second = s;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
