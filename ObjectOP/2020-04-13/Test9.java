package Test2;

class MyClass3{
	int a;
	static int b; //효율적인 메모리 사용 가능.
	public static void setAVlaue(int x) {
		b=x; //static에서는 static변수만 호출가능. class의 int a는 호출 못한당
	}
	public void setBValue(int y) {
		a=y; //static이 아닌 메소드에서는 class변수 호출가능
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
