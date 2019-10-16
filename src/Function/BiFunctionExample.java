package Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import Predicate.Student;
import Predicate.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> studentBiFunction = (students,studentPredicate) -> {
		
		Map<String, Double> studentMap = new HashMap<>();
		students.forEach(student ->{
			if(studentPredicate.test(student)) {
				studentMap.put(student.getName(), student.getGpa());
			}
		});
		return studentMap;
	};
	public static void main(String[] args) {
		
		Predicate<Student> studentPredicte = student -> student.getGradeLevel()>=3;
		System.out.println(studentBiFunction.apply(StudentDataBase.getAllStudents(),studentPredicte));
	}

}
