//qn3) overriding existing values
package project1;

public class MyInfo {
private String name="zake";
private String address="kathmandu";
private int phone =123456789;

	
	
	public static void main(String[] args) {
		MyInfo MyInfoobj= new MyInfo();
		System.out.println(MyInfoobj.name="jolie");
		System.out.println(MyInfoobj.address="lalitpur");
		System.out.println(MyInfoobj.phone=977654321);

	}

}
