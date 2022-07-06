package Interface;

public class FireFoxBrowser implements Webdriver{
	@Override
	public void launchBrowser() {
		System.out.println("Lanch fire fox browser");
		
	}

	@Override
	public void launchURL() {
		System.out.println("Lanch Flipkart");
		
	}

	@Override
	public void navigate() {
	System.out.println("Navigate from flipkart to amazon");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh the page");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find all elements");
		
	}

	@Override
	public void getWindowHandiles() {
		System.out.println("Handile multiple windows");
		
	}
}
