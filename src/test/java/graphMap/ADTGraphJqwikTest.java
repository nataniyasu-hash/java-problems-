package graphMap;

import list.List;
import net.jqwik.api.*;
import tuple.Tuple;

import static graphMap.ExGraphs.*;
import static map.JqwikUtils.*;
import static tuple.Tuple.tuple;

public abstract class ADTGraphJqwikTest {

  final int maxSize = 50;

  protected abstract <A extends Comparable<A>,B> Graph<A,B> empty();

  protected abstract <A extends Comparable<A>,B> Graph<A,B> fromList(List<Tuple<Tuple<A,A>,B>> ews);

  private Arbitrary<String> strings(){
    return Arbitraries.strings().withCharRange('a', 'c')
            .ofMinLength(3).ofMaxLength(5);
  }

  private Arbitrary<Integer> ints() {
    return Arbitraries.integers().between(20, 100);
  }

  @Provide
  Arbitrary<String> vertices(){
    return strings();
  }

  @Provide
  Arbitrary<Tuple<String,String>> edges(){
    return  tuples(strings(),strings());
  }

  @Provide
  Arbitrary<Integer> weights(){
    return ints();
  }

  @Provide
  Arbitrary<Graph<String,Integer>> graphs(){
    return Arbitraries.oneOf(
            graphs(tupleLists(edges(),weights(),maxSize)),
            Arbitraries.of(caliDG,brd,gRL141,gradle)
            );
  }

  @Provide
  Arbitrary<Tuple<Graph<String,Integer>,Graph<String,Integer>>> equalGraphs(){
    return equalTupleLists(edges(),weights(),maxSize).map(t->tuple(fromList(t.fst),fromList(t.snd)));
  }


  @Provide
  Arbitrary<Tuple<Graph<String,Integer>,Graph<String,Integer>>> graphsWithSameEdgesDiffWeights(){
    final var wa1 = Arbitraries.integers().between(0, 50);
    final var wa2 = Arbitraries.integers().between(51, 100);

    return tupleListsWithSameAsDiffBs(edges(), wa1, wa2, 10)
            .map(t->tuple(fromList(t.fst),fromList(t.snd)));
  }


  private <A extends Comparable<A>,B> Arbitrary<Graph<A,B>> graphs(Arbitrary<List<Tuple<Tuple<A,A>,B>>> ews){
    return ews.map(this::fromList);
  }

  @Property
  <A extends Comparable<A>,B>
  boolean equalGraphsAreEqual(@ForAll("equalGraphs") Tuple<Graph<A,B>,Graph<A,B>> t){
    return t.fst.equals(t.snd);
  }


  @Property
  <A extends Comparable<A>, B>
  boolean graphsWithSameEdgesDiffWeightsAreUnEqual(
          @ForAll("graphsWithSameEdgesDiffWeights") Tuple<Graph<A,B>,Graph<A,B>> t){
    final var g1 = t.fst;
    final var g2 = t.snd;
    Assume.that(!g1.isEmpty()||!g2.isEmpty());
    return !g1.equals(g2);
  }


  // isEmpty(empty)	= True
  @Example
  boolean isEmpty_empty(){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀ e:(A,A), ∀w:B
  // isEmpty(insert(e,w,g)) = False
  @Property
  <A extends Comparable<A>,B>
  boolean isEmpty_insert(@ForAll("graphs") Graph<A,B> g,
                         @ForAll("edges")  Tuple<A,A> e,
                         @ForAll("weights") B w){
    return false;
  }

  // ∀ e:(A,A) : edgeIn(e,empty) = False
  @Property
  <A extends Comparable<A>,B>
  boolean edgeIn_empty(@ForAll("edges") Tuple<A,A> e){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀ e1,e2:(A,A), ∀ w:B
  // edgeIn(e2,insert(e1,w,g)) = e1=e2 ? True  : edgeIn(e2,g)
  @Property
  <A extends Comparable<A>,B>
  boolean edgeIn_insert(@ForAll("graphs") Graph<A,B> g,
                        @ForAll("edges")  Tuple<A,A> e1,
                        @ForAll("edges")  Tuple<A,A> e2,
                        @ForAll("weights") B w){
    return false;
  }

  // size(empty) = 0
  @Example
  boolean size_empty(){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀e:(A,A), ∀ w:B
  // size(insert(e,w,g)) = !edgeIn(e,g) ? size(g)+1 : size(g)
  @Property
  <A extends Comparable<A>,B>
  boolean size_insert(@ForAll("graphs") Graph<A,B> g,
                      @ForAll("edges")  Tuple<A,A> e,
                      @ForAll("weights") B w){
    return false;
  }

  // ∀v:A : nodeIn(v,empty)	=	false
  @Property
  <A extends Comparable<A>,B>
  boolean nodeIn_empty(@ForAll("vertices") A v){
    return false;
  }

  //  ∀ g: Graph<A,B>,∀ v1,v2,v3 : A, ∀ w: B
  // nodeIn(v1,insert((v2,v3),w,g)) = v1=v2 || v1=v3 ? true : nodeIn(v1,g)
  @Property
  <A extends Comparable<A>,B>
  boolean nodeIn_insert(@ForAll("graphs") Graph<A,B> g,
                        @ForAll("vertices")  A v1,
                        @ForAll("vertices")  A v2,
                        @ForAll("vertices")  A v3,
                        @ForAll("weights")   B w){
    return false;
  }

  // nodes(empty)	=	Set.empty
  @Example
  boolean nodes_empty(){
    return false;
  }

  // ∀ g: Graph<A,B>,∀ v1,v2 : A, ∀ w: B
  // nodes(insert((v1,v2),w,g)) = Set.insert(v2,Set.insert(v1,nodes(g))
  @Property
  <A extends Comparable<A>,B>
  boolean nodes_insert(@ForAll("graphs") Graph<A,B> g,
                       @ForAll("vertices")  A v1,
                       @ForAll("vertices")  A v2,
                       @ForAll("weights")   B w){
    return false;
  }

  //edges(empty) = Map.empty
  @Example
  boolean edges_empty(){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀e:(A,A), ∀ w:B
  // edges(insert(e,w,g))	= Map.insert(e,w,edges(g))
  @Property
  <A extends Comparable<A>,B>
  boolean edges_insert(@ForAll("graphs") Graph<A,B> g,
                       @ForAll("edges")  Tuple<A,A> e,
                       @ForAll("weights") B w){
    return false;
  }

  //  ∀ v:A : adj(v,empty) =	Set.empty
  @Property
  <A extends Comparable<A>,B>
  boolean adj_empty(@ForAll("vertices") A v){
    return false;
  }

  // ∀ g: Graph<A,B>,∀ v1,v2,v3 : A, ∀ w: B
  // adj(v1,insert((v2,v3),w,g)) = v1=v2 ? Set.insert(v3,adj(v1,g)) : adj(v1,g)
  @Property
  <A extends Comparable<A>,B>
  boolean adj_insert(@ForAll("graphs") Graph<A,B> g,
                     @ForAll("vertices")  A v1,
                     @ForAll("vertices")  A v2,
                     @ForAll("vertices")  A v3,
                     @ForAll("weights")   B w){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀ e1,e2:(A,A), ∀ w1,w2:B
  // insert(e2,w2,insert(e1,w1,g))	= e1=e2 ? insert(e2,w2,g)
  //   					                            : insert(e1,w1,insert(e2,w2,g))
  @Property
  <A extends Comparable<A>,B>
  boolean insert_insert(@ForAll("graphs") Graph<A,B> g,
                        @ForAll("edges")  Tuple<A,A> e1,
                        @ForAll("edges")  Tuple<A,A> e2,
                        @ForAll("weights") B w1,
                        @ForAll("weights") B w2){
    return false;
  }

  // ∀ e:(A,A) : weight(e,empty)	= Result.empty
  @Property
  <A extends Comparable<A>,B>
  boolean weight_empty(@ForAll("edges") Tuple<A,A> e){
    return false;
  }

  // ∀ g:Graph<A,B>, ∀ e1,e2:(A,A), ∀ w:B
  // weight(e2,insert(e1,w,g)) =	e1=e2 ? Result.success(w) : weight(e2,g)
  @Property
  <A extends Comparable<A>,B>
  boolean weight_insert(@ForAll("graphs") Graph<A,B> g,
                        @ForAll("edges")  Tuple<A,A> e1,
                        @ForAll("edges")  Tuple<A,A> e2,
                        @ForAll("weights") B w){
    return false;
  }

  //  ∀ g:Graph<A,B>
  //  sum[size (adj u g)|u<-nodes g] = size(g)
  @Property
  <A extends Comparable<A>,B>
  boolean sum_length_adj(@ForAll("graphs") Graph<A,B> g){
    return false;
  }
}
