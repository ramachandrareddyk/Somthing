package Java_Sessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList is the default class in java
		//Dynamic array
		//Size is not fixed
		//Index basis maintain the order
		//To create an arrayList we have to create any ArrayList object
		
		//0,1,2,3
		
		ArrayList ar= new ArrayList();
		ar.add(100);//0
		ar.add("Santhosh");//1
		ar.add(true);//2
		ar.add(350000);//3
		ar.add("Bangalore");//4
		
		System.out.println(ar.size());//5
		
		System.out.println("L I = "+0);
		System.out.println("H I = "+(ar.size()-1));
		
		ar.add(5000);
		ar.add("test");
		System.out.println(ar.size());//7
		
		System.out.println(ar.get(0));//100
		
		//System.out.println(ar.get(-1));
		
		//System.out.println(ar.get(7));
		
		ar.remove(3);
		System.out.println(ar.size());//6
		System.out.println(ar.get(3));
		System.out.println("-----------Get valies using for loop-----------");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Genarics in java
		
		//Student names -String
		//Student marks -int
		
		System.out.println("-------------String array------------");
		ArrayList<String> studentNames=new ArrayList<String>();
		
		studentNames.add("Tom");
		studentNames.add("Peter");
		studentNames.add("Phill");
		studentNames.add("3456");
		for(String e:studentNames) {
			System.out.println(e);
		}
		System.out.println("-------------Int array------------");
		ArrayList<Integer> studentId=new ArrayList<Integer>();

		studentId.add(100002);
		studentId.add(100003);
		studentId.add(100004);
		
		for(int e:studentId) {
			System.out.println(e);
		}
		
		ArrayList<Object>empData=new ArrayList<Object>();
		empData.add("Sinija");
		empData.add(100067);
		empData.add(true);
		empData.add('F');
		empData.add(46000.78);
		for(Object e:empData) {
			System.out.println(e);
		}
		
		for (int i = 0; i < empData.size(); i++) {
			
			if(empData.get(i).equals("Sinija")) {
				System.out.println("Employee name is Sinija");
				break;
			}
		}
		
		//Real time use case
		//100 link s in the page
		//to store this all links we have to use arrayList
		//Start loop
		
		
	}

}
