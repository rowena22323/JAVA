package Test2;

class MyClass3{
	int a;
	static int b; //ȿ������ �޸� ��� ����.
	public static void setAVlaue(int x) {
		b=x; //static������ static������ ȣ�Ⱑ��. class�� int a�� ȣ�� ���Ѵ�
	}
	public void setBValue(int y) {
		a=y; //static�� �ƴ� �޼ҵ忡���� class���� ȣ�Ⱑ��
		// MyClass3.setAValue(10);
		
	}
}
public class Test9 {
	public static void main (String[]args) {
		MyClass3.b = 20;
		MyClass3 m = new MyClass3();
		m.a = 10;
		m.b = 20;
	}
}
