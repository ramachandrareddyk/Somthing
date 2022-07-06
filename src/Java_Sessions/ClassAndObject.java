package Java_Sessions;

public class ClassAndObject {
	String name;
	int age;
	double salary;
	boolean IsActive;
	

	public static void main(String[] args) {
		//class is an entity to define the objecte
		//class is a group of objects which have comman properties
		
		String name="Peter";
		System.out.println(name);
		
		ClassAndObject emp1= new ClassAndObject();
		emp1.name="Tom";
		emp1.age=36;
		emp1.salary=45000.78;
		emp1.IsActive=true;
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		System.out.println(emp1.IsActive);
		
		ClassAndObject emp2= new ClassAndObject();
		emp2.name="John";
		emp2.age=26;
		emp2.salary=450000.78;
		emp2.IsActive=false;
		
		System.out.println(emp2.name);
		System.out.println(emp2.age);
		System.out.println(emp2.salary);
		System.out.println(emp2.IsActive);
		
		System.out.println(emp2.name+" "+emp2.age+" "+emp2.salary+" "+emp2.IsActive);
		
		ClassAndObject emp3=new ClassAndObject();
		emp3=null;
		emp3.name="Testing";
		System.out.println(emp3.name);
		
		//Garbage collector
		
		System.gc();
		
		
		
		
		
	}

}
