package proj_J;

import java.util.*;
public class flowEx11 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요 (000000-0000000)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo=scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
					case'1':
						System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
						break;
					case'3':
						System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				}
				break;
			case '2': case '4':
				switch(gender) {
					case'2':
						System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
						break;
					case'4':
						System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
						break;
				}
				break;
		default:
			System.out.println("유효하지 않은 주민등록번호 입니다.");
		// 주민번호 전체의 유효성을 파악하려면 어떻게 해야하지? - 입력문자열 중 index(7)의 문자만 판별하고 있다. 
		}

	}
		
}
