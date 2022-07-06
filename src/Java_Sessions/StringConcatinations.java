package Java_Sessions;

public class StringConcatinations {

	public static void main(String[] args) {
		
		String s="HelloTesting";
		
		System.out.println(s);
		
		String s1="20";
		System.out.println(s1);
		
		int i=20;
		int i1=30;
		
		String x="Hello";
		String y="Selenium";
		
		String x1="20";
		String y1="30";
		
		System.out.println(i+i1);//50
		System.out.println(x+y);//HelloSelenium
		
		System.out.println(x1+y1);//2030
		
		System.out.println(i+x1);//2020
		
		System.out.println(i+i1+x+y);//50HelloSelenium
		
		System.out.println(i+x1+i1+y1);//20203030
		
		System.out.println(x1+y1+(i+i1));//203050
		
		//Mathamatical operators  + - * / %
		
		int a=10;
		int b=2;
		
		int c=a+b;
		System.out.println(c);
		
		int d=a-b;
		System.out.println(d);
		
		int e=a*b;
		System.out.println(e);
		
		int f=a/b;
		System.out.println(f);
		
		int g=a%b;
		System.out.println(g);
		
		int a1=10;
		int b1=3;
		
		System.out.println(a1/b1);//3
		System.out.println(a1%b1);//1
		

	}

}
