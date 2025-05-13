package javaPrograms;

public class Greetings {
		
//	1 No Parameters No Return Value
	
	void m1() {
		System.out.println("Hello");
	}
	
//	2 No Parameters Return Value
	
	String m2() {
		return ("Hello, How are You?");
	}
	
//	3 Parameter No Return Value
	
	void m3(String name) {
		System.out.println("Hello "+name);
	}
	
//	4 Parameter Return Value
	
	String m4(String name) {
		return("How Old are you "+name);
	}
}
