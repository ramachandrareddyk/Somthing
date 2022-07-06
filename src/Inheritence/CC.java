package Inheritence;

public class CC extends AA {

	
	public void brek() {
		System.out.println("Break the pen");
	}
	
	public static void main(String[] args) {
		CC c= new CC();
		c.brek();
		c.pen();
		
	}
}
