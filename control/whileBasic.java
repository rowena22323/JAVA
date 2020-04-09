package javaTest;

public class whileBasic {

	public static void main(String[] args) {
		int a=1; //while 초기화 
		while (a<10) { //여기서 후치증가값으로 판단
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
