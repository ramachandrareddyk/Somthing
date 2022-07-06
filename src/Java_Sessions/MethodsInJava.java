package Java_Sessions;

public class MethodsInJava {

	//We can't create the duplicate methods
	//We can't create methods inside the method
	//we can return only one value at atime
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello Testing...");

		MethodsInJava obj= new MethodsInJava();
		obj.test();
		
		int x=obj.sum();
		System.out.println(x);
		
		String name=obj.getTrainarName();
		
		//System.out.println(name);
		
		System.out.println(obj.getTrainarName());
		
		System.out.println(obj.add(20, 40));
		
		System.out.println(obj.add(108, 229));
		
		obj.adding(49, 67);
		
	}
	
	//1. No input and No Return
	public void test() {
		System.out.println("Test Method....");
	}
	
	//2. No input and But some return
	//return type is : int
	public int sum() {
		System.out.println("Sum method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String getTrainarName() {
		System.out.println("get Trainer name");
		
		String name="Ramachandra";
		
		return name;
	}
	
	//3. Some input and some return
	
	public int add(int a, int b) {
		System.out.println("Add method");
		
		int sum=a+b;
		
		int x=a+b;
		
		return x;
	}
	
	//4 some inputs and no return
	public void adding(int a, int b) {
		System.out.println(a+b);
	}

}
