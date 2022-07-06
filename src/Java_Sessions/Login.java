package Java_Sessions;

public class Login {
	
	String username;
	String password;
	String title;
	String URL;
	
	//this is the class template

	public static void main(String[] args) {
	Login log= new Login();
	
	log.username="Admin";
	log.password="Test@123";
	log.title="Login";
	log.URL="www.google.in";
	
	Login amazon= new Login();
	amazon.username="Ramachandra";
	amazon.password="Test@123";
	
	
	Login whatsapp=new Login();
	whatsapp.username="Ramachandra";
	whatsapp.password="Test@123";
	
	System.out.println(log.username);
	System.out.println(amazon.username);
	System.out.println(whatsapp.username);

	}

}
