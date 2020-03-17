package proj_J;

import java.util.*;
public class flowEx4 {

	public static void main(String[] args) {
		/* if - else if 문
		 * if(조건식1){
		 * 		조건식1의 연산결과가 참일때 수행문
		 * } else if(조건식2){
		 * 		조건식2의 연산결과가 참일때 수행문
		 * } else if(조건식3){
		 * 		조건식3의 연산결과가 참일때 수행문
		 * } else{
		 * 		조건식 1, 2, 3 전체를 만족하지 않을 때 수행문 (else 블럭은 생략 가능)
		 * }*/

		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score>=90) {
			grade='A';
		}else if(score>=80) { // same with score>=80 && score<90
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else {
			grade='D';
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}

class flowEx5{
	public static void main(String[]args) {
		int score=0;
		char grade = ' ', opt = '0'; //' 'space 공백으로 초기화!
		
		System.out.print("점수를 입력해 주세요>");
		
		try (Scanner scanner = new Scanner(System.in)) {
			score = scanner.nextInt();
		}
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score>=90) { //(조건식1)
			grade='A';
			if(score>=98) { // nested if (조건식2) : 조건식1과 조건식2가 모두 true일때 수행
				opt='+';
			}else if(score<94) { //조건식1은 T, 조건식2는 F일때
				opt='-';
			}
		}else if(score>=80) { //if - else if
			grade = 'B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}
		}else { // if-else : 상기 조건식이 전부 거짓일때
			grade='C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade,opt);
	}
}
