package Encapsulation;

public class Company {
	
	public String name;
	public int age;
	private int price;
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}

	public static void main(String[] args) {
		Company com= new Company();
		com.name="Tom";
		com.age=34;
		com.price=10000;
		
		com.setPrice(5000);
		System.out.println(com.getPrice());

	}

}
