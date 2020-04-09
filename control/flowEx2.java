package proj_J;

import java.util.*; //Scanner클래스 사용

public class flowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); //입력받은 문자열 (input=tmp)를 숫자로 변환
		
		if(input==0) System.out.println("입력하신 숫자는 0 입니다.");
		//if 블럭 내 문장이 하나뿐일때는 괄호생략, 이어쓰기도 가능! - 그렇지만 감싸는 버릇을 들이자.
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
			
		/* if-else문으로 더 편하게 쓸 수도 이따 ;-)
		if (input==0) {
			System.out.println("입력하신 숫자는 0 입니다."); 조건이 참일때 수행될 문장 (문장뒤엔 반드시 `;`)
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		} A가 참이면 A'가 거짓인 상반된 관계일때만 가능한것이지 두개의 if가 항상 if-else로 변환되는것은 아니다?*/
		}
	}

}
