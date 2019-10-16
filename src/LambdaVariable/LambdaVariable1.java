package LambdaVariable;

import java.util.function.Consumer;

public class LambdaVariable1 {

	public static void main(String[] args) {

		int i = 0;
		Consumer<Integer> c1 = /*Not allowed(i)*/(i1) -> {
		
			//Not allowed-int i = 1;
			System.out.println("Value is "+i);
		};
	}

}
