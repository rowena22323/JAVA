package Test2;

class A{
	void aMethod() {System.out.println("aMethod");}
}	// public, default, protected�� ����
class B extends A{
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on B class");}
	// �̸��� �״�� ����ϸ鼭 BŬ������ A�޼ҵ������ ������
}  	// �������̵��� �޼ҵ�� �ڵ�ȣ��ȴ�.
class C extends A{
	void cMethod() {System.out.println("cMethod");}
	void aMethod() {System.out.println("aMethod on C class");}
}

public class Test12 {
	static void callMethod(B b) {
		b.aMethod();
	}
	static void callMethod(C c) {
		c.aMethod();
	}
	
	public static void main(String[] args) {
		callMethod(new B());
		callMethod(new C());
		
//		B b = new B(); //����Ʈ������ ȣ��
//		b.aMethod(); //��ü b�� ���� Ŭ������ A�� �޼ҵ嵵 ����Ѵ�.
//		b.bMethod(); //�̰� ���� b�� ������ �ִ°�.
//		A a = b; //�Ͻ��� ĳ���� (�ڵ�) 
//		// A a1 = new B(); b��ü�� aŸ������ ��ü����
//		a.aMethod(); 
//		B b1 = (B)a; //����� ĳ���� ; �θ𿡼� �ڽ����� ����ȯ a,b �޼ҵ� �Ѵٰ���
//		b1.aMethod();
//		b1.bMethod();
//		
//		C c = new C(); //Ŭ���� C��ü����
//		c.aMethod(); 
//		c.cMethod(); //���������� ����� �ȵǴϱ� a,c�޼ҵ常 ����
//		A a2 = c; 
//		a2.aMethod();//Ŭ���� C��ü A�� ������ ������
//		C c1 = (C)a2; //�ö󰬴� C��ü �ٽ� ����������
//		c1.aMethod(); //C��ü���� a�޼ҵ�
//		c1.cMethod();
//		
//		B b2 = new B ();
//		A a2 = b2;
//		a2.aMethod();
//		// ������ - ��ü��� �������� ���� �޼ҵ�� �ٸ� Ư������ ���\
//		// �������̽��� �߻�Ŭ�������� �߿��� ����.... �Ф�
//		
//		C c2 = new C();
//		A a3 = c2;
//		a3.aMethod();
	}

}
