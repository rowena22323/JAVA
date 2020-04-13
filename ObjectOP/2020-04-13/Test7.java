package Test1;

class Student4{
	String name;
	public Student4 (String name) {
		this.name = name;
	}
}

class MiddleStudent3 extends Student4{
	int age;
	public MiddleStudent3(String name, int age) {
		super("ȫ�浿"); //this.name="ȫ�浿"
		this.age = age;
		System.out.println(name+","+age);
	}
}

public class Test7{
	public static void main(String[]args) {
		MiddleStudent3 stu = new MiddleStudent3("ȫ�浿", 14);
		
	}
}
