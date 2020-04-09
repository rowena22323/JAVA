package javaTest;

class Employee {
	String name; //상태를 나타내는 변수
	int age =20; 
	void gotoWork() { //동작을 나타내는 메소드
		System.out.println(name+","+age+"인 사람이 일을 한다");
	}
}
 /* 참으로 미스터리한 자바의 객체지향 프로그래밍을 지금해도 이해를 할지 모르겠네 */
public class wtf {

	public static void main(String[] args) {
		// value - type vs reference type\
		// JVM의 일반적 메모리 자료구조 (stack / heap) 
		int a=1;
		int b=a; //stack b의 메모리 주소에 a의 값 1이 복사됨
		
		Employee emp = new Employee(); 
		//instance에서 선언된 employee를 heap공간에 적재 > emp는 heap에 적재된 Employee참조 (메소드 포함)
		emp.gotoWork();
		emp.name="이순신";
		emp.age +=10;
		emp.gotoWork();
		
		

	}

}
