package Consumer;

import java.util.List;
import java.util.function.Consumer;

import org.w3c.dom.stylesheets.LinkStyle;

public class ConsumerExample {

	static Consumer<Student> studentConsumer = student -> System.out.println(student);
	static Consumer<Student> nameAndActivitiesConsumer = student -> System.out
			.println("Name :" + student.getName() + ", " + "Activities :" + student.getActivities());
	static Consumer<Student> nameConsumer = student -> System.out.println("Name :" + student.getName());
	static Consumer<Student> activityConsumer = student -> System.out.println("Activities :" + student.getActivities());
	
	public static void printStudents() {

		List<Student> studentList = listfOfStudents();
		studentList.forEach(studentConsumer);
	}

	public static List<Student> listfOfStudents(){
		return StudentDataBase.getAllStudents();
	}
	public static void listNameAndActivities() {

		List<Student> studentList = listfOfStudents();
		studentList.forEach(nameAndActivitiesConsumer);
	}

	public static void listNameAndActivitiesWithConsumerChaining() {

		List<Student> studentList = listfOfStudents();
		
		studentList.forEach(nameConsumer.andThen(activityConsumer));
	}
	
		public static void listNameAndActivitiesWithCondition() {
			
			List<Student> studentList = listfOfStudents();
			studentList.forEach(student ->
			{
				if(student.getGradeLevel()>3) {
					nameConsumer.andThen(activityConsumer).accept(student);
				}
			});
		}


	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("Java 8");
//		printStudents();
//		listNameAndActivities();
//		listNameAndActivitiesWithConsumerChaining();
		listNameAndActivitiesWithCondition();
	}
}
