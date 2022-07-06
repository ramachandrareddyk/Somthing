package Java_Sessions;

public class IncrementalAndDecrementalOperaters {

	public static void main(String[] args) {

		
		//1.Incremental operators
			//1. Post increment 
		
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int m=-1;
		int n=m++;
		
		System.out.println(m);//0
		System.out.println(n);//-1
		
		
			//2. Pre increment
		int p=1;
		int q=++p;
		
		System.out.println(p);//2
		System.out.println(q);//2
		
		int x=-1;
		int y=++x;
		System.out.println(x);//0
		System.out.println(y);//0
		
		
		//2. Decremental operators
			//1. Post decremt
		
		int r=2;
		int e=r--;
		
		System.out.println(r);//1
		System.out.println(e);//2
		
			//2. Pre decrement
		int s=2;
		int f=--s;
		
		System.out.println(s);//1
		System.out.println(f);//1
		
		int v=2;
		System.out.println(v++);
		System.out.println(v);
		
		
	}

}
