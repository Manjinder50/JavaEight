package StreamsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int maxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, (a,b)-> a>b?a:b);
	}
	
	public static Optional<Integer> maxValue1(List<Integer> integerList) {
		return integerList.stream().reduce((a,b)-> a>b?a:b);
	}
	
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		List<Integer> integerListOptional = new ArrayList<>();
		System.out.println("Max value in the list "+maxValue(integerList));
		Optional<Integer> result = maxValue1(integerListOptional);
		if(result.isPresent()) {
		System.out.println("Optional value"+ maxValue1(integerListOptional));
	}
	else {
		System.out.println("List is empty");
	}

}
}