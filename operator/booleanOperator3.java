package proj_J;

public class booleanOperator3 {

	public static void main(String[] args) {
		
		int x = 0xAB, y = 0xF;
		
		/* 비트 연산자 실습 - |, &, ^ */
		System.out.printf("x = %#X \t\t %s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t %s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t %s%n", x, y, x|y, toBinaryString(x|y)); // 두 비트가 0일때만 0
		System.out.printf("%#X & %#X = %#X \t %s%n", x, y, x&y, toBinaryString(x&y)); // 두 비트가 1일때만 1
		System.out.printf("%#X ^ %#X = %#X \t %s%n", x, y, x^y, toBinaryString(x^y)); // 두 비트가 서로 다를때만 1
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, x ^ y ^ y, toBinaryString(x ^ y ^ y)); // 이줄은 왜이러징...
		
	}//main의 끝
	
	static String toBinaryString (int x) { //10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000"; //0으로 32자리(4byte)채우기
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
static class booleanoperator3a {
	static String toBinaryString (int x) { //10진 정수를 2진수로 변환하는 메서드
		String zero = "00000000000000000000000000000000"; //0으로 32자리(4byte)채우기
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
		
	public static void main(String[]args) {
		/* 쉬프트 연산자 */
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



