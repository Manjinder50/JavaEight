package streamsExample1;

import java.util.Optional;

import Consumer.Student;
import Consumer.StudentDataBase;

public class FindFirstAndFindAnyExmple {

	
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream().filter(student->student.getGpa()>=3.5).findAny();
		
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream().filter(student->student.getGpa()>=3.5).findFirst();
		
	}
	public static void main(String[] args) {

		Optional<Student> resultOfFindAny = findAnyStudent();
		if(resultOfFindAny.isPresent()) {
			System.out.println(resultOfFindAny.get());
		}else {
			System.out.println("No student found with gpa over 3.5");
		}
		
		Optional<Student> resultOfFindFirst = findFirstStudent();
		if(resultOfFindFirst.isPresent()) {
			System.out.println(resultOfFindFirst.get());
		}else {
			System.out.println("No student found with gpa over 3.5");
		}
	}

}
