package proj_J;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���׿����� - ���� : ���������� ���� ��� �������� �������� ���̴� ����*/
		int a=5;
		a++;
		System.out.println(a);
		
		a=5;
		++a;
		System.out.println(a);
		
		/* �ܵ����� ������ ���� ��� �������� ������
		 * ������ - ������ ���� ���� ������Ų �Ŀ� ������ ���� �о�� 
		 * ������ - ������ ���� ���� �о�� �Ŀ� �� ����*/
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; ���� ��, i="+i+",j="+j);
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; ���� ��, i="+i+",j="+j);
		
		/* �޼��� ȣ�⿡ ���������ڰ� ���� �� */
		int ii=5, jj=5;
		System.out.println(ii++);
		System.out.println(++jj);
		System.out.println("i="+ii+",j="+jj);
		
	}

}
