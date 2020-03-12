package proj_J;

public class comparisonOperator {

	public static void main(String[] args) {
		
		/* 비교 연산자도 이항 연산자이므로 연산을 수행하기 전에 형변환을 통해 
		 * 두 피연산자의 타입을 같게 맞춘 다음 피연산자를 비교한다. 
		 * 비교연산자(문자열) : 완전히 같은것인지만 비교 */
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f); // 실수형은 근사값으로 저장되므로 오차 발생
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
		
		/* 문자열의 (내용이 같은지) 비교 - equals() */
		String str1 = "abc";
		String str2 = new String ("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc"); //str2 객체는 서로 다르다.
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // equals() 객체가 달라도 내용이 같으면 true
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // 대소문자 구분 무시
	}

}
