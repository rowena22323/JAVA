package controlFlow;

public class switchB {

	public static void main(String[] args) {
		int num = 7;
		switch(num) { //해당 범위 내에서 선택. 입력값과 case값 비교
		case 10:
			System.out.println("수");
			break; //선택 case 실행 후 종료
		case 9:
			System.out.println("우");
			break;
		case 8:
			System.out.println("미");
			break;
		default:
			System.out.println("공부를 열심히 하자!");
		}
		
		if (num>9) {
			System.out.println("수");
		} else if (num>8) {
			System.out.println("우");
			}else if(num>7) {
				System.out.println("미");
				}else {
					System.out.println("공부를 열심히 하자!");
					}
			}

	}



