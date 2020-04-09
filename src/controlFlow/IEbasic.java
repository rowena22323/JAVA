package controlFlow;

import java.io.IOException;

public class IEbasic {

	public static void main(String[] args) throws IOException {
//		int n1 = 5;
//		int n2 = 7;
//		
//		if(n1>n2) {
//			System.out.println("n1 is bigger than n2");
//		}
//		
//		if (n1==n2) {
//			System.out.println("n1 == n2");
//		} else {
//			System.out.println("n1 and n2 are not same");
//		}
//		
		java.util.Scanner scan = new java.util.Scanner (System.in);
		System.out.print("name:");
		String name = scan.nextLine();
		System.out.println(name);
		
		if (name.equals("구지혜")) { //string은 '=='으로 비교못함. 참조타입(메모리 주소만비교)
			System.out.println(name+ "입니다.");
		} else if(name.equals("홍길동")) {
			System.out.println(name+"입니다.");
		} else {
			System.out.println("구지혜도 홍길동도 아닙니다. 누구신지?");
		}
	}

}
