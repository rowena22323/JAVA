package capsul;

public class classTest3 {
	public static void main(String[]args) {
		dog d = new dog();
		d.breath();;
		d.bark();;
		cat c = new cat();
		c.breath();
		c.mew();
		//������� �׳� �Ӽ� �ҷ�����
		
		animal a=d; //dog�� ��ü d�� animal Ŭ������ a�� ���� 
		a.breath(); //dog object, animal type 
		dog d2 = (dog) a; // ����Ÿ�� �Ͻ��� ĳ���� : a�� breath�ۿ� �ȵƾ��µ�!!
		d2.bark(); //bark�� �ȴٴ�!
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
//		dog d10 = (dog)a10; //�����Ӽ��� ������ü���� ������ ���� ����
		
//		dog d11 = new dog();
//		animal a11 = d11;
//		cat c11 = (cat)a11; //�������迡���� ĳ���� �Ұ�
		
		Object o1 = new dog(); //dog type�� object��
		dog ddd = (dog) o1; // 
		ddd.bark();
		ddd.breath();
		
	}
}
