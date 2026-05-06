package list;
import fpinjava.Function;


public abstract class List<A> {

  public abstract A head();

  public abstract List<A> tail();

  public abstract boolean isEmpty();

  public abstract List<A> setHead(A h);


  public abstract <B> B foldr(Function<A, Function<B, B>> f, B s);

  public static  <A,B> B foldr(Function<A, Function<B, B>> f, B s, List<A> xs) {
    return xs.foldr(f, s);
  }

  public abstract <B> B foldl(Function<B, Function<A, B>> f, B s);

  public static <A, B> B foldl(Function<B, Function<A, B>> f, B s, List<A> xs)  {
    return xs.foldl(f, s);
  }

  public static Integer sum(List<Integer> list) {
    return list.foldl(acc -> x -> x + acc, 0);
  }

  public static Double prod(List<Double> list) {
    return list.foldl(acc-> x-> acc * x, 1.0);
  }

  public static boolean and(List<Boolean> list) {
    return list.foldl(acc -> x -> acc && x, true);
  }

  public static boolean or(List<Boolean> list) {

    return list.foldl(acc -> x -> acc || x, false);
  }

  public static Integer minimum(List<Integer> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("minimum auf eine leere Liste aufgerufen");
    }
    return list.tail().foldl(acc -> x -> acc > x ? x : acc, list.head());
  }

  public static Integer maximum(List<Integer> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("maximum auf eine Leere Liste aufgerufen");
    }
    return list.tail().foldl(acc -> x -> acc > x ? acc : x, list.head());
  }

  public <B> List<B> map(Function<A, B> f) {
    return this.foldr(x -> acc -> new Cons<>(f.apply(x), acc), (List<B>) new Nil<>());
  }

  public List<A> filter(Function<A, Boolean> f) {
    return this.foldr(x -> acc -> f.apply(x) ?  new Cons<>(x, acc) : acc, (List<A>) new Nil<>());
  }

  public static <A> List<A> append(List<A> list1, List<A> list2) {
    return list1.foldr(x -> acc -> new Cons<>(x, acc), list2);
  }

  public static <A> List<A> concat(List<List<A>> list) {
    return list.foldr(x -> acc -> append(x, acc), (List<A>) new Nil<>());
  }

  public abstract List<A> take(int n);
  public abstract List<A> drop(int n);
  public abstract A finde(Function<A, Boolean> p);
  public abstract List<A> delete(A d);
  public abstract List<A> takeWhile(Function<A, Boolean> p);
  public abstract List<A> dropWhile(Function<A, Boolean> p);
  public abstract A last();
  public abstract List<A> init();
  public abstract boolean any(Function<A, Boolean> p);
  public abstract boolean isEqualTo(List<A> xs);


  public boolean elem(A x) {
    return this.any(y -> y.equals(x));
  }

  public boolean all(Function<A, Boolean > p) {
    return !this.any(x -> !p.apply(x));
  }

  public int length() {
    return this.foldl(acc -> x -> 1 + acc, 0);
  }

  public List<A> reverse() {
    return this.foldl(acc -> x -> new Cons<>(x, acc), (List<A>) new Nil<>());
  }

  public <B> List<B> concatMap(Function<A, List<B>> f) {
    return concat(map(f));
  }

  public static List<Integer> range(int start, int end) {
    return start > end ? new Nil<>() : new Cons<>(start, range(start + 1, end));
  }

  public static List<String> words(String a) {
    return a == null || a.trim().isEmpty() ? new Nil<>() : list(a.trim().split("\\s+"));
  }

  public boolean equals(Object o) {
    return this == o ? true
            : !(o instanceof List) ? true
            : this.isEqualTo((List<A>) o);

  }


  public List<A> cons(A a) {
    return new Cons<>(a, this);
  }

  @SuppressWarnings("rawtypes")
  public static final List NIL = new Nil();

  private List() {
  }

  private static class Nil<A> extends List<A> {

    private Nil() {
    }

    public A head() {
      throw new IllegalStateException("head called en empty list");
    }

    public List<A> tail() {
      throw new IllegalStateException("tail called en empty list");
    }

    public boolean isEmpty() {
      return true;
    }

    @Override
    public List<A> setHead(A h) {

      throw new IllegalStateException("setHead auf leere Liste aufgerufen");
    }

    @Override
    public boolean isEqualTo(List<A> xs){
      return xs.isEmpty();
    }

    public <B> B foldr(Function<A, Function<B, B>> f, B s) {
      return s;
    }

    public <B> B foldl(Function<B, Function<A, B>> f, B s) {
      return s;
    }

    public List<A> take(int n) {
      return this;
    }

    public List<A> drop(int n) {
      return this;
    }

    public A finde(Function<A, Boolean> p) {
      return null;
    }

    public List<A> delete(A d) {
      return this;
    }

    public List<A> takeWhile(Function<A, Boolean> p) {
      return this;
    }

    public List<A> dropWhile(Function<A, Boolean> p) {
      return this;
    }

    public A last() {
       throw new IllegalStateException("last auf leere List aufgerufen");
    }

    public List<A> init() {
      throw new IllegalStateException("init() auf eine Leere liste aufgerufen");
    }

    public boolean any(Function<A, Boolean> p) {
      return false;
    }


    public String toString() {
      return "[]";
    }
  }

  private static class Cons<A> extends List<A> {

    private final A head;
    private final List<A> tail;

    private Cons(A head, List<A> tail) {
      this.head = head;
      this.tail = tail;
    }

    public A head() {
      return head;
    }

    public List<A> tail() {
      return tail;
    }

    public boolean isEmpty() {
      return false;
    }

    @Override
    public List<A> setHead(A h) {
      return new Cons<>(h, this.tail());
    }

    @Override
    public boolean isEqualTo(List<A> xs){
      return xs.isEmpty() ? false
              : this.head().equals(xs.head()) && this.tail.isEqualTo(xs.tail());
    }

    public <B> B foldr(Function<A, Function<B, B>> f, B s) {
      return f.apply(this.head()).apply(this.tail.foldr(f, s));
    }

    public <B> B foldl(Function<B, Function<A, B>> f, B s) {
      return this.tail.foldl(f, f.apply(s).apply(this.head));
    }

    public List<A> take(int n) {
      if (n <= 0)
          return new Nil<>();
      return new Cons<>(this.head(), this.tail().take(n - 1));
    }

    public List<A> drop(int n) {
      if (n <= 0)
        return this;
      return this.tail.drop(n - 1);
    }

    public A finde(Function<A, Boolean> p) {
      return  p.apply(this.head()) ? (A) this.head() : this.tail().finde(p);
    }
    public List<A> delete(A d) {
      return this.head().equals(d) ? this.tail() : new Cons<>(this.head(), this.tail().delete(d));
    }

    public List<A> takeWhile(Function<A, Boolean> p) {
      return p.apply(this.head()) ? new Cons<>(this.head(), this.tail().takeWhile(p)) : new Nil<>();
    }

    public List<A> dropWhile(Function<A, Boolean> p) {
      return p.apply(this.head()) ? this.tail().dropWhile(p) : this;
    }

    public A last() {
      return this.tail().isEmpty() ? this.head() : this.tail().last();
    }

    public List<A> init() {
      return this.tail().isEmpty() ? new Nil<>() : new Cons<>(this.head(), this.tail().init());
    }

    public boolean any(Function<A, Boolean> p) {
      return p.apply(this.head()) || this.tail().any(p);
    }



    public String toString() {
      // start wert frü foldl
      StringBuilder s = new StringBuilder("[");

      StringBuilder result = this.foldl(acc -> x -> acc.append(x).append(", "), s);
      result.setLength(result.length() - 2);
      return result.append("]").toString();
    }
  }

  @SuppressWarnings("unchecked")
  public static <A> List<A> list() {
    return NIL;
  }

  @SafeVarargs
  public static <A> List<A> list(A... a) {
    List<A> n = list();
    for (int i = a.length - 1; i >= 0; i--) {
      n = new Cons<>(a[i], n);
    }
    return n;
  }

}