package javaPrograms;

public class School {
	int sid;
	String sname;
	char sgrade;
	
	void SchoolDetails() {
		System.out.println("Student Id : "+sid+" Student Name : "+sname+" Student Grade : "+sgrade);
	}
	
	void SchoolsDetails(int id,String name,char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
//		System.out.println(id+name+grade);
	}
	
	School(int id,String name,char grade) {
		sid=id;
		sname=name;
		sgrade=grade;
//		System.out.println(id+name+grade);
	}	
}