package Test1;

class MyClass {
	//int count;
	static int count; // static Ŭ���� ����(��������)�� �޸𸮿��� ���α׷� ��ü�� �����ȴ�. 
	public MyClass() {
		count++;
		System.out.println(count);
	}
}
public class Test8 {
	public static void main(String[]args) {
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		MyClass myClass3 = new MyClass();
	}

}
