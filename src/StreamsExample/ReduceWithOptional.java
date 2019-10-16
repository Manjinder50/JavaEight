package StreamsExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import Consumer.Student;
import Consumer.StudentDataBase;

public class ReduceWithOptional {

	public static Optional<Integer> performMultiplication(List<Integer> integerList) {
		
		return integerList.stream().reduce((a,b)->a*b)	;
	}
	
	public static Optional<Student> getHighestGPAStudent() {
		
		return StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa));
		
	}
	
	public static Optional<Student> getHighestGPAStudent1() {
		
		return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->
			{
				if(s1.getGpa()>s2.getGpa())
					return s1;
				else return s2;
			});
		
	}
	
	public static Optional<Student> getHighestGPAStudent2() {
		
		return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
		
	}
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,3,5,7);
		Optional<Integer> result = performMultiplication(integers);
		System.out.println(result);
		System.out.println("result.isPresent() "+result.isPresent());
		System.out.println("result.get() "+result.get());
		System.out.println("Student with highest GPA"+getHighestGPAStudent());
		Optional<Student> studentOptional = getHighestGPAStudent1();
		if(studentOptional.isPresent()) {
		System.out.println(studentOptional.get());
		}
		Optional<Student> studentOptional1 = getHighestGPAStudent2();
		if(studentOptional1.isPresent()) {
		System.out.println(studentOptional1 .get());
		}
		
	}

}
