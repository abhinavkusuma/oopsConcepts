package javaPrograms;

public class GreetingsDetails {

	public static void main(String[] args) {
		
		Greetings greetings = new Greetings();
		greetings.m1();
		
		String string = greetings.m2();
		System.out.println(string);
		
		greetings.m3("Abhinav");
		
		String st = greetings.m4("Bhanu");
		System.out.println(st);
	}
}
