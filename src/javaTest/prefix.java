package javaTest;

public class prefix {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		
		int a = 1;
		System.out.println(a);
		int b = a++;
		System.out.println(b); //a+1�� �ϰ��ִ� ��
		System.out.println(a); //postfix �ٽ� �� ȣ�� �� �������� ����Ѵ�.
		
		int a1=1;
		System.out.println(a1);
		int b1=++a1;
		System.out.println(b1); //prefix b1�� �̹� ���ϱ� 1�� �� ����

		/* ��ġ ��ġ�� ����  - �ܿ��Ѱ�*/
		int d=25;
		System.out.println(d++);
		System.out.println(++d); //������ ����� �̽�ĥ�ΰ��̴�!!!!!!!!!
		// dȣ����� 26�� ��ġ�� ���ϱ� 1 �߰��ؼ� �̽ʯU :-)
	}

}
