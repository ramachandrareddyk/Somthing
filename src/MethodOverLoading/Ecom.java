package MethodOverLoading;

public class Ecom {
	
	//Class having Multiple methods
	//With same name
	//With differenrt parameters and different number of parameters

	public void login() {
		System.out.println("Login");
	}
	
	public void login(int otp) {
		System.out.println("Login with otp");
	}
	
	public void login(int x, int y) {
		System.out.println("Login with Mobile number and otp");
	}
	
	public void login(String username, String pass) {
		System.out.println("Login with username and password");
	}
	
	public static void main(String[] args) {
		Ecom e= new Ecom();
		e.login();
		e.login(234567);
		e.login(123,456);
		e.login("test","Testing");
	}
	
	
	//product search
	
	public void search() {
		System.out.println("Search");
	}
	
	public void search(String name) {
		System.out.println("Search with product name");
	}
	
	public void search(String name, int price) {
		System.out.println("Search with product name and price");
	}
	public void search(String name, String color) {
		System.out.println("Search with product name");
	}
	
	public void search(String name, String productcolor, int price) {
		System.out.println("Search with product name");
	}
	
	
	
}
