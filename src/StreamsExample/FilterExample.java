package StreamsExample;

import java.util.List;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class FilterExample {

	public static List<Student> filterStudents(){
		
		return StudentDataBase.getAllStudents().stream().filter(student->student.getGender().equals("female")).
		collect(Collectors.toList());
				
	}
	public static void main(String[] args) {

		System.out.println("List of female students"+filterStudents());
	}

}
