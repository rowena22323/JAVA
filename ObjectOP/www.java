package class2;

class Student2{
	public Student2() { //���� �����ڴ�!!!
		//Ŭ���� �̸��ϰ� �����ѵ� public�� ������ return�ϰ͵� ������ �����ڶ��
		System.out.println("Default Constructor");
		name="������";
		//�ϰ͵� �Է� �������� �������� ���;� �Ǵµ� ���� �ȵǳ�
	}
	private String name; 
	//�̰Ž� ������� �̸� ������� ���� - �Լ��� ���Ǵ� �������� �տ� ����
	// �����ϰ� ������ ���α׷����� ���� ���� �������� private���� ������
	//String name;
	
	public void setName(String nm) { //��� �޼ҵ�
		name=nm;
	}
	public String getName() {
		return name;
	}
	public void gotoSchool() {
		System.out.println(name+"�� �б��� ����.");
	}
}
public class www {
	
	public static void main(String[]args) {
//		Student2 stu = new Student2();
//		stu.setName("�̼���");
//		//���ú����� private���� ĸ��ȭ�Ǿ������� name����� �ȵȴ�
//		stu.gotoSchool();
//		execute(stu);
//		
//		Student2 stu2 = new Student2();
//		stu2.setName("������");
//		stu2.gotoSchool();		
//		execute(stu2);
		
		Student2 stu3 = new Student2();
		Student2 t2 = execute(stu3);
		Student2 t3 = execute(new Student2());
	}

	static Student2 execute(Student2 s) {
		s.gotoSchool(); //ĸ��ȭ�� �Ǿ��ִ��� ���۷����� ��� �Ѱܼ� ���
		return s;
	//Student2 s = execute(new Student2()) �� �̰ǹ��� �Լ������� �����ٿ� �Ѵٴ°ž�?
		
		/* Ŭ������ ��û�� �߿伺�� ���� ���� �����ϰ� ����Ұ�
		 * Ÿ�Ը� �߰��ϸ� �ڿ� �� �������� �����ϰ� ȿ�������� ��ó�� �� �ִ�.
		 * ��ü���� ���α׷����� ���� ū ��ǥ > reproducibility / modularization
		 * JVM garbage collector*/
	}
}
