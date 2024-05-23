package project1;

public class TestConstructor {

	String name;
	String address;
	private char[]n;
	private char[]m;
	TestConstructor()
	{
		System.out.println("constructor call");
		name="garima";
		address="syangja";
		}
	void value (String n, String m)// parametarized constructor
	{
		name=n;
		address=m;
	}
	public static void main(String[] args) {
		TestConstructor obj = new TestConstructor();
		system.out.println("The name is" + obj.name);
		system.out.println( obj.address);
	}
	public static void main1(String[] args )
	{
		TestConstructor data = new TestConstructor();
		system.out.println(data.n);
		system.out.println(data.m);
	}

}
