package LambdaVariable;

import java.util.function.Consumer;

public class LambdaVariable2 {

	
	static int value = 4;
	public static void main(String[] args) {

		
		
		Consumer<Integer> c1 = i -> {
			//Local variable value defined in an enclosing scope must be final or effectively final
			value++;
			System.out.println(value+i);
		};
		c1.accept(4);
	}

}
