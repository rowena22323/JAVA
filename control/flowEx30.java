package proj_J;

public class flowEx30 {

	public static void main(String[] args) {
		int sum=0, i=0;
		
		while(true) { //���ѹݺ����� ���ǹ��� break�� �Բ� ���ȴ�!
			if(sum>100)
				break; //sum>100�ϰ�� ���ǹ� ������
			++i; // �ƴҰ�� i+1 and i+sum �������
			sum += i;
		}
		
		System.out.println("i="+i); // �������. 1~14���� ���ϸ�
		System.out.println("sum="+sum); // 105�� �����鼭 break�� Ÿ�� while���� :>

	}

}
