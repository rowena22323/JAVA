package Test2;


class A11{
	void amethod() {System.out.println("aMethod");}
	// final : �޼ҵ� �� - �������̵� ����/Ŭ������ �� - ��ӵ� ����
}
class B11 extends A11{
	void bmethod() {System.out.println("bMethod");}
	void amethod() {System.out.println("aMethod on B Class");}
}
class C11 extends B11{
	void cmethod() {System.out.println("cMethod");}
	void amethod() {System.out.println("aMethod on C Class");}
}
public class Test14 {
	public static void main(String[]args) {
		A11 a = new C11 ();
		a.amethod(); //���ܰ� ����� �Ǵ��� �������̵� �� �޼ҵ尡 ���´�.
		
	}
}
