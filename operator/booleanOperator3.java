package proj_J;

public class booleanOperator3 {

	public static void main(String[] args) {
		
		int x = 0xAB, y = 0xF;
		
		/* ��Ʈ ������ �ǽ� - |, &, ^ */
		System.out.printf("x = %#X \t\t %s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t %s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t %s%n", x, y, x|y, toBinaryString(x|y)); // �� ��Ʈ�� 0�϶��� 0
		System.out.printf("%#X & %#X = %#X \t %s%n", x, y, x&y, toBinaryString(x&y)); // �� ��Ʈ�� 1�϶��� 1
		System.out.printf("%#X ^ %#X = %#X \t %s%n", x, y, x^y, toBinaryString(x^y)); // �� ��Ʈ�� ���� �ٸ����� 1
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, x ^ y ^ y, toBinaryString(x ^ y ^ y)); // ������ ���̷�¡...
		
	}//main�� ��
	
	static String toBinaryString (int x) { //10�� ������ 2������ ��ȯ�ϴ� �޼���
		String zero = "00000000000000000000000000000000"; //0���� 32�ڸ�(4byte)ä���
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
static class booleanoperator3a {
	static String toBinaryString (int x) { //10�� ������ 2������ ��ȯ�ϴ� �޼���
		String zero = "00000000000000000000000000000000"; //0���� 32�ڸ�(4byte)ä���
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
		
	public static void main(String[]args) {
		/* ����Ʈ ������ */
		int dec=8;
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 0, dec>>0, toBinaryString(dec>>0));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 1, dec>>1, toBinaryString(dec>>1));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 2, dec>>2, toBinaryString(dec>>2));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 0, dec<<0, toBinaryString(dec<<0));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 1, dec<<1, toBinaryString(dec<<1));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 2, dec<<2, toBinaryString(dec<<2));
		System.out.println();

		dec = -8;
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 0, dec>>0, toBinaryString(dec>>0));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 1, dec>>1, toBinaryString(dec>>1));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 2, dec>>2, toBinaryString(dec>>2));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 0, dec<<0, toBinaryString(dec<<0));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 1, dec<<1, toBinaryString(dec<<1));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 2, dec<<2, toBinaryString(dec<<2));
		System.out.println();
	}
		
}
}



