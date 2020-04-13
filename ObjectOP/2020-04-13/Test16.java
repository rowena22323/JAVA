package Test3;



class Data{
	void open() {System.out.println("Database open");}
}
class Excel extends Data {
	void open() {System.out.println("Excel open");}
}
class Word extends Data{
	void open() {System.out.println("Word open");}
}
class TestModule{
	public void testMethod() {
		Data d = new Word();
		d.open(); // 객체가 바뀌어도 오버라이드된 메소드가 기능을 유지할 수 있도록 하는
				   // 표준인터페이스 작성
	}
}

//public class Test16 {
//	public static void main(String[]args) {
//		Excel e = new Excel();
//		e.open();
//		
//	}
//
//}
