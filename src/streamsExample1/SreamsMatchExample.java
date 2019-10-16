package streamsExample1;

import Consumer.StudentDataBase;

public class SreamsMatchExample {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(student->student.getGpa()>=3.9);
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(student->student.getGpa()>=4.0);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(student->student.getGpa()>=4.1);
	}
	
	public static void main(String[] args) {

		System.out.println(allMatch());//returns false because not all students have GPA greater than or equal to 3.9
		System.out.println(anyMatch());//returns true because there is atleast one student with gpa greater than 4.0
		System.out.println(noneMatch());//returns true because there is no  student with gpa greater than 4.1
	}

}
