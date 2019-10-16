package Lambda;

import java.util.List;

import Consumer.Student;
import Consumer.StudentDataBase;

public class ConsumerSolutionLegacyWay {

	public static void printStudents() {

		List<Student> studentList = StudentDataBase.getAllStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	public static void listNameAndActivities() {

		List<Student> studentList = StudentDataBase.getAllStudents();
		for(Student student : studentList) {
			System.out.println("Name :"+student.getName()+", "+"Activities :"+student.getActivities());
		}

	}

	public static void main(String[] args) {

		printStudents();
		listNameAndActivities();
	}

}
