package StreamsExample;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class SampleStreams {

	public static void main(String[] args) {

		Predicate<Student> filterByGradeLevel = student -> student.getGradeLevel()>=3;
		Predicate<Student> filterByGPA = student -> student.getGpa()>=3.9;
		//Student name and their activity in a map
		//Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName, Student::getActivities));
		//Add a condition
		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream().
				filter(filterByGradeLevel)
				.peek(student->System.out.println("After 1st filter"+student))
				.filter(filterByGPA)
				.peek(student->System.out.println("After 2nd filter"+student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		//Multiple level of filtering
//		Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream().
//				filter(filterByGradeLevel.and(filterByGPA)).collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
	}

}
