package controlFlow;

import java.io.IOException;

public class IEbasic {

	public static void main(String[] args) throws IOException {
//		int n1 = 5;
//		int n2 = 7;
//		
//		if(n1>n2) {
//			System.out.println("n1 is bigger than n2");
//		}
//		
//		if (n1==n2) {
//			System.out.println("n1 == n2");
//		} else {
//			System.out.println("n1 and n2 are not same");
//		}
//		
		java.util.Scanner scan = new java.util.Scanner (System.in);
		System.out.print("name:");
		String name = scan.nextLine();
		System.out.println(name);
		
		if (name.equals("������")) { //string�� '=='���� �񱳸���. ����Ÿ��(�޸� �ּҸ���)
			System.out.println(name+ "�Դϴ�.");
		} else if(name.equals("ȫ�浿")) {
			System.out.println(name+"�Դϴ�.");
		} else {
			System.out.println("�������� ȫ�浿�� �ƴմϴ�. ��������?");
		}
	}

}
