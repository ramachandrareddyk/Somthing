package Inheritence;

public class C extends B{
	
	void weep() {
		System.out.println("Animal is weeping");
	}
	
	public static void main(String[] args) {
		C c= new C();
		c.bark();
		c.weep();
		c.eat();
	}

}
