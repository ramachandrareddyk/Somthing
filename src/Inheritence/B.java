package Inheritence;

public class B extends A{
	
	void bark() {
		System.out.println("Animal is brrking");
	}
	
	public static void main(String[] args) {
		B b= new B();
		b.eat();
		b.bark();
	}

}
