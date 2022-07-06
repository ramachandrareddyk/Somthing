package Abstraction;

public class Honda extends Bike{

	public static void main(String[] args) {
		Bike b= new Honda();
		b.run();
		

	}
//method overriding
	//chaild class or sub class having same mathod with same parameters 
	// that is called as method overriding
	
	void run() {
		System.out.println("Running safely");
		
	}

}
