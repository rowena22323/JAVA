package proj_J;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		/* 사칙연산자 */
		int a = 10, b = 4;
		
		System.out.printf("%d / %d = %d%n",a,b,a/b); // int type은 소수점 이하는 버리고 저장.
		System.out.printf("%d / %f = %f%n",a,(float)b, a/(float)b); // int>float 형변환
		
		/* conversion, casting
		 * 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 때는 자동으로 형변환이 되지만
		 * 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 형변환 연산자를 사용해서 변환해 주어야 한다.*/
		
		byte a1 = 10;
		byte b1 = 30;
		byte c1 = (byte)(a1*b1); // c1=a1*b1대신 a1*b1의 값을 byte형으로 직접 변경해야 컴파일 에러가 발생하지 않는다.
		
		System.out.println(c1); // 기대 결과값인 300이 아닌 44! > byte형(1byte) 자료의 범위는 -128 ~ 127까지임. 
		
		long a2 = 1_000_000 * 1_000_000;
		long b2 = 1_000_000 * 1_000_000L;
		
		System.out.println("a2="+a2); //연산결과가 int타입의 최대값 초과! > overflow발생
		System.out.println("b2="+b2); //int*long연산
		
		/* 문자도 가능한 연산! */
		char a3 = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		/* 문자는 해당 문자의 유니코드로 바뀌어 저장되므로 문자간의 사칙연산도 정수연산과 동일 */
		System.out.printf("'%c'-'%c'=%d%n", d, a3, d-a3);
		System.out.printf("'%c'-'%c'=%d%n", two, zero, two-zero);
		System.out.printf("'%c'=%d%n", a3, (int)a3);
		System.out.printf("'%c'=%d%n", d, (int)d);
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two, (int)two);
		
		/* 문자의 컴파일 */
		char c2 = 'a';
//		char c3 = c2+1; 컴파일 에러 발생
		char c3 = 'a'+1; // 리터럴간의 연산: 실행과정동안 변하는 값이 아니기 때문에 컴파일러가 계산.'a'대신 변수가 들어간다면 형변환.
		
		/* 나눗셈 */
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000) / 1000f;
		/* 3141.592f > 3141 > 3141.0f > 3.141f  계산결과 도출과정 106p.*/ 
		System.out.println(shortPi);
		
		double pii = 3.141592;
		double shortPii = Math.round(pii*1000) / 1000.0; //Math.round메서드 : 소수점 첫째자리 반올림
		System.out.println(shortPii);
		
		/* 몫과 나머지 */
		int x=10, y=8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x/y, x%y);
		
	}

}
