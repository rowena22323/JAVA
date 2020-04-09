package controlFlow;

public class condOp {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c =(a>b)?a:b; // condition ? true : false 
		System.out.println(c);
		
		if(a>b) {
			System.out.printf("c=a : "+c);
		}else {
			System.out.printf("c=b : "+c);
		}

	}

}
