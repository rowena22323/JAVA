package capsul;

public class classTest4 {
	public static void main(String [] args) {
		dog d = new dog();
		d.breath();
		
		animal a = new dog();
		a.breath();
		test(a);
		
	}
	
	static void test (animal a) { //������ : ������ Ư���� ȣ���ϴ��� �ٸ� Ư���� ��Ÿ����
		a.breath();
	}

}
