package capsul;

public class classTest2 {

	public static void main (String[]args) {
		dog d = new dog(); //-9
		animal a=d; //type 하위타입의 상위타입으로의 형변환 -99
		a.breath(); //제한된 converting
		dog d1 = (dog)a;
		d1.bark();
		
		animal a1 = new cat(); //-9&-99단축형 breath만 상속받을 수 있음
		a1.breath();
		
		animal all = test3(new dog());
		dog d2 = (dog) all;
		d2.bark(); // 상위클래스밖에 안나오는 타입이었는데 dog속성까지 다받아왔구낭
	}
	static animal test3(animal a) {
		//메소드 하나로 하위클래스 전부 받아서 원하는 타입으로 캐스팅 가능
		//하위 클래스별로 
		return new dog(); //객체는 dog인데 타입은 animal
	}
}
