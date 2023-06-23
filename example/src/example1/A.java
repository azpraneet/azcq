package example1;


	
	
	import java.util.LinkedList;

	public class A {
			 
	public static void main(String[] args) {
	Employee arun = new Employee("Arun", "k",100);
	Employee ravi = new Employee("Ravi","kiran", 200);
	Employee santosh = new Employee("Santosh","m", 300);
LinkedList<Employee> empDetail = new LinkedList<Employee>();
	empDetail.add(arun);
//				empDetail.add(ravi);
//				empDetail.add(santosh);
//			System.out.println(empDetail);
//	for (Employee employee : empDetail) {
//	System.out.println(employee.getFirstName());
//	System.out.println(employee.getLastName());
//	System.out.println(employee.getId());
	System.out.println(arun.getFirstName());			
	
	System.out.println(arun.getLastName());
	System.out.println(arun.getId());
	}
				}
				

