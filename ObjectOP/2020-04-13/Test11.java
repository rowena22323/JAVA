package Test1;

public class Test11{
	int add(int a, int b) { //�Լ�Ÿ�� (�Լ��� �Ķ���� Ÿ�԰� ����) Ŭ��������
		int reult = a+b; //�޼ҵ��ϳ� ����ϳ� void�� ��� �ȵ�
		return reult; //returnŸ���� �޼ҵ�� �����ϰ� ������
	}
	int sub(int a, int b) {
		int result = a-b;
		return result;
	}
	int product (int a, int b, int c) { //�����ֵ�
		int result = a*b*c;
		return result;
	}
	
	public static void main(String[]args) {
		Test11 clac = new Test11();
		int a = 1;
		int b = 2;
		int c = 3;
		int result = clac.add(a, b); //�ν��Ͻ�����
		System.out.println(result); //
		
		int reult = clac.sub(a, b);
		System.out.println(reult);
		
		int answer = clac.product(a, b, c);
		System.out.println(answer);
		
	}
}