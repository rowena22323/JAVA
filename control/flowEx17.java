package proj_J;

import java.util.*;
public class flowEx17 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("'*'�� ����� ������ ���� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp);//�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		for(int i=0;i<num;i++) {//��ݺ�
			for(int j=0;j<=i;j++) {//*�Է¹ݺ�
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
