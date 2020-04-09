package proj_J;

public class control1 {

	public static void main(String[] args) {
		int x=0;
		System.out.printf("x=%d일때 참인 것은%n", x);
		
		/* 조건식의 결과는 반드시 T/F! */
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if (!(x==0)) System.out.println("!(x==0)");
		if (!(x!=0)) System.out.println("!(x!=0)");
		
		x=1;
		System.out.printf("x=%d일때 참인 것은%n", x);
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if (!(x==0)) System.out.println("!(x==0)");
		if (!(x!=0)) System.out.println("!(x!=0)");

	}

}
