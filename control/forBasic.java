package javaTest;

public class forBasic {

	public static void main(String[] args) {
	
		int num=1;
		int sum=0;
		while (sum<=10) {
			num++;
			sum=num+sum;
		}
		
		int b=1; //������ ���� 1�� �ʱ�ȭ
		int sum1=0; //�������� ���� ���� sum����
		while(b<=10) {
			sum1=sum1+b; //������
			System.out.println("������:"+sum1+" ������:"+b); //�������� ���� �����ϱ� ���� ��´�.
			b++; //�� ����
		}

		int sum2=0;
		for (int i=1;i<=10;i++) {
			sum2=i+sum2;
		}
		System.out.println(sum2); //���հ�� for�� �ۿ� �ѹ��� �����
	}
}
