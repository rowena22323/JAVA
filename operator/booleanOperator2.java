package proj_J;

public class booleanOperator2 {

	public static void main(String[] args) {
		/* ('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z') */
		
		int x = 0;
		char ch = ' ';
		
		x=15;
		System.out.printf("x=%2d, 10< x && x<20 = %b%n", x, 10 < x && x < 20); 
		//x�� 10���� ũ�� 20���� �۴�.
		x=6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x&&6!=0 = %b%n", x, x%2==0 || x%3==0 && x%6!=0);
		//x�� 2�� ��� �Ǵ� 3�� ����̴�. 
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x&&6!=0 = %b%n", x, (x%2==0 || x%3==0) && x%6!=0);
		//x�� 2�� ��� �Ǵ� 3�� ������� 6�� ����� �ƴϴ�.
		
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n", ch, '0'<=ch && ch<='9');
		//���� ch�� ���� ('0'~'9')�̴�
		
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a'<=ch && ch<='z');
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A'<=ch && ch<='Z');
		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q'||ch=='Q');
		//���� ch�� �빮�� �Ǵ� �ҹ����̴�
		
		/* short circuit evaluation 
		 * x�� ���̸� x||y�� �׻� ���̴�. - �������� ���� Ȯ���� ���� �ǿ����ڸ� �������� ���ʿ� ������ �� ���� �������� ���� �� �ִ�.
		 * x�� �����̸� x&&y�� �׻� �����̴�.*/
		int a=5, b=0;
		
		System.out.printf("a=%d, b =%d%n", a, b);
		System.out.printf("a!=0||++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b =%d%n", a, b); //������ ó���Ǹ� b�� ���� �����ؾ� ������ b=0...
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b =%d%n", a, b); //�������� ���ΰ͸� Ȯ���ߴ�!
	}

}
