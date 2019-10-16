package StreamsExample;

import java.util.List;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class DistinctCountSorted {

	public static List<String> getAllActivities(){
		return StudentDataBase.getAllStudents().stream().map(Student::getActivities)//Stream<List<String>>
				.flatMap(List::stream)//Stream<String>
				.distinct().sorted().collect(Collectors.toList());
		
	}
	
	public static Long getStudentActivitiesCount(){
		Long activityCount =  StudentDataBase.getAllStudents().stream().map(Student::getActivities)//Stream<List<String>>
				.flatMap(List::stream)//Stream<String>
				.distinct().count();
		
		return activityCount;
		
	}
	public static void main(String[] args) {

		System.out.println(getAllActivities());
		System.out.println(getStudentActivitiesCount());
		
	}

}
