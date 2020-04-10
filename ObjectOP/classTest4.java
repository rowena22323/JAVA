package capsul;

public class classTest4 {
	public static void main(String [] args) {
		dog d = new dog();
		d.breath();
		
		animal a = new dog();
		a.breath();
		test(a);
		
	}
	
	static void test (animal a) { //다형성 : 동일한 특성을 호출하더라도 다른 특성을 나타낸다
		a.breath();
	}

}
