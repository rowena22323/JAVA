package capsul;

public class classTest3 {
	public static void main(String[]args) {
		dog d = new dog();
		d.breath();;
		d.bark();;
		cat c = new cat();
		c.breath();
		c.mew();
		//여기까진 그냥 속성 불러오기
		
		animal a=d; //dog의 객체 d를 animal 클래스의 a에 저장 
		a.breath(); //dog object, animal type 
		dog d2 = (dog) a; // 상위타입 암시적 캐스팅 : a는 breath밖에 안됐었는데!!
		d2.bark(); //bark도 된다니!
		d2.breath();
		
		animal a1=c;
		a1.breath(); //cat object, animal type
		cat c2 = (cat) a;
		c2.mew();
		c2.breath();
		
		animal a3 = new dog();
		a3.breath();
		dog d3 = (dog) a3;
		d3.bark();
		d3.breath();
		
//		animal a10 = new animal();
//		dog d10 = (dog)a10; //상위속성이 하위객체에서 구현될 수는 없음
		
//		dog d11 = new dog();
//		animal a11 = d11;
//		cat c11 = (cat)a11; //형제관계에서도 캐스팅 불가
		
		Object o1 = new dog(); //dog type을 object로
		dog ddd = (dog) o1; // 
		ddd.bark();
		ddd.breath();
		
	}
}
