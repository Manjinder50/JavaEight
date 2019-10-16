package numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumOfNumbers(List<Integer> list) {
		
		return list.stream().reduce(0,(x,y)->x+y);
	}
	
	public static int sumOfNNumbersIntStream() {
		
		return IntStream.rangeClosed(1, 6).sum();
		
	}
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		System.out.println(sumOfNumbers(integerList));
		System.out.println(sumOfNNumbersIntStream());
	}

}
