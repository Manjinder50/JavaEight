package stream_terminal;

import java.util.List;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> namesOfStudents = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println(namesOfStudents);
	}

}
