package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Legacy_Way.Employee;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(23, 12000.0, "ABC", 2));
		employeeList.add(new Employee(43, 33000.0, "DEF", 1));
		employeeList.add(new Employee(53, 44000.0, "GHI", 4));
		employeeList.add(new Employee(33, 22000.0, "JKL", 3));

		System.out.println("Employee List before sorting " + employeeList);
//s		Comparator<Employee> idBasedComparisonAscending = (e1, e2) -> e1.getId() - e2.getId();
//		Comparator<Employee> idBasedComparisonDescending = (e1, e2) -> e2.getId() - e1.getId();

//		Collections.sort(employeeList, idBasedComparisonAscending);
		Collections.sort(employeeList, Comparator.comparing(Employee::getId).reversed());

		System.out.println("Sorted List of employees " + employeeList);
	}

}
