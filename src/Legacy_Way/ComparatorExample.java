package Legacy_Way;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(23, 12000.0, "ABC", 2));
		employeeList.add(new Employee(43, 33000.0, "DEF", 1));
		employeeList.add(new Employee(53, 44000.0, "GHI", 4));
		employeeList.add(new Employee(33, 22000.0, "JKL", 3));
	
		System.out.println("Employee List before sorting "+employeeList);
		Collections.sort(employeeList, new IdComparator());
		
		System.out.println("Sorted List of employees "+employeeList);
	}

}
