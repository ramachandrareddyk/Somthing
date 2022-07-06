package Java_Sessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1-10
		
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 * System.out.println("4");
		 */
		System.out.println("-------------While loop-----------------");
		//while loop
		int i=1;//initialization
		while(i<=10) {//condition
			System.out.println(i);//print statement
			//i++;//increment or decrement
			//i=i+1;
			++i;
		}
		
		int k=0;
		while(k<9) {
			System.out.println(k);
			k++;
		}
		System.out.println("-------------For loop-----------------");

		for(int j=0;j<=10;j++) {
			System.out.println(j);
		}
		
		for(int j=0;j<=10;) {
			System.out.println(j);
			j++;
		}
		
		int x=1;
		for(x=1;x<=100;x++) {
			System.out.println(x);
		}
		
		/*
		 * for(;;) { System.out.println("Bye..."); }
		 */
		
		for(int c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
		
		
		System.out.println("----------------break-------------------");
		for (int j = 0; j <=10; j++) {
			System.out.println(j);
			if(j%5==0) {
				System.out.println("Hello....");
				break;
			}
			
		}
		
		System.out.println("-------------even numbers---------------------");//2,4,6...
		
		
		  for(int j=1;j<=100;j++) { 
			  if(j%2==0) { 
				  System.out.println(j); } }
		 
		
		for(int j=2;j<=100;j=j+2) {
			System.out.println(j);
		}
		
		System.out.println("-------------Odd numbers---------------------");//2,4,6...
		for(int j=1;j<=100;j=j+2) {
			System.out.println(j);
		}
		
		for(int j=1;j<=100;j++) { 
			  if(j%2!=0) { 
				  System.out.println(j); } }
		
		System.out.println("-------------------Reverse numbers------------------");
		
		for(int j=10;j>=0;j--) {
			System.out.println(j);
		}
		
		//do-while loop
		System.out.println("-------------------do while loop------------------");
		int r=1;//initialization
		do {
			System.out.println(r);
			r++;//100
		}while(r<100);
	}
	
	//assignment 
	//prime nimbers  -2, 3, 5, 7, 11, 13, 17, 19
	

}
