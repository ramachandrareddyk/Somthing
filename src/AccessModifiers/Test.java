package AccessModifiers;

public class Test {
	
	//1. Defaulat
	//2. Private
	//3. Protacted
	//4. Public
	
	int a=100;
	
	void m1() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Test t= new Test();
		t.m1();
		t.m2();
		t.m3();
	}
	
	private void m2() {
		System.out.println("This is private method");
	}
	
	protected void m3() {
		System.out.println("This is protecetd method");
	}
	
	public void m4() {
		System.out.println("This is public method");
	}
	


}
