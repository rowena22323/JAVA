package Test1;

class student{
	public void gotoSchool() {
		System.out.println("Student go to School.");
	}
	public void study() {
		System.out.println("Student Study");
	}
}
class MiddleStudent extends student{ //MiddleStudent°¡ Student»ó¼Ó
	public void study2() {
		System.out.println("MiddleSchoolstudent Study");
	}
}

public class Test44 {
	public static void main(String[]args) {
		MiddleStudent stu = new MiddleStudent();
		stu.gotoSchool();
		stu.study();
		stu.study2();
	}
}
