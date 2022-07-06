package Inheritence;

public class BB extends AA{
	
	public void write() {
		System.out.println("Write");
	}

	public static void main(String[] args) {
		BB b= new BB();
		b.write();
		b.pen();
	}
}
