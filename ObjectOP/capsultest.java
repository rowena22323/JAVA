package capsul;

public class capsultest {
	public static void main(String[]args) {
		animal a = new animal();
		a.breath(); //���� Ŭ����!
		
		dog d = new dog(); //animal�� ���� dogŬ����
		d.breath(); //���� animal�� breath�Ӽ��� �����޾���!
		d.bark(); //dog �����Ӽ� a.������ �ȳ��´�
		
		cat c = new cat();
		c.breath();
		c.mew();
	}
}
