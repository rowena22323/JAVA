package Test2;

class MyClass4{
	static int a;
	static int b;
	static { //static����鸸 �ʱ�ȭ�� �� static�� ���
		a=1;
		b=2;
		System.out.println("Static Initialize");
	}
}
public class Test10 {
	public static void main(String[]args) {
		MyClass4 m = new MyClass4();
	}
}
