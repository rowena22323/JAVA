package proj_J;

public class control1 {

	public static void main(String[] args) {
		int x=0;
		System.out.printf("x=%d�϶� ���� ����%n", x);
		
		/* ���ǽ��� ����� �ݵ�� T/F! */
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if (!(x==0)) System.out.println("!(x==0)");
		if (!(x!=0)) System.out.println("!(x!=0)");
		
		x=1;
		System.out.printf("x=%d�϶� ���� ����%n", x);
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if (!(x==0)) System.out.println("!(x==0)");
		if (!(x!=0)) System.out.println("!(x!=0)");

	}

}