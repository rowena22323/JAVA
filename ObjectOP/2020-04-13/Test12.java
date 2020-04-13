package Test2;

class A{
	void aMethod() {System.out.println("aMethod");}
}	// public, default, protected만 가능
class B extends A{
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on B class");}
	// 이름은 그대로 사용하면서 B클래스의 A메소드용으로 재정의
}  	// 오버라이딩된 메소드로 자동호출된다.
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
		
//		B b = new B(); //디폴트생성자 호출
//		b.aMethod(); //객체 b가 상위 클래스인 A의 메소드도 사용한다.
//		b.bMethod(); //이건 원래 b가 가지고 있는것.
//		A a = b; //암시적 캐스팅 (자동) 
//		// A a1 = new B(); b객체를 a타입으로 객체생성
//		a.aMethod(); 
//		B b1 = (B)a; //명시적 캐스팅 ; 부모에서 자식으로 형변환 a,b 메소드 둘다가능
//		b1.aMethod();
//		b1.bMethod();
//		
//		C c = new C(); //클래스 C객체생성
//		c.aMethod(); 
//		c.cMethod(); //형제간에는 상속이 안되니까 a,c메소드만 가능
//		A a2 = c; 
//		a2.aMethod();//클래스 C객체 A를 상위로 보내서
//		C c1 = (C)a2; //올라갔던 C객체 다시 끌고내려오기
//		c1.aMethod(); //C객체용의 a메소드
//		c1.cMethod();
//		
//		B b2 = new B ();
//		A a2 = b2;
//		a2.aMethod();
//		// 다형성 - 객체상속 구조에서 같은 메소드로 다른 특성들을 출력\
//		// 인터페이스와 추상클래스에서 중요한 개념.... ㅠㅠ
//		
//		C c2 = new C();
//		A a3 = c2;
//		a3.aMethod();
	}

}
