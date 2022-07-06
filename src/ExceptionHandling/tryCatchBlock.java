package ExceptionHandling;

public class tryCatchBlock {
	
	//1. Try
	//2. Catch
	//3. Finally
	//4. throws
	//5. throw
String s;
	public static void main(String[] args) throws Exception {
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");
		tryCatchBlock t= new tryCatchBlock();
		t=null;
		try {
			
			t.s="Tom";
			System.out.println(10/0);
			
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");

	}

}
