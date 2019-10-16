package Function;

import java.util.function.Function;

public class FunctionExample {

	static Function<String,String> function = (name) -> name.toUpperCase();
	
	static Function<String,String> addSomeString = (name) -> name.concat("DEFAULT");
	
	public static void main(String[] args) {

		System.out.println("Result: "+function.apply("java8"));
		System.out.println("Result of andThen "+function.andThen(addSomeString).apply("java8"));
		System.out.println("Result of compose "+function.compose(addSomeString).apply("java8"));
		
	}

}
