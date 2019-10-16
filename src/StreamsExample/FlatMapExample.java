package StreamsExample;

import java.util.List;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class FlatMapExample {

	public static List<String> listOfActivities(){
		
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
	}
	public static void main(String[] args) {

		System.out.println(listOfActivities());
	}

}
