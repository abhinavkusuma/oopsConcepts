package javaPrograms;

public class StudentDetails {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 101;
		student.name = "Abhinav";
		student.stream = "CSE";
		student.grade = 'S';
		student.details();
		 
		System.out.println("-----------------------");
		
		Student stud = new Student();
		stud.id = 105;
		stud.name = "Sai";
		stud.stream = "ECE";
		stud.grade = 'A';
		stud.details();
	}
}