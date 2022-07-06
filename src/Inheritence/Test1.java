package Inheritence;

public class Test1 extends Test{
	
	int bonus=10000;
	
	public static void main(String[] args) {
		Test1 t= new Test1();
		
		System.out.println("Salary is "+ t.salary);
		System.out.println("bonus is "+ t.bonus);
	}

}
