package proj_J;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		/* ��Ģ������ */
		int a = 10, b = 4;
		
		System.out.printf("%d / %d = %d%n",a,b,a/b); // int type�� �Ҽ��� ���ϴ� ������ ����.
		System.out.printf("%d / %f = %f%n",a,(float)b, a/(float)b); // int>float ����ȯ
		
		/* conversion, casting
		 * ũ�Ⱑ ���� �ڷ����� ������ ū �ڷ����� ������ ������ ���� �ڵ����� ����ȯ�� ������
		 * ū �ڷ����� ���� ���� �ڷ����� ������ �����Ϸ��� ����ȯ �����ڸ� ����ؼ� ��ȯ�� �־�� �Ѵ�.*/
		
		byte a1 = 10;
		byte b1 = 30;
		byte c1 = (byte)(a1*b1); // c1=a1*b1��� a1*b1�� ���� byte������ ���� �����ؾ� ������ ������ �߻����� �ʴ´�.
		
		System.out.println(c1); // ��� ������� 300�� �ƴ� 44! > byte��(1byte) �ڷ��� ������ -128 ~ 127������. 
		
		long a2 = 1_000_000 * 1_000_000;
		long b2 = 1_000_000 * 1_000_000L;
		
		System.out.println("a2="+a2); //�������� intŸ���� �ִ밪 �ʰ�! > overflow�߻�
		System.out.println("b2="+b2); //int*long����
		
		/* ���ڵ� ������ ����! */
		char a3 = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		/* ���ڴ� �ش� ������ �����ڵ�� �ٲ�� ����ǹǷ� ���ڰ��� ��Ģ���굵 ��������� ���� */
		System.out.printf("'%c'-'%c'=%d%n", d, a3, d-a3);
		System.out.printf("'%c'-'%c'=%d%n", two, zero, two-zero);
		System.out.printf("'%c'=%d%n", a3, (int)a3);
		System.out.printf("'%c'=%d%n", d, (int)d);
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two, (int)two);
		
		/* ������ ������ */
		char c2 = 'a';
//		char c3 = c2+1; ������ ���� �߻�
		char c3 = 'a'+1; // ���ͷ����� ����: ����������� ���ϴ� ���� �ƴϱ� ������ �����Ϸ��� ���.'a'��� ������ ���ٸ� ����ȯ.
		
		/* ������ */
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000) / 1000f;
		/* 3141.592f > 3141 > 3141.0f > 3.141f  ����� ������� 106p.*/ 
		System.out.println(shortPi);
		
		double pii = 3.141592;
		double shortPii = Math.round(pii*1000) / 1000.0; //Math.round�޼��� : �Ҽ��� ù°�ڸ� �ݿø�
		System.out.println(shortPii);
		
		/* ��� ������ */
		int x=10, y=8;
		
		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�. %n", x/y, x%y);
		
	}

}
