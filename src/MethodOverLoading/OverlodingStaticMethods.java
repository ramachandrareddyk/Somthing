package MethodOverLoading;

public class OverlodingStaticMethods {
	String name;
	static int age;
	
	
	public void m1() {
		System.out.println("this is M1");
	}
	
	public static void m2() {
		System.out.println("This is M2");
	}
 
	public static void main(String[] args) {
		OverlodingStaticMethods obj= new OverlodingStaticMethods();
		obj.name="Testing";
		obj.m1();
		
		age=25;
		m2();
		obj.m2();
		OverlodingStaticMethods.m2();

	}
	public static void login() {
		System.out.println("Login");
	}
	
	public void login(String a) {
		
	}

}
