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
		System.out.println(b); //a+1을 하고있는 중
		System.out.println(a); //postfix 다시 재 호출 시 증가값을 출력한다.
		
		int a1=1;
		System.out.println(a1);
		int b1=++a1;
		System.out.println(b1); //prefix b1은 이미 더하기 1이 된 상태

		/* 전치 후치의 정수  - 외워둘것*/
		int d=25;
		System.out.println(d++);
		System.out.println(++d); //이줄의 결과는 이십칠인것이다!!!!!!!!!
		// d호출시점 26에 전치의 더하기 1 추가해서 이십칄 :-)
	}

}
