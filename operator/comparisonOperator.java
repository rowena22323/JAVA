package proj_J;

public class comparisonOperator {

	public static void main(String[] args) {
		
		/* �� �����ڵ� ���� �������̹Ƿ� ������ �����ϱ� ���� ����ȯ�� ���� 
		 * �� �ǿ������� Ÿ���� ���� ���� ���� �ǿ����ڸ� ���Ѵ�. 
		 * �񱳿�����(���ڿ�) : ������ ������������ �� */
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f); // �Ǽ����� �ٻ簪���� ����ǹǷ� ���� �߻�
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
		
		/* ���ڿ��� (������ ������) �� - equals() */
		String str1 = "abc";
		String str2 = new String ("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc"); //str2 ��ü�� ���� �ٸ���.
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // equals() ��ü�� �޶� ������ ������ true
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // ��ҹ��� ���� ����
	}

}
