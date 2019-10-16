package numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamMapExample {

	public static List<Integer> mapToObj() {
		
		return IntStream.rangeClosed(1, 5).mapToObj((i)->{
			return new Integer(i);
		}).collect(Collectors.toList());
	}
	
	public static Long mapToLong(){
		
		return IntStream.rangeClosed(1, 5).mapToLong((i)->i).sum();
	}
	
	public static Double mapToDouble() {
		
		return IntStream.rangeClosed(1, 5).mapToDouble(i->i).sum();
	}
		public static void main(String[] args) {

		System.out.println("mapToObject"+mapToObj());
		System.out.println("mapToLong "+mapToLong());
		System.out.println("mapToDouble "+mapToDouble());
	}

}
