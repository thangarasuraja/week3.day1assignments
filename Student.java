package org.assignment4;

public class Student {
	
	public void getStudentInfo(int id) {
		id=96;
		System.out.println("student ID :"+id);
	}
	
	public void getStudentInfo(int id,String name) {
		id=96;
		name="Thangarasu raja";
		System.out.println("student ID :"+id+" & name :"+name);
		}
	
	public void getStudentInfo(String email,String phone) {
		email="thangarasuraja@gmail.com";
		phone="9894613484";
		System.out.println("student ID :"+email+" & phone no :"+phone);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student details=new Student();
		details.getStudentInfo(0);
		details.getStudentInfo(0, null);
		details.getStudentInfo(null, null);
	}

}
