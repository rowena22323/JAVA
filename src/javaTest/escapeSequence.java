package javaTest;

public class escapeSequence {
	public static void main(String[]args) {
		String msg2 = "Hello my name is kate";
		System.out.println(msg2);
		
		String msg3 = "Hello my name is \n kate";
		System.out.println(msg3);
		
	    System.out.println("AB"+'\b'+'C');
	    System.out.println("AB"+'\t'+'C');
	    System.out.println("AB"+'\n'+'C');
	    System.out.println("AB"+'\r'+'C');
	}

}
