package Abstraction;

public class Hero extends Bike{

	public static void main(String[] args) {
		Bike b= new Hero();
		b.run();

	}

	
	void run() {
		System.out.println("Run hero bike");
		
	}

}
