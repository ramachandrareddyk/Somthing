package ExceptionHandling;

public class fainalyBlock {

	public static void main(String[] args) {
		try {
			int a=9/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Bye...");
		}
		
		//Make DB connection
		//Get dat using sql query
		//close connection ---finally block
		
	int i=	getNum("tom");
	System.out.println(i);

	}
	
	public static int getNum(String name) {
		if(name.equals("tom")) {
			try {
				int marks=90/2;
				return marks;
			} catch (ArithmeticException e) {
				return 40;
			} finally {
				return 100;
			}
		} else if(name.equals("Ravi")){
			return 100;
		} else {
			return 50;
		}
	}

}
