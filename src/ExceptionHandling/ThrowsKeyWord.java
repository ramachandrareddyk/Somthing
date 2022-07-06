package ExceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args) throws ArithmeticException{
		ThrowsKeyWord t= new ThrowsKeyWord();
		
		t.m1();
		
	}
	
	public void m1() throws ArithmeticException{
		System.out.println("M1");
		m2();
	}
	public void m2() throws ArithmeticException{
		System.out.println("M2");
		m3();
	}
	public void m3() throws ArithmeticException{
		System.out.println("M3");
		m4();
	}
	public void m4() throws ArithmeticException{
		System.out.println("M4");
		m5();
	}
	public void m5() throws ArithmeticException{
		System.out.println("M5");
		try {
		int i=9/0;} catch(ArithmeticException e) {
			//e.printStackTrace();
		}
	}
	

}
