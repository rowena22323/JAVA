
public class git {
	public static void main(String[] args) {
		/* ������ ���� */
		System.out.println("6+3"); // " "���� ������ ���ڿ�
		System.out.println(6+3); //��Ģ������ ����
		int x=6, y=3; //��������
		System.out.println(x+y); //��������, ����
		
		/* ���� ���� �ٲٱ� */
		int a=5, b=50;
		int tmp; // �� ���� �ӽ� ���� tmp�� �غ��ص���
		tmp=a;
		a=b;
		b=tmp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("tmp = "+tmp);
    
                /* �������� �ʱ�ȭ  */
		final int score = 100; //����� ����� ���ÿ� �ʱ�ȭ �սô�.
//		score=200; score�� ����� ���������Ƿ� ��� ���� ���� score=200;�� ����
		System.out.println(score);
		
		/* type mismatch error */
		boolean power = true;
//		boolean power = 10; boolean ���ͷ��� true/false��
		byte by = -125;
//		byte b = 128; byte Ÿ���� ������ -128~127����
		System.out.println(power);
		System.out.println(by);
		
		/* 8����(0)�� 16����(0x) */
		int oct = 010;
		int hex = 0x10;
		System.out.println(oct); //println()�� ����� n������ 10������ ���
		System.out.println(hex);
		
		/* ���� ���ͷ� - out of range */
		long l = 10_000_000_000L; 
//		long l = 10_000_000_000; 20���� �Ѵ� ������ Ÿ���� longŸ�� ���̻� L�� ���δ�
		float f = 3.14f;
//		float f = 3.14; can't convert from double to float
		double d = 3.14f; //float < double
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		/* �Ǽ��� ������ ����غ��� - ���̻�� ��� �ȵ�*/
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);

		/* ���ڿ� ���ڿ� */
		char ch = 'A'; //Ȭ����ǥ �ȿ��� �ݵ�� �ϳ��� ����!
		int i = 'A'; // ���� i���� ����'A'�� �����ڵ�(����)�� �����
		System.out.println(ch);
		System.out.println(i); //65
		
		String str1 = "";//String�� ���ڿ� ���
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;
		System.out.println(str1);
		System.out.println(str4);
		
		/* ���ڿ��� �̽��׸� */
		System.out.println(""+7+7); //���ڿ�+any type = ���ڿ�
		System.out.println(7+7+""); //������� ���� > ������
		
	}

}
