package graphMap;

// gerichteter Graph
public interface Graph<A,B> {

   boolean isEqualTo(Graph<A,B> g);

    default boolean isEmpty(){
      return false;
    }

}
