package InterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static List<Integer> divisibleBy2(List<Integer> input){
		return input.stream().filter(num->num%2==0).collect(Collectors.toList());
		
	}
	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(divisibleBy2(input));
		
	}

}
