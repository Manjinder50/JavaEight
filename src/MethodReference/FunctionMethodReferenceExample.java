package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String,String> toUpperCaseLambda = s->s.toUpperCase();
	
	//Using Method Reference
	static Function<String,String> usingMethodReference = String::toUpperCase;
	public static void main(String[] args) {

		System.out.println(toUpperCaseLambda.apply("java8"));
		System.out.println(usingMethodReference.apply("java8"));
	}

}
