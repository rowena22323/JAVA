package javaTest;

public class whileBasic {

	public static void main(String[] args) {
		int a=1; //while �ʱ�ȭ 
		while (a<10) { //���⼭ ��ġ���������� �Ǵ�
			System.out.println(a); 
			a++;
			
		/*do-while*/
		System.out.println();
		do {
			System.out.println(a);
			a++;
		}while(a<10);
}
	}
}
