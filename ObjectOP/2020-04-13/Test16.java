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
		d.open(); // ��ü�� �ٲ� �������̵�� �޼ҵ尡 ����� ������ �� �ֵ��� �ϴ�
				   // ǥ���������̽� �ۼ�
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
