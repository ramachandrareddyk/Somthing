package Java_Sessions;

public class ConditionalOperatoers {

	//compare the values <,>,==,<=,>=
	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		//System.out.println(a==b);
		//if
		if(a==b) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		//dead code
		if(false) {
			System.out.println("Hello...");
		} else {
			System.out.println("Bye...");
		}
		
		String s="Selenium";
		String s1="selenium";
		
		/*
		 * if(s==s1) { System.out.println("Both are same"); } else {
		 * System.out.println("Both are not same"); }
		 */
		
		if(s.equals(s1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		
		//nested if
		
		int marks=80;
		if(marks>=50) {
			System.out.println("Pass");
			if(marks>=70) {
				System.out.println("Grade - B");
				if(marks>=80) {
					System.out.println("Grade - A");
				}
			}
		}
		
		System.out.println("-----------------------------------");
		//if else if
		
		if(marks>=80) {
			System.out.println("Grade -A");
		} else if(marks>=70) {
			System.out.println("Grade -B");
		} else if(marks>=50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		String browser="Chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		} 
		if(browser.equals("FireFox")) {
			System.out.println("Launch firefox browser");
		}
		if(browser.equals("safari")) {
			System.out.println("Launch the safari browser");
		}
		System.out.println("----------------------------------------");
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		} 
		else if(browser.equals("FireFox")) {
			System.out.println("Launch firefox browser");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch the safari browser");
		} else {
			System.out.println("Please pass the correct browser name");
		}
		
		//Write java program find the max number in the given 3 values
		int x=800;
		int y=900;
		int z=700;
		
		if(x>y && x>z) {
			System.out.println("X is the max number");
		} else if(y>z) {
			System.out.println("Y is the max number");
		} else {
			System.out.println("Z is the max number");
		}
		//Assignment find max number using java program
		int l=10;
		int m=0;
		int n=19;
		int o=16;
		int p=22;
		
		double d=12.33;
		double d1=12.33;
		
		if(d==d1) {
			System.out.println("Both are equal");
		}
		
		
		char c='a';
		char c1='a';
		
		if(c==c1) {
			System.out.println("Hello...");
		}

	}

}
