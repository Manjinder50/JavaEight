package Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStudentExample {

	static Predicate<Student> p1 = s -> s.getGradeLevel() > 3;
	static Predicate<Student> p2 = s -> s.getGpa() > 3.5;

	public static void filterStudentByGrade() {

		List<Student> students = StudentDataBase.getAllStudents();

		List<Student> studentsWithGradeLevelOver3 = students.stream().filter(p1).collect(Collectors.toList());
		studentsWithGradeLevelOver3.forEach(System.out::println);
	}

	public static void filterStudentByGrade1() {

		List<Student> students = StudentDataBase.getAllStudents();

		students.forEach(student -> {

			if (p1.test(student)) {
				System.out.println(student);
			}
		}

		);
	}

	public static void filterStudentsByGPA() {

		StudentDataBase.getAllStudents().forEach(student -> {

			if (p2.test(student))
				System.out.println(student);
		});

	}

	public static void filterStudents() {
		
		StudentDataBase.getAllStudents().forEach(student -> {
			
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void main(String[] args) {

//		filterStudentByGrade1();
	//	filterStudentsByGPA();
		filterStudents();
	}

}
