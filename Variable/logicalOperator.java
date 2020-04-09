package javaTest;

public class logicalOperator {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		boolean c = (a==b);
		System.out.println("(a==b) : " + c);
		
		boolean e = false;
		boolean f = true;
		
		boolean g = e&&f;
		boolean gg = e||f;
		boolean ggg = e|f;
		
		System.out.println(g);
		System.out.println(gg);
		System.out.println(ggg);
		
		System.out.println((e&&f)||!(e));
		
		
	}

}
