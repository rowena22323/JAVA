package Test1;


class A{
	int aValue;
	public A() {
		System.out.println("Default Constructor A");
		this.aValue = 10;
	}
	public A(int aValue) { //Ŭ�������� ������ �߰�
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class B extends A{
	int bValue;
	public B() { //���ڰ� �ϰ͵� ���� ������
		System.out.println("Default constructor B");
		this.bValue = 100; //Ŭ���� ���� ������� �ڱ� �ڽ��� ��Ī��. �̸� �浹 ����
	}
	public B(int bValue) {
		//super(bValue); //�ٷ� �ڱ� ����Ŭ���� ������ ȣ�� �ش�Ǵ� �����ε��� ������ ȣ��
		this.bValue = bValue;
		System.out.println("constructor B"+this.aValue);
		// �����ڸ� �ٸ��ɷ� ȣ���ϰ� �ʹٰ�? - ��ü�� ���鶧 �Ķ���͸� �ٸ������� �ݾƵ� ���ϴ´�� �ڵ�
	}
}
public class Test6 {
	public static void main(String[]args) {
		B b = new B(100);
		
		// ��Ӱ��迡�� �����ڸ� �����ϸ� �������谡 ���� ȣ���̵ǰ� �״��� ���� ȣ��.
		// ��, ������ü�� �ϴ� ������� ������ ���� ��ü�� ������
		// ��ü �Ӹ��ƴ϶� ������ ���� ��� ����
		// ���� �����ڸ� �ʱ�ȭ �ϸ鼭 ���� �� �ֵ� --?����� �����ұ~
	}

}
