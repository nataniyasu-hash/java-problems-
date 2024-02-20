package graphMap.map;

import graphMap.ADTGraphJqwikTest;
import graphMap.Graph;
import list.List;
import tuple.Tuple;

public class MapGraphJqwikTest extends ADTGraphJqwikTest {
  @Override
  protected <A extends Comparable<A>, B> Graph<A, B> empty() {
    return MapGraph.empty();
  }

  @Override
  protected <A extends Comparable<A>, B> Graph<A, B> fromList(List<Tuple<Tuple<A, A>, B>> ews) {
    return MapGraph.fromList(ews);
  }
}
