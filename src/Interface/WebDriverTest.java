package Interface;

public class WebDriverTest {

	public static void main(String[] args) {
		Webdriver driver= new ChromeBrowser();
		
		driver.launchBrowser();
		
		driver.launchURL();
		
		Webdriver driver1= new FireFoxBrowser();
		
		driver1.launchBrowser();
		
		driver1.launchURL();

	}

}
