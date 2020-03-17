package proj_J;

import java.util.*;
public class flowEx4 {

	public static void main(String[] args) {
		/* if - else if ��
		 * if(���ǽ�1){
		 * 		���ǽ�1�� �������� ���϶� ���๮
		 * } else if(���ǽ�2){
		 * 		���ǽ�2�� �������� ���϶� ���๮
		 * } else if(���ǽ�3){
		 * 		���ǽ�3�� �������� ���϶� ���๮
		 * } else{
		 * 		���ǽ� 1, 2, 3 ��ü�� �������� ���� �� ���๮ (else ���� ���� ����)
		 * }*/

		int score = 0;
		char grade = ' ';
		
		System.out.print("������ �Է��ϼ��� >");
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
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}

}

class flowEx5{
	public static void main(String[]args) {
		int score=0;
		char grade = ' ', opt = '0'; //' 'space �������� �ʱ�ȭ!
		
		System.out.print("������ �Է��� �ּ���>");
		
		try (Scanner scanner = new Scanner(System.in)) {
			score = scanner.nextInt();
		}
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if(score>=90) { //(���ǽ�1)
			grade='A';
			if(score>=98) { // nested if (���ǽ�2) : ���ǽ�1�� ���ǽ�2�� ��� true�϶� ����
				opt='+';
			}else if(score<94) { //���ǽ�1�� T, ���ǽ�2�� F�϶�
				opt='-';
			}
		}else if(score>=80) { //if - else if
			grade = 'B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}
		}else { // if-else : ��� ���ǽ��� ���� �����϶�
			grade='C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade,opt);
	}
}
