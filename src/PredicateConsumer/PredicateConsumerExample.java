package PredicateConsumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Predicate.Student;
import Predicate.StudentDataBase;

public class PredicateConsumerExample {

	static Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
	static Predicate<Student> p2 = student -> student.getGpa()>=3.9;
	static BiConsumer<String, List<String>> studentActivities = (name,activities)-> {
		System.out.println("Name :"+name+", Activities :"+activities);
	};
	static Consumer<Student> studentConsumer = (student -> {
		if(p1.and(p2).test(student)) {
			studentActivities.accept(student.getName(), student.getActivities());
		}
	});
	
	public void printNameAndActivities(List<Student> students) {
		
		StudentDataBase.getAllStudents().forEach(studentConsumer);
	}

	public static void main(String[] args) {
		new PredicateConsumerExample().printNameAndActivities(StudentDataBase.getAllStudents());
	}

}
