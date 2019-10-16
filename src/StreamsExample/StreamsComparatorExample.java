package StreamsExample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamsComparatorExample {

	public static List<String> sortByStudentName(){
		
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).map(Student::getName).collect(Collectors.toList());
		
	}
	
	public static List<String> sortByStudentGPAAscending(){
		
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).map(Student::getName).collect(Collectors.toList());
	}
	
	public static List<String> sortByStudntGPADescending(){
		
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).map(Student::getName).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {

		sortByStudentName().forEach(System.out::println);
		sortByStudentGPAAscending().forEach(System.out::println);
		sortByStudntGPADescending().forEach(System.out::println);
	}

}
