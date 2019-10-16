package stream_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Consumer.Student;
import Consumer.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupStudentsByGender() {
		
		Map<String,List<Student>> mapByGender = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(mapByGender);
	}
	
	public static void groupStudentBasedOnGPA(){
	
	Map<String,List<Student>> mapByGpa = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student->student.getGpa()>=3.8?"Outstanding":"Average"));
	System.out.println(mapByGpa);
	}
	
	public static void twoLevelgrouping(){
		
	Map<Integer,Map<String,List<Student>>> twoLevelMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student->student.getGpa()>=3.8?"Outstanding":"Average")));
	System.out.println(twoLevelMap);
	}
	
	public static void twoLevelgrouping1(){
		
	Map<Integer,Integer> twoLevelMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNotebooks)));
	System.out.println(twoLevelMap);
	}
	
	public static void main(String[] args) {
	
	
	groupStudentsByGender();
	groupStudentBasedOnGPA();
	twoLevelgrouping();
	twoLevelgrouping1();		
	}

}
