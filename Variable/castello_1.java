
public class git {
	public static void main(String[] args) {
		/* 변수야 놀자 */
		System.out.println("6+3"); // " "안의 내용은 문자열
		System.out.println(6+3); //사칙연산은 가능
		int x=6, y=3; //변수선언
		System.out.println(x+y); //변수대입, 실행
		
		/* 변수 서로 바꾸기 */
		int a=5, b=50;
		int tmp; // 값 없는 임시 변수 tmp를 준비해두자
		tmp=a;
		a=b;
		b=tmp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("tmp = "+tmp);
    
                /* 상수선언과 초기화  */
		final int score = 100; //상수는 선언과 동시에 초기화 합시다.
//		score=200; score를 상수로 지정했으므로 상수 지정 뒤의 score=200;은 에러
		System.out.println(score);
		
		/* type mismatch error */
		boolean power = true;
//		boolean power = 10; boolean 리터럴은 true/false뿐
		byte by = -125;
//		byte b = 128; byte 타입의 변수는 -128~127사이
		System.out.println(power);
		System.out.println(by);
		
		/* 8진수(0)와 16진수(0x) */
		int oct = 010;
		int hex = 0x10;
		System.out.println(oct); //println()은 저장된 n진수를 10진수로 출력
		System.out.println(hex);
		
		/* 숫자 리터럴 - out of range */
		long l = 10_000_000_000L; 
//		long l = 10_000_000_000; 20억이 넘는 정수형 타입은 long타입 접미사 L을 붙인다
		float f = 3.14f;
//		float f = 3.14; can't convert from double to float
		double d = 3.14f; //float < double
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		/* 실수형 정수값 출력해보기 - 접미사는 출력 안됨*/
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);

		/* 문자와 문자열 */
		char ch = 'A'; //홑따옴표 안에는 반드시 하나의 문자!
		int i = 'A'; // 변수 i에는 문자'A'의 문자코드(숫자)가 저장됨
		System.out.println(ch);
		System.out.println(i); //65
		
		String str1 = "";//String만 빈문자열 허용
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;
		System.out.println(str1);
		System.out.println(str4);
		
		/* 빈문자열의 미스테리 */
		System.out.println(""+7+7); //문자열+any type = 문자열
		System.out.println(7+7+""); //연산방향 왼쪽 > 오른쪽
		
	}

}
