package Encapsulation;

public class TestCom {

	public static void main(String[] args) {
		Company obj= new Company();
		obj.name="Peter";
		obj.age=45;
		obj.setPrice(10000);
		System.out.println(obj.getPrice());

	}

}
