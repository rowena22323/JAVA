package Test2;


class A11{
	void amethod() {System.out.println("aMethod");}
	// final : 메소드 앞 - 오버라이드 끊김/클래스명 앞 - 상속도 끊김
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
		a.amethod(); //세단계 상속이 되더라도 오버라이드 된 메소드가 나온다.
		
	}
}
