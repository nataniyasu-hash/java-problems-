package stack;

import list.List;
import tuple.Tuple;

public interface Stack<A> { 
	//boolean isEmpty();
	//Stack<A> push(A e);
	Stack<A> pushAll(List<A> es);
	//Stack<A> pushAll(A... es);
	//Stack<A> pop();
	//A top();
	//Tuple<A,Stack<A>> popTop();
	List<A> toList();
  //boolean isEqualTo(Stack<A> s);
	//int size();
}
