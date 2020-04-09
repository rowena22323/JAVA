package proj_J;

public class booleanOperator2 {

	public static void main(String[] args) {
		/* ('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z') */
		
		int x = 0;
		char ch = ' ';
		
		x=15;
		System.out.printf("x=%2d, 10< x && x<20 = %b%n", x, 10 < x && x < 20); 
		//x는 10보다 크고 20보다 작다.
		x=6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x&&6!=0 = %b%n", x, x%2==0 || x%3==0 && x%6!=0);
		//x는 2의 배수 또는 3의 배수이다. 
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x&&6!=0 = %b%n", x, (x%2==0 || x%3==0) && x%6!=0);
		//x는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.
		
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n", ch, '0'<=ch && ch<='9');
		//문자 ch는 숫자 ('0'~'9')이다
		
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a'<=ch && ch<='z');
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A'<=ch && ch<='Z');
		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q'||ch=='Q');
		//문자 ch는 대문자 또는 소문자이다
		
		/* short circuit evaluation 
		 * x가 참이면 x||y는 항상 참이다. - 연산결과가 참일 확률이 높은 피연산자를 연산자의 왼쪽에 놓으면 더 빠른 연산결과를 얻을 수 있다.
		 * x가 거짓이면 x&&y는 항상 거짓이다.*/
		int a=5, b=0;
		
		System.out.printf("a=%d, b =%d%n", a, b);
		System.out.printf("a!=0||++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b =%d%n", a, b); //연산이 처리되면 b의 값이 증가해야 하지만 b=0...
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b =%d%n", a, b); //연산결과가 참인것만 확인했다!
	}

}
