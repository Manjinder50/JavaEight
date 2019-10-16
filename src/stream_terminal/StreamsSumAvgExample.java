package stream_terminal;

import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
	}
	public static void main(String[] args) {
	
		System.out.println("Sum of all the notebooks"+sum());
		System.out.println("Average number of notebooks"+avg());
	}

}
