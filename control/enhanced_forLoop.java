package proj_J;

public class enhanced_forLoop {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for (int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		/* for(Ÿ�� ������ : �迭 �Ǵ� �÷���){
		 * 		//�ݺ��� ����
		 * }*/
		for (int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp; // sum = sum+tmp : tmp�� �о���� �迭 ����� �� ����
		} // �Ϲ����� for���� �޸� �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ����� �� �ִ�.
		System.out.println();
		System.out.println("sum="+sum);
	}
}
