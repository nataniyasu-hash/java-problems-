package graphMap.map;

import fpinjava.Result;
import graphMap.Graph;
import list.List;
import map.Map;
import map.TreeMap;
import tuple.Tuple;


// Gerichteter Graph
public class MapGraph<A extends Comparable<A>,B> implements Graph<A,B> {
	final private Map<A,Map<A,B>> m;

	protected MapGraph(){
		this.m = TreeMap.empty();
	}

	private MapGraph(Map<A,Map<A,B>> m) {
		this.m = m;
	}

	@Override
	public boolean isEmpty() {
		return m.isEmpty();
	}
  @Override
	public boolean isEqualTo(Graph<A,B> g) {
		return false;
	}
public static <A,B> Graph<A,B> empty() {
		return  new MapGraph();
	}

  public static <A,B> Graph<A,B> fromList(List<Tuple<Tuple<A,A>,B>> ews){
		return empty();
	}
}
