
package Predicate;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> predicate = i ->  i%2==0;
	
	static Predicate<Integer> p1 = i->i%5==0;
	
	public static void predicateAnd() {
		System.out.println(predicate.and(p1).test(10));
		System.out.println(predicate.and(p1).test(3));
	}
	
	public static void predicateOr() {
		System.out.println(predicate.or(p1).test(10));
		System.out.println(predicate.or(p1).test(8));
	}
	
	public static void predicateNegate() {
		
		System.out.println(predicate.or(p1).negate().test(10));
	}
	public static void main(String[] args) {

		System.out.println(predicate.test(2));
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
