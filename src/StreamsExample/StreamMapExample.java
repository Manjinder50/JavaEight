package StreamsExample;

import java.util.List;
import  static java.util.stream.Collectors.toList;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamMapExample {

	
	public static List<String> namesList(){
		
		return StudentDataBase.getAllStudents().stream().//output of this line is Stream<Student>
				//Student as an Input -> Student Name as output
				map(Student::getName)//output Stream<String>
				.collect(toList());
		
		
	}
	public static void main(String[] args) {

		System.out.println(namesList());
	}

}
