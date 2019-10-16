package stream_terminal;

import java.util.stream.Collectors;

import Consumer.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents().stream()//Stream<Stream>
				.filter(student->student.getGpa()>=3.9)
				.collect(Collectors.counting());
		
	}
	public static void main(String[] args) {

		System.out.println("No of students "+count());
	}

}
