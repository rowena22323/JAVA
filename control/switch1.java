package proj_J;

import java.util.*;
public class switch1 {

	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ��� > ");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���� ����
		int com = (int)(Math.random()*3)+1;
		/* 0.0<=Math.random()<1.0 
		 * �� ���� 3�� ���� �� int������ ��ȯ�ϰ� 1�� ���ϸ� 1~3������ ���� ����*/
		
		System.out.println("�����"+user+"�Դϴ�");
		System.out.println("��ǻ�ʹ�"+com+"�Դϴ�");
		
		switch(user-com) {
		/*switch��
		 * 1- ���ǽ��� ����Ѵ� > ���ǽ��� ����� ��ġ�ϴ� case������ �̵�
		 * 2- case���� ���๮ ����
		 * 3- break�̳� switch���� ���� ������ switch�� ��ü�� ����������.
		 * default : ���ǽ��� ����� ��ġ�ϴ� case���� ������ ���� (=else) */
		case 2: case-1:
			/* switch�� ��������
			 * 1) switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ�
			 * 2) case���� ���� ���� ����� �����ϸ�, �ߺ����� �ʾƾ� �Ѵ�
			 */
			System.out.println("����� �����ϴ�");
			break; 
			//break���� �� case���� ������ �����ϴ� ����! �������� ��� ��ü�� ����ȴ�.
		case 1: case-2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
			break;
		}

	}

}
