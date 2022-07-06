package Encapsulation;

public class Chrome {
	
	
	public static void main(String[] args) {
		Chrome c= new Chrome();
		
		c.launchChromeBrowser();
	}
	
	public void launchChromeBrowser() {
		checkBrowserOSversion();
		checkBrowserVersion();
		checkRAMSpace();
		
		System.out.println("Chrome browser is launched....");
	}
	
	
	

	private void checkBrowserVersion() {
		System.out.println("Check browser version...");
	}
	
	private void checkBrowserOSversion() {
		System.out.println("Check browser OS version...");
	}
	
	private void checkRAMSpace() {
		System.out.println("Check RAM space...");
	}
}



