package Interface;

public class A implements Printable{

	
	public void print() {
		System.out.println("print somthing...");
		
	}

	
	public void test() {
		System.out.println("Test somthing....");
		
	}
	
	public static void main(String[] args) {
		A a= new A();
		a.test();
		a.print();
		
		Printable p= new A();
		p.test();
		p.print();
	}

}
