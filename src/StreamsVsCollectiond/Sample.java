package StreamsVsCollectiond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>(Arrays.asList("adam","jim","jenny"));
		
		for(String name:names) {
			System.out.println(name);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		names.remove(0);
		System.out.println(names);
	
	
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
	
	}

}
