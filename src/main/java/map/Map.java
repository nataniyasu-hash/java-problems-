package map;


import fpinjava.Function;

public interface Map<K,V>  {

  default boolean isEmpty() {
    return false;
  }

  default boolean isEqualTo(Map<K, V> o) {
    return false;
  }

  default Map<K,V> insertWith(Function<V,Function<V, V>> f, K key, V value){
    return null;
  }

  Map<K,V> insert(K key, V value) ;


}