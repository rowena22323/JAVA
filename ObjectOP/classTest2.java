package capsul;

public class classTest2 {

	public static void main (String[]args) {
		dog d = new dog(); //-9
		animal a=d; //type ����Ÿ���� ����Ÿ�������� ����ȯ -99
		a.breath(); //���ѵ� converting
		dog d1 = (dog)a;
		d1.bark();
		
		animal a1 = new cat(); //-9&-99������ breath�� ��ӹ��� �� ����
		a1.breath();
		
		animal all = test3(new dog());
		dog d2 = (dog) all;
		d2.bark(); // ����Ŭ�����ۿ� �ȳ����� Ÿ���̾��µ� dog�Ӽ����� �ٹ޾ƿԱ���
	}
	static animal test3(animal a) {
		//�޼ҵ� �ϳ��� ����Ŭ���� ���� �޾Ƽ� ���ϴ� Ÿ������ ĳ���� ����
		//���� Ŭ�������� 
		return new dog(); //��ü�� dog�ε� Ÿ���� animal
	}
}
