package Test1;

class MyClass {
	//int count;
	static int count; // static 클래스 변수(공유변수)는 메모리에서 프로그램 전체에 공유된다. 
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
