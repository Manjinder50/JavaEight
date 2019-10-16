package StreamsExample;

import java.util.function.Predicate;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamMapReduceExample {

	private static Predicate<Student> femaleStudents = student ->student.getGender().equals("female");
	private static Predicate<Student> studentsWithGradeGreaterThan3 = student -> student.getGradeLevel()>=3;
	private static int noOfNoteBooks() {
		return StudentDataBase.getAllStudents().stream().map(Student::getNotebooks).reduce(0, (a, b) -> a + b);
	}

	private static int noOfNoteBooks1() {
		return StudentDataBase.getAllStudents().stream().map(Student::getNotebooks).reduce(0, Integer::sum);
	}

	private static int noOfNoteBooksForStudentsWithGradeGreaterThan3() {
		return StudentDataBase.getAllStudents().stream().filter(femaleStudents.and(studentsWithGradeGreaterThan3))
				.map(Student::getNotebooks).reduce(0, Integer::sum);
	}

	public static void main(String[] args) {

		System.out.println("Total Number of notebooks " + noOfNoteBooks());
		System.out.println("Total Number of notebooks " + noOfNoteBooks1());
		System.out.println("Total Number of notebooks for students with grade greater than 3 "+noOfNoteBooksForStudentsWithGradeGreaterThan3());

	}

}
