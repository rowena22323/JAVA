package proj_J;

import java.util.*;
public class flowEx25 {
	public static void main(String[] args) {
		int num=0, sum=0;
		System.out.print("���ڸ� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num=Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;
		}
		System.out.println("�� �ڸ����� ��:"+sum);
	}

}
