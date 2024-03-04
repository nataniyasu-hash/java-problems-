package map;


import fpinjava.Function;

public interface SortedMap<K extends Comparable<K>,V>  {

  default boolean isEmpty() {
    return false;
  }

  default boolean isEqualTo(SortedMap<K, V> o) {
    return false;
  }

  default SortedMap<K,V> insertWith(Function<V,Function<V, V>> f, K key, V value){
    return null;
  }

  SortedMap<K,V> insert(K key, V value) ;


}