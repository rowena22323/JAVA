package javaTest;

class Employee {
	String name; //���¸� ��Ÿ���� ����
	int age =20; 
	void gotoWork() { //������ ��Ÿ���� �޼ҵ�
		System.out.println(name+","+age+"�� ����� ���� �Ѵ�");
	}
}
 /* ������ �̽��͸��� �ڹ��� ��ü���� ���α׷����� �����ص� ���ظ� ���� �𸣰ڳ� */
public class wtf {

	public static void main(String[] args) {
		// value - type vs reference type\
		// JVM�� �Ϲ��� �޸� �ڷᱸ�� (stack / heap) 
		int a=1;
		int b=a; //stack b�� �޸� �ּҿ� a�� �� 1�� �����
		
		Employee emp = new Employee(); 
		//instance���� ����� employee�� heap������ ���� > emp�� heap�� ����� Employee���� (�޼ҵ� ����)
		emp.gotoWork();
		emp.name="�̼���";
		emp.age +=10;
		emp.gotoWork();
		
		

	}

}
