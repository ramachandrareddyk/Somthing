package Java_Sessions;

import java.util.ArrayList;

public class Company {
	
	String name;
	int employeeCount;
	//return string dairectly without variable
	public String  getCEOName() {
		return "Tom";
	}
	
	//return int dairect;y without variable
	public int companyTotalEmp() {
		return 460;
	}
	
	//return array
	
	public String[] companyFounders() {
		String founders[]=new String[3];
		founders[0]="Tom";
		founders[1]="Peter";
		founders[2]="Phill";
		
		return founders;
		
	}
	
	public ArrayList<String> employeesList() {
		ArrayList<String>empNames=new ArrayList<String>();
		empNames.add("Manoj");
		empNames.add("Srinivas");
		empNames.add("Mani");
		empNames.add("ARun");
		
		return empNames;
	}
	
	public static void main(String[] args) {
		Company com= new Company();
		
		System.out.println(com.getCEOName());
		
		System.out.println(com.companyTotalEmp());
		
		String names[]=com.companyFounders();
		
		for(String e:names) {
			System.out.println(e);
		}
		
		ArrayList<String>empNames=com.employeesList();
		
		for(String e:empNames) {
			System.out.println(e);
		}
	}

}
