package map;

import list.List;
import tuple.Tuple;


public class TreeMapJqwikTest extends ADTSortedMapJqwikTest {

	@Override
	protected <K extends Comparable<K>,V> SortedMap<K,V> empty() {
		return TreeMap.empty();
	}
	
	@Override
  protected <K extends Comparable<K>,V> SortedMap<K,V> fromList(List<Tuple<K,V>> list) {
		return TreeMap.fromList(list);
	}
	
	@Override
  protected SortedMap<String,Integer> wordMap(String s) {
		return TreeMap.wordMap(s);
	}
	
}
