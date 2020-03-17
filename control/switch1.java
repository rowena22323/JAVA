package proj_J;

import java.util.*;
public class switch1 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); //화면을 통해 입력받은 숫자 저장
		int com = (int)(Math.random()*3)+1;
		/* 0.0<=Math.random()<1.0 
		 * 각 변에 3을 곱한 뒤 int형으로 변환하고 1을 더하면 1~3까지의 정수 포함*/
		
		System.out.println("당신은"+user+"입니다");
		System.out.println("컴퓨터는"+com+"입니다");
		
		switch(user-com) {
		/*switch문
		 * 1- 조건식을 계산한다 > 조건식의 결과와 일치하는 case문으로 이동
		 * 2- case문의 실행문 수헹
		 * 3- break이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
		 * default : 조건식의 결과와 일치하는 case문이 없을때 수행 (=else) */
		case 2: case-1:
			/* switch문 제약조건
			 * 1) switch문의 조건식 결과는 정수 또는 문자열이어야 한다
			 * 2) case문의 값은 정수 상수만 가능하며, 중복되지 않아야 한다
			 */
			System.out.println("당신이 졌습니다");
			break; 
			//break문은 각 case문의 영역을 구분하는 역할! 빼먹으면 결과 전체가 실행된다.
		case 1: case-2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			break;
		}

	}

}
