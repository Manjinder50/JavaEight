package Predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

	/*static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
	static Predicate<Student> p2 = student -> student.getGpa()>=3.9;*/
	static BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel,gpa) -> gradeLevel>=3 &&  gpa>=3.9;
	static BiConsumer<String, List<String>> studentActivities = (name,activities)-> {
		System.out.println("Name :"+name+", Activities :"+activities);
	};
	static Consumer<Student> studentConsumer = (student -> {
		if(studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentActivities.accept(student.getName(), student.getActivities());
		}
	});
	
	public void printNameAndActivities(List<Student> students) {
		
		StudentDataBase.getAllStudents().forEach(studentConsumer);
	}

	public static void main(String[] args) {
		
		new BiPredicateExample().printNameAndActivities(StudentDataBase.getAllStudents());
	}

}
