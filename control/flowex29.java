package proj_J;

public class flowex29 {

	public static void main(String[] args) {
		for (int i=1;i<=100;i++) { //int 1~100���� 1�� �����ϸ鼭 ���
			System.out.printf("i=%d", i);
			
			int tmp=i; //���� i�� tmp�� ����
			
			do {
				if (tmp%10%3==0 && tmp%10!=0) // tmp%10�� 3�� ������� Ȯ��(0����)
					
					/* �� ���� tmp%10�� ���� 0�϶��� ���̹Ƿ� �� tmp%10!=0�� &&���� �����ؼ�
					 * tmp%10�� ���� 0�� ��츦 �����Ѵ�.*/
					
					System.out.print("¦!"); //'print'�̹Ƿ� ��¹� ���� (���η�) ¦! ���
			} while((tmp/=10)!=0); //(tmp/=10) == (tmp=tmp/10)
			
			System.out.println(); // ����
		}

	}//main

}
