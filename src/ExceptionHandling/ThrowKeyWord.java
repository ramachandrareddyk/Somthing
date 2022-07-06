package ExceptionHandling;

public class ThrowKeyWord {

	public static void main(String[] args) {
		String s=null;
		
		if(s==null) {
			System.out.println("Bye,...");
		} try {
			throw new Exception("Excel value exception");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
