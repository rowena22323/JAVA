package Test1;


class A{
	int aValue;
	public A() {
		System.out.println("Default Constructor A");
		this.aValue = 10;
	}
	public A(int aValue) { //클래스에이 생성자 추가
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class B extends A{
	int bValue;
	public B() { //인자가 암것도 없는 생성자
		System.out.println("Default constructor B");
		this.bValue = 100; //클래스 내의 멤버변수 자기 자신을 지칭함. 이름 충돌 예방
	}
	public B(int bValue) {
		//super(bValue); //바로 자기 상위클라스의 생성자 호출 해당되는 오버로딩된 생성자 호출
		this.bValue = bValue;
		System.out.println("constructor B"+this.aValue);
		// 생성자를 다른걸로 호출하고 싶다고? - 객체를 만들때 파라미터를 다른것으로 닫아도 원하는대로 코딩
	}
}
public class Test6 {
	public static void main(String[]args) {
		B b = new B(100);
		
		// 상속관계에서 생성자를 정의하면 상위관계가 먼저 호출이되고 그다음 하위 호출.
		// 즉, 상위객체가 일단 만들어진 다음에 하위 객체가 생성됨
		// 객체 뿐만아니라 변수도 같이 출력 가능
		// 상위 생성자를 초기화 하면서 받을 수 있데 --?뭔제어가 가능할까나~
	}

}
