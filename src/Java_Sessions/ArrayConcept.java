package Java_Sessions;

import java.util.Iterator;

public class ArrayConcept {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		b=30;
		
		System.out.println(b);
		
		
		String s="Ram";
		String x="Ravi";
		
		x="Ranjan";
		
		//1. Static array
		//2. Dynamic array
		
		int i[] = new int[6];//0
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[4]=50;
		i[5]=60;
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		//System.out.println(i[6]);
		//System.out.println(i[-1]);
		
		System.out.println("LI = "+0);
		System.out.println(i.length);
		System.out.println("Highest index ="+(i.length-1));
		System.out.println("--------------Print all values from array-----------------");
		//to print all the values we have to use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("-----------------------------");
		
		for (int j = 0; j <=i.length-1; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("---------------for each loop-----------------");
		for(int e:i) {
			System.out.println(e);
		}
		//double array
		double d[]= new double[5];

		d[0]=12.33;
		d[1]=34.76;
		d[3]=102.36;
		System.out.println("-------------for loop-----------");
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		System.out.println("-------------for each loop-----------");
		for(double e:d) {
			System.out.println(e);
		}
		
		//char array
		char c[]= new char[4];
		c[0]='w';
		c[1]='R';
		for(char e:c) {
			System.out.println(e);
		}
		
		String names[]=new String[5];
		names[0]="Ravi";
		names[1]="Ranjan";
		names[2]="Gopi";
		
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
		
		//Limitations of an array
		//1.Size is fixed: Static array to over come this we have to use array list
		//2. Only similar type of data
		
		// to over come the above limitation we have to use "Object class"
		
		Object student[] = new Object[10];
		student[0]=15;
		student[1]="Suresh";
		student[3]=16;
		student[4]="12/12/2005";
		student[5]='M';
		for (int j = 0; j < student.length; j++) {
			System.out.println(student[j]);
		}
		
		for(Object e:student) {
			System.out.println(e);
		}
		System.out.println("------------nested for loop-------------");
		for (int j = 2; j < 100; j++) {
			for (int j2 = 2; j2 <=j; j2++) {
				if(j==j2) {
					System.out.println(j);
				} if(j%j2==0) {
					break;
				}
			}
		}
		
		
		int m[]= {4,9,3,8,4,5,1};
		int n[]= {9,1,0,3,7,6,5};
		
		//output=9, 3, 5
		System.out.println("-------Solution-----------");
		for (int j = 0; j < m.length; j++) {
			for (int j2 = j+1; j2 < m.length; j2++) {
				if(m[j]==m[j2]) {
					System.out.println(m[j]);
				}
				
			}
			
		}
		System.out.println("-----------comman values from two arrays------------");
		for (int j = 0; j < m.length; j++) {
			for (int j2 = 0; j2 < n.length; j2++) {
				if(m[j]==n[j2]) {
					System.out.println(m[j]);
				}
				
			}
		}
		
		
		
	}

}
