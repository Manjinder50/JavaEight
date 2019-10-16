package Consumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void nameAndActivities() {
		 
		BiConsumer<String, List<String>> nameAndActivities = (name,activities)->{
			System.out.println("Name: "+name+ " Activities: "+activities);
		};
		List<Student> listOfStudents =  StudentDataBase.getAllStudents();
		
		listOfStudents.forEach(student -> nameAndActivities.accept(student.getName(), student.getActivities()));
	}
	
	
	public static void main(String[] args) {

		BiConsumer<String,String> biConsumer = (a,b)->{
			
			System.out.println("a:"+a+", b: "+b);
		};
		biConsumer.accept("Java 7", "Java 8");
	
	BiConsumer<Integer,Integer> multiply = (a,b)->{
		
		System.out.println("multiplication is "+a*b);
	};
	BiConsumer<Integer,Integer> divide = (a,b)->{
		
		System.out.println("Division is "+a/b);
	};

		multiply.andThen(divide).accept(6,3);
		
		nameAndActivities();
	}
}
