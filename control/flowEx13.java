package proj_J;

public class flowEx13 {

	public static void main(String[] args) {
		int sum = 0; //�հ踦 �����ϱ� ���� ����
		
		/* for (�ʱ�ȭ;���ǽ�;������) {
		 * 		//���ǽ��� ���϶� ����� ����
		 * 		�ݺ�Ƚ���� �˰����� �� ����Ѵ�.
		 * }*/
		
		for (int i=1; i<=10; i++) {
			sum +=i; // sum = sum+i;
			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
		}

	}//main�� ��

}

class flowEx14 {
	public static void main(String[] args) {
		for (int a=1, b=10; a<=10; a++,b--) {
			System.out.printf("%d \t %d%n", a, b);
		}
	}
}
