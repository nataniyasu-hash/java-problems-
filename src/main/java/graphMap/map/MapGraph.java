package graphMap.map;

import graphMap.Graph;
import list.List;
import map.SortedMap;
import map.TreeMap;
import tuple.Tuple;


// Gerichteter Graph
public class MapGraph<A extends Comparable<A>,B> implements Graph<A,B> {

	protected MapGraph(){}

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
