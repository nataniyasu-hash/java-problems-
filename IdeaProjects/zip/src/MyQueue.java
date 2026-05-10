import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private List<T> queue;

    public MyQueue() {
        queue = new ArrayList<>();
    }
    public boolean enter(T a) {
        try {
            queue.add(0, a);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public T leave() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("leer");
        } else {
            return queue.remove(queue.size() - 1);
        }
    }

    public T front() {
        if (queue.isEmpty())
            throw new IllegalStateException(" liste ist leer");
        return queue.get(queue.size() -1);
    }
    public String toString() {
        return queue.toString();
    }
}