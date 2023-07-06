package test;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//class reference         //Constructor reference   
		SoftwareTester emp1 = new SoftwareTester("Megan", "Good", 22, "QA", "JUnit", false, "14-02-2023");
		SoftwareEngineer emp2 = new SoftwareEngineer("Vusi", "Sizani", Gender.MALE, 30, "Technical Architect", "Full Stack", true, "02-01-2019");
		
//		int numbers[] = {1,2,3,4,5,6};
//		String names[] = {"Loraine", "Janine", "Athenkosi", "Bontle"};
//		
//		String name = "Nobantu"; // 1) initial memory(522) 2) Garbage Collected when change
//		name = "Lona"; // 1) new memory location(654)
//		name.charAt(2); 
		
		ArrayList<Employee> employees = new ArrayList();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(new SoftwareTester("Sindi", "Hope", 25, "QA", "Selenium", true, "05-07-2023"));
		employees.add(new SoftwareTester("Sindi", "Hope", 25, "QA", "Selenium", true, "05-07-2023"));
		
		for(Employee emp : employees) {
			emp.Print();
		}
		
		Map<Integer, Employee> emps = new HashMap<Integer, Employee>();
		
		emps.put(101, emp1);
		emps.put(102, emp2);
		emps.put(103, new SoftwareTester("Sindi", "Hope", 25, "QA", "Selenium", true, "05-07-2023"));
		
//		for (Map.Entry<Integer, Employee> me :  emps.entrySet()){
//           // Printing keys
//           System.out.print("EmployeeID: " + me.getKey() + "\n");
//           me.getValue().Print();
//       }
	}
}