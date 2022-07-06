package Java_Sessions;

public class StringManupulations {

	public static void main(String[] args) {
		String str="Hello this is my first java code";
		//length
		int length=str.length();
		System.out.println(length);
		
		System.out.println(str.length());
		
		System.out.println("Li ="+0);
		
		System.out.println("Hi ="+(str.length()-1));
		
		//CharAt
		System.out.println(str.charAt(6));
		
		System.out.println(str.charAt(31));
		
		//indexOf
		
		System.out.println(str.indexOf("H"));
		
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("d"));
		
		System.out.println(str.indexOf("java"));
		
		//String comparission
		String s="Testing";
		String s1="testing";
		
		if(s.equals(s1)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		
		if(s.equalsIgnoreCase(s1)){
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		
		if(s1==s) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		//String trim
		
		String x="     Hello Testing     ";
		
		System.out.println(x);
		
		System.out.println(x.trim().replace(" ", ","));
		
		//replace
		
		String DOB="01/01/2020";//-
		
		System.out.println(DOB.replace("/", "-"));
		
		//Upper case
		
		String y="automation testing";
		
		System.out.println(y.toUpperCase());
		
		//lower case
		String z="SELENIUM TESTING";
		System.out.println(z.toLowerCase());
		
		//contains
		String x1="Your browser name is chrome";
		if(x1.contains("chrome")) {
			System.out.println("Launch chrome browser");
		}
		
		//split
		String words[]=x1.split(" ");
		System.out.println(words[0]);
		
		for(String e:words) {
			System.out.println(e);
		}
		
		String x2="java;python;SQL;Javascript;ruby";
		
		System.out.println(x2);
		String arr[]=x2.split(";");
		for(String e:arr) {
			System.out.println(e);
			
		}
		//sub string
		
		String main="Your total salary is 36000";
		
		System.out.println(main.substring(5));
		
		System.out.println(main.substring(10));
		
		System.out.println(main.substring(5, 10));
		
		
		
		String a="Ramachandra";//11, 10
		//ouput=ardnahcamar
		
		StringBuffer a1=new StringBuffer(a);
		System.out.println(a1.reverse());
		
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);

	}

}
