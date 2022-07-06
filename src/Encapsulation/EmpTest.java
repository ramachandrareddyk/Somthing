package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
		
		emp.setAge(45);
		emp.setCity("BANGALORE");
		emp.setSalary(56000);
		
		System.out.println(emp.getAge());
		System.out.println(emp.getCity());
		System.out.println(emp.getSalary());

	}

}
