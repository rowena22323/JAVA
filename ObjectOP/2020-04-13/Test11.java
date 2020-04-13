package Test1;

public class Test11{
	int add(int a, int b) { //함수타입 (함수의 파라미터 타입과 정보) 클래스변수
		int reult = a+b; //메소드하나 출력하나 void는 출력 안됨
		return reult; //return타입은 메소드와 동일하게 맞춰줘
	}
	int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	int product (int a, int b, int c) { //오버롸딩
		int result = a*b*c;
		return result;
	}
	
	public static void main(String[]args) {
		Test11 clac = new Test11();
		int a = 1;
		int b = 2;
		int c = 3;
		int result = clac.add(a, b); //인스턴스변수
		System.out.println(result); //
		
		int reult = clac.sub(a, b);
		System.out.println(reult);
		
		int answer = clac.product(a, b, c);
		System.out.println(answer);
		
	}
}