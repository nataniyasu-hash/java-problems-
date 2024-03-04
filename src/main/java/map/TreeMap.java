package map;

import fpinjava.Function;
import list.List;
import set.Set;
import set.SortedSet;
import set.TreeSet;
import tuple.Tuple;



public class TreeMap<K extends Comparable<K>,V> implements SortedMap<K,V> {

	@SuppressWarnings("unchecked")
	private TreeMap(){}


	public static <K extends Comparable<K>,V> SortedMap<K,V> empty() {
		return new TreeMap<>();
	}

	public static <K extends Comparable<K>,V> SortedMap<K,V> fromList(List<Tuple<K,V>> list) {
		return new TreeMap<>();
	}

	public boolean isEqualTo(SortedMap<K, V> o){
		return false;
	}

  public SortedMap<K,V> insert(K key, V value) {
    return null;
  }

  public static SortedMap<String,Integer> wordMap(String s){
    return null;
  }

}
