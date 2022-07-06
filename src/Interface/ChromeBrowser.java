package Interface;

public class ChromeBrowser implements Webdriver{

	@Override
	public void launchBrowser() {
		System.out.println("Lanch chrome browser");
		
	}

	@Override
	public void launchURL() {
		System.out.println("Lanch face book");
		
	}

	@Override
	public void navigate() {
		System.out.println("navigate flipkart to myntra");
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
