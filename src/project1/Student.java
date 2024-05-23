// qn1) class
package project1;

public class Student {
String name = "zake";
String address = "kathmandu";
int phone = 123456789;
	public static void main(String[] args) {
		// for 1st output
		Student Studentobject= new Student();
		System.out.println(Studentobject.name);
		System.out.println(Studentobject.address);
		System.out.println(Studentobject.phone);
		
// for 2nd output
		System.out.println(Studentobject.name+ Studentobject.address+ Studentobject.phone);
		
// for 3rd output
		System.out.println(Studentobject.name+" "+ Studentobject.address+ " "+ Studentobject.phone);
	}

}
