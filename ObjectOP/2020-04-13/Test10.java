package Test2;

class MyClass4{
	static int a;
	static int b;
	static { //static멤버들만 초기화할 때 static블럭 사용
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
